package vector;

import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Establece la cantidad notas que ingresaras: ");
        int c;
        double suma = 0;
        double Prom = 0;
        c = leer.nextInt();
        double V[] = new double[c];
        System.out.println("Acontinuacion ingresa las notas");
        for (int i = 0; i < c; i++) {
            System.out.println(" Ingresa nota: " + i);
           V[i] = leer.nextDouble();
           suma += V[i];
        }
        
        Salida(V);
        System.out.println(" ¿ Deseas saber el promedio de tus notas ?");
        System.out.println(" 1:SI 0:NO ");
        int respuesta = leer.nextInt();
 
        if (respuesta == 1) {
           
            Promedio(c,suma);
            
        }else{
            System.out.println("Adios");
        }   
            
    }

    public static void Salida(double V[]) {
        System.out.println("Las notas ingresadas fueron: ");
        for (int i = 0; i < V.length; i++) {
            System.out.println("Las notas que ingresaste fueron: " + V[i]);
        }
        

    }

    private static double Promedio( int c, double suma) {
        double Prom = suma/c;
        System.out.println(" El promedio de las notas ingresadas fue: "+ Prom);
        return Prom;
    }

}
