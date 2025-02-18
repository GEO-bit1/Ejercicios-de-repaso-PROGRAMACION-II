package area;
//Calcula el area de las diferente figuras geome

import java.util.Scanner;
import java.lang.Math;

public class Area {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-. ");
        System.out.println(" En es programa podras calcular el area de un ");
        System.out.println(" -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-. ");
        int centinela = 0;
        do {
            System.out.println(" -.-.-.-.-.-.-.-. ");
            System.out.println(" 1: Circulo ");
            System.out.println(" 2: Triangulo ");
            System.out.println(" 3: Cuadrado ");
            System.out.println(" -.-.-.-.-.-.-.-. ");
            int respuesta;

            double AreaCirculo;
            double AreaTriangulo;
            double AreaCuadrado;
            System.out.println(" Selecciona la opcion que quieras calcular");
            respuesta = leer.nextInt();
            switch (respuesta) {
                case 1:
                    AreaCirculo();
                    break;

                case 2:
                    AreaTriangulo();
                    break;

                case 3:
                    AreaCuadrado();
                    break;
            }
            System.out.println("Deseas seguir calculando ¿?");
            System.out.println("Si : 1");
            System.out.println("No : 0");
            centinela = leer.nextInt();
        } while (centinela != 0);

    }

    private static double AreaCirculo() {
        double AreaCirculo;
        System.out.println("Tu eleccion fue: CIRCULO");
        Scanner leer = new Scanner(System.in);
        System.out.print(" Digita el radio de tu circulo: ");
        double Radio = leer.nextDouble();
        AreaCirculo = (Radio * Radio) * Math.PI;
        System.out.println("El area de tu circulo es: " + AreaCirculo);

        return AreaCirculo;
    }

    private static double AreaTriangulo() {
        System.out.println("Tu eleccion fue: TRIANGULO");
        Scanner leer = new Scanner(System.in);
        double AreaTriangulo;
        System.out.print(" Digita la Base de tu triangulo: ");
        double Base = leer.nextDouble();
        System.out.print(" Digita la Altura de tu triangulo: ");
        double Altura = leer.nextDouble();
        AreaTriangulo = (Base * Altura) / 2;
        System.out.println("El area de tu Traingulo es: " + AreaTriangulo);

        return AreaTriangulo;
    }

    private static double AreaCuadrado() {
        System.out.println("Tu eleccion fue: CUADRADO");
        Scanner leer = new Scanner(System.in);
        double AreaCuadrado;
        System.out.print(" Digita un lado del cuadrado: ");
        double Lado = leer.nextDouble();
        AreaCuadrado = (Lado * Lado) / 2;
        System.out.println("El area de tu Cuadrado es: " + AreaCuadrado);

        return AreaCuadrado;
    }
}
