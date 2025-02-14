package multiplicador;

import java.util.Scanner;
//Crear un programa que solicite un numero y con ese numero(multiplicador)
//realice la tabla de multiplicar, debe imprimir el resultado de la multiplicación 
//mostrando el multiplicando, el multiplicador y el resultdo.

public class Multiplicador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Acontinuacion ingresa el numero del cual quieras saber la tabla de multiplicar de 1 a 9");
        int multiplicando, centinela;
        do {
            System.out.println("");
            System.out.print("Ingresa el multiplicando: ");
            multiplicando = leer.nextInt();
            for (int i = 0; i < 10; i++) {

                int resultado = multiplicando * i;
                System.out.println("El resultado de " + multiplicando + " * " + i + " = " + resultado);
            }
            System.out.println(" Deseas tener la tabla de otro multiplicando");
            System.out.println(" Responde: Si = 1 o No = 0");
            System.out.println("");
            System.out.print("Ingresa tu respuesta: ");
            centinela = leer.nextInt();
        } while (centinela == 1);

    }

}
