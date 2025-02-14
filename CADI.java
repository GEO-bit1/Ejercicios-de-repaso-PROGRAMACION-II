package cadi;
import java.util.Scanner;

public class CADI {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] notas = new double[10];

        // Solicitar al usuario las notas
        System.out.println("Ingrese las notas de los 10 alumnos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
        }

        // Variables para los cálculos
        double mayorNota = notas[0];
        double menorNota = notas[0];
        double sumaNotas = 0;
        int posicionMenorNota = 0;
        int aprobados = 0;

        // Recorrer el arreglo para calcular la mayor nota, menor nota, suma y aprobados
        for (int i = 0; i < notas.length; i++) {
            // Mayor nota
            if (notas[i] > mayorNota) {
                mayorNota = notas[i];
            }

            // Menor nota y su posición
            if (notas[i] < menorNota) {
                menorNota = notas[i];
                posicionMenorNota = i;
            }

            // Suma de las notas
            sumaNotas += notas[i];

            // Contar aprobados (nota > 3.0)
            if (notas[i] > 3.0) {
                aprobados++;
            }
        }

        // Promedio de las notas
        double promedio = sumaNotas / notas.length;

        // Porcentaje de aprobados
        double porcentajeAprobados = (aprobados * 100.0) / notas.length;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("La mayor nota es: " + mayorNota);
        System.out.println("El porcentaje de aprobados (nota > 3.0): " + porcentajeAprobados + "%");
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La menor nota es: " + menorNota + " y se encuentra en la posición: " + posicionMenorNota);
    }
}
