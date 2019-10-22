package com.company;

public class DivisibilidadPor2 {
    float numero = 0;

    public DivisibilidadPor2(float numero){
        this.numero=numero;
    }
    public DivisibilidadPor2(int numero){
        this.numero=numero;
    }

    public String comprobar () {
        if (numero%2==0) {
            return numero + " es divisible por 2";
        }
        else {
            return  numero + " no es divisible por 2";
        }
    }

}
