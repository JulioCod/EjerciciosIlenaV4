package com.company;

public class Mats {
    float numero1 = 0;
    float numero2 = 0;

    public Mats (float numero1, float numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public String resultadoOperaciones () {
        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        return "suma: " + suma + " resta: " + resta + " multiplicacion: " + multiplicacion +" división: " + division;
    }

}
