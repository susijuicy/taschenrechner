package com.example.taschenrechner.Strategy;

public class MultiplizierenRechnen implements IOperand
{

    @Override
    public double rechnen(double a, double b)
    {
        return a*b;
    }
}
