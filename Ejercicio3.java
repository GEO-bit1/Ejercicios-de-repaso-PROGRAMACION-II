package ejercicio4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num[] = new int[10];
        int contadorde0 = 0, contadordeP = 0, contadordeN = 0;
        System.out.println(" Ingresa los 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el numero: " + i);
            num[i] = leer.nextInt();
            for (int j = 0; j < 10; j++) {
                if (num[j] == 0) {
                    contadorde0++;
                }else if (num[j] < 0) {
                    
                    contadordeN++;
                    
                }else if (num[j] > 0) {
                    contadordeP++;
                    
                }

            }
        }

    }

}
