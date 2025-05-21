package com.example.taschenrechner.Strategy;

public class DividierenRechnen implements IOperand
{

    @Override
    public double rechnen(double a, double b) throws IllegalArgumentException
    {
        if (b == 0)
            throw new IllegalArgumentException("Nicht durch 0 teilen!");
        return a/b;
    }
}
