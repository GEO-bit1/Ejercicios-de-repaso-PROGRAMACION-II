package javaapplication1;

import java.util.Scanner;

public class Ejercicio_matrices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double[][] NA = new double[5][4];
        System.out.println("Ingrese las notas de los estudiantes");

        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1));

            for (int m = 0; m < 3; m++) {
                System.out.print("Ingrese la " + (m + 1) + " nota del estudiante  ");

                NA[i][m] = leer.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {

            double SN = 0;

            for (int m = 0; m < 3; m++) {

                SN += NA[i][m];
            }

            NA[i][3] = SN / 3;
        }

        System.out.println("Notas de los estudiantes ");

        for (int i = 0; i < 5; i++) {

            System.out.println("Estudiante " + (i + 1) + ": ");

            for (int m = 0; m < 3; m++) {

                System.out.println(NA[i][m]);
            }

            System.out.println("El promedio del estudiante es: " + NA[i][3]);
        }

    }
}
