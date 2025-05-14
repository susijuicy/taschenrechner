package com.example.taschenrechner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label ausgabefeld;
    private int zahl1,  zahl2;

    @FXML
    private Button CE_btn, C_btn, loeschen_btn, dividieren_btn, sieben_btn, acht_btn, neun_btn, multiplizieren_btn, vier_btn, fuenf_btn, sechs_btn, subtrahieren_btn, eins_btn, zwei_btn, drei_btn, addieren_btn, frei, null_btn, komma_btn, ergebnis_btn;



    @FXML
    public void initialize()
    {

    }


    @FXML
    public void onNull()
    {
        //ausgabefeld.setText("0");
        zahl1 = Integer.parseInt(ausgabefeld.setText("0"));
    }

    public void onEins()
    {
        ausgabefeld.setText("1");
    }

    public void onZwei()
    {
        ausgabefeld.setText("2");
    }

    public void onDrei()
    {
        ausgabefeld.setText("3");
    }

    public void onVier()
    {
        ausgabefeld.setText("4");
    }

    public void onFuenf()
    {
        ausgabefeld.setText("5");
    }

    public void onSechs()
    {
        ausgabefeld.setText("6");
    }

    public void onSieben()
    {
        System.out.print("7 wurde gesiebt");
        ausgabefeld.setText("7");
    }

    public void onAcht()
    {
        ausgabefeld.setText("8");
    }

    public void onNeun()
    {
        ausgabefeld.setText("9");
    }

    public void onKomma()
    {
        ausgabefeld.setText(",");
    }

    public void onCE()
    {
    }

    public void onC()
    {
    }

    public void onLoeschen()
    {
    }

    public void onDividieren()
    {

    }

    public void onMultiplizieren()
    {
    }

    public void onSubtrahieren()
    {
    }

    public void onAddieren(int a, int b)
    {
        int c = a+b;
        String result = String.valueOf(c);
        ausgabefeld.setText(result);
    }

    public void onErgebnis()
    {
    }
}