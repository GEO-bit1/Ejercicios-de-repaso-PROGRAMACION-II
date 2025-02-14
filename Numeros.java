package pkg10.numeros;

import java.util.Scanner;
//Realizar un programa que permita ingresar 10 números, el programa debe informar cuantas
//veces se ingresó un número determinado. Ejemplo el 5 se ingresó 4 veces. Además, se debe
//calcular el promedio (entre todos los números ingresados).

public class Numeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        double promedio;
        //El usuario ingresa los 10 numeros para almacenar en el arreglo.
        System.out.println(" Acontinuacion ingresa 10 numeros ");
        for (int i = 0; i < 10; i++) {
            System.out.println(" Ingresa el numero: "+ i);
            numeros[i] = leer.nextInt();
            suma += numeros[i];
        }

        System.out.print(" Los resultados son: ");
        for (int i = 0; i < 10; i++) {
            int veces = 0;
            for (int j = 0; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    veces++;
                }
            }
            System.out.println("El número " + numeros[i] + " se ingresó " + veces + " veces.");
        }

        promedio = suma / 10;
        System.out.println("El promedio de los números ingresados es: " + promedio);

    }
}
