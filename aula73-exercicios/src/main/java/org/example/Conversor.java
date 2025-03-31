package org.example;

public class Conversor {

    public static final double IOF = 0.06;

    public static double converter(double cotacao, double dollar){
        return dollar*cotacao + dollar*cotacao*IOF;
    }
}
