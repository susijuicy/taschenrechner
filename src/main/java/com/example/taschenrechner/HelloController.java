package com.example.taschenrechner;

import com.example.taschenrechner.Strategy.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController
{
    @FXML
    private Label ausgabefeld;
    private double ersteZahl = 0;
    boolean neueEingabe = true;
    private IOperand operand;
    //private String operator = ""; -> für switch-case nötig

    @FXML
    private Button CE_btn, C_btn, loeschen_btn, dividieren_btn, sieben_btn, acht_btn, neun_btn, multiplizieren_btn, vier_btn, fuenf_btn, sechs_btn, subtrahieren_btn, eins_btn, zwei_btn, drei_btn, addieren_btn, frei, null_btn, komma_btn, ergebnis_btn;

    //TODO
    // Button gedrückt -> z.B. Farbe ändern
    // C-Taste implementieren
    // CE-Taste löschen
    // frei-Taste abändern
    // @see -> wie umsetzen in java


//    @FXML
//    public void initialize()
//    {
//
//    }
    // wird eigentlich schon benötigt, aber nicht bei uns (weil wir zu cool sind)

    public void onFrei()
    {
        ausgabefeld.setText("PIERRE");
    }

    @FXML
    public void onNull()
    {
        ausgabefeld.setText(ausgabefeld.getText()+"0");

        System.out.println("0 gedrückt");
    }

    public void onEins()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "1"); // ausgabefeld.getText() speichert
        // die erste eingegebene Zahl -> die initialisierte 0 mit der gedrückten 1
        // erst nachdem ein Rechenoperand gedrückt wurde, wird auch die erste zur Berechnung
        // benötigte Zahl wirklich gespeichert (vorher nur mit ausgabefeld.getText())

        System.out.println("1 gedrückt");
    }

    public void onZwei()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "2");

        System.out.println("2 gedrückt");
    }

    public void onDrei()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "3");

        System.out.println("3 gedrückt");
    }

    public void onVier()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "4");

        System.out.println("4 gedrückt");
    }

    public void onFuenf()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "5");

        System.out.println("5 gedrückt");
    }

    public void onSechs()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "6");

        System.out.println("6 gedrückt");
    }

    public void onSieben()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "7");

        System.out.println("7 gedrückt");
    }

    public void onAcht()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "8");

        System.out.println("8 gedrückt");
    }

    public void onNeun()
    {
        if (neueEingabe)
        {
            ausgabefeld.setText("");
            neueEingabe = false;
        }
        ausgabefeld.setText(ausgabefeld.getText() + "9");

        System.out.println("9 gedrückt");
    }

    public void onKomma()
    {
        if (!ausgabefeld.getText().contains("."))
            {
                ausgabefeld.setText(ausgabefeld.getText() + ".");
            }

        System.out.println("Der Button Punkt wurde gedrückt"); // bei anderen Zahlen auch noch
    }

    public void onCE()
    {
    }

    public void onC()
    {
        ausgabefeld.setText("0");
        ersteZahl = 0;
        neueEingabe = true;
        System.out.println("Pierre ist zurückgesetzt.");
    }

    public void onLoeschen()
    {
    }

    public void onDividieren()
    {
        ersteZahl = Double.parseDouble(ausgabefeld.getText());
        System.out.println(ersteZahl + " wurde gespeichert");

        operand = new DividierenRechnen();
        neueEingabe = true;
    }

    public void onMultiplizieren()
    {
        ersteZahl = Double.parseDouble(ausgabefeld.getText());
        System.out.println(ersteZahl + " wurde gespeichert");

        operand = new MultiplizierenRechnen();
        neueEingabe = true;
    }

    public void onSubtrahieren()
    {
        ersteZahl = Double.parseDouble(ausgabefeld.getText());
        System.out.println(ersteZahl + " wurde gespeichert");

        operand = new MinusRechnen();
        neueEingabe = true;
    }

    public void onAddieren()
    {
        ersteZahl = Double.parseDouble(ausgabefeld.getText());
        System.out.println(ersteZahl + " wurde gespeichert");
        //operator = "addieren"; -> für switch-case nötig

        operand = new PlusRechnen();
        neueEingabe = true;
    }

    public void onErgebnis()
    {
        double zweiteZahl = Double.parseDouble(ausgabefeld.getText());
        System.out.println(zweiteZahl + " wurde gespeichert");

        double ergebnis = operand.rechnen(ersteZahl, zweiteZahl);

        ausgabefeld.setText(String.valueOf(ergebnis));
    }


    // switch-case wäre möglich, aber natürlich habe ich es hier lieber mit Strategy-Pattern gelöst :)
//    public void onErgebnis()
//    {
//        double zweiteZahl = Double.parseDouble(ausgabefeld.getText());
//        double ergebnis = 0;
//
//        switch (operator)
//        {
//            case "addieren":
//                //onAddieren(); -> nicht notwendig, sonst ist die erste Zahl gleich der zweiten Zahl -> dopptelter Aufruf
//                System.out.println(ersteZahl);
//                ergebnis = (ersteZahl+zweiteZahl);
//                System.out.println(zweiteZahl);
//                break;
//        }
//
//        ausgabefeld.setText(String.valueOf(ergebnis));
//        neueEingabe = true;
//    }
}