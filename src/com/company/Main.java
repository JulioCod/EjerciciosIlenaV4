package com.company;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Main {

    public static void main(String[] args) {
	/**/
        float numero1=0;
        float numero2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce en primer número: ");
        numero1 = scanner.nextFloat();
        System.out.println("introduce en segundo número: ");
        numero2 = scanner.nextFloat();
        Mats mats = new Mats(numero1, numero2);
        System.out.print(mats.resultadoOperaciones());
        System.out.println();
/*        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        System.out.printf("suma: %s, resta: %s, multiplicacion: %s, división: %s \n", suma, resta, multiplicacion, division);*/
        if (numero1>=numero2){
            System.out.printf("El mayor es %s", numero1);
        }
        else {
            System.out.printf("El mayor es %s", numero2);
        }
        System.out.println();
        DivisibilidadPor2 divisibilidadPor2n1 = new DivisibilidadPor2(numero1);
        DivisibilidadPor2 divisibilidadPor2n2 = new DivisibilidadPor2(numero2);
        System.out.println();
        System.out.println(divisibilidadPor2n1.comprobar());
        System.out.println(divisibilidadPor2n2.comprobar());



    }
}
