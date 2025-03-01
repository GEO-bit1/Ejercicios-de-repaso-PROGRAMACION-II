package ejercicio;

import java.util.Scanner;

public class ConversorMonedas {

    // Método para convertir a dólares
    public static void convertirADolar(double pesosColombianos) {
        final double DOLAR = 0.00024;
        double resultado = pesosColombianos * DOLAR;
        System.out.printf("La cantidad de %.2f pesos colombianos equivale a %.2f Dólares.%n", pesosColombianos, resultado);
    }

    // Método para convertir a pesos canadienses
    public static void convertirAPesoCanadiense(double pesosColombianos) {
        final double PESO_CANADIENSE = 0.00033;
        double resultado = pesosColombianos * PESO_CANADIENSE;
        System.out.printf("La cantidad de %.2f pesos colombianos equivale a %.2f Pesos Canadienses.%n", pesosColombianos, resultado);
    }

    // Método para convertir a pesos argentinos
    public static void convertirAPesoArgentino(double pesosColombianos) {
        final double PESO_ARGENTINO = 0.076;
        double resultado = pesosColombianos * PESO_ARGENTINO;
        System.out.printf("La cantidad de %.2f pesos colombianos equivale a %.2f Pesos Argentinos.%n", pesosColombianos, resultado);
    }

    // Método para convertir a yenes
    public static void convertirAYen(double pesosColombianos) {
        final double YEN = 0.035;
        double resultado = pesosColombianos * YEN;
        System.out.printf("La cantidad de %.2f pesos colombianos equivale a %.2f Yenes.%n", pesosColombianos, resultado);
    }

    // Método para convertir a libras
    public static void convertirALibra(double pesosColombianos) {
        final double LIBRA = 0.00019;
        double resultado = pesosColombianos * LIBRA;
        System.out.printf("La cantidad de %.2f pesos colombianos equivale a %.2f Libras.%n", pesosColombianos, resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de pesos colombianos
        System.out.print("Introduce la cantidad de pesos colombianos: ");
        double pesosColombianos = scanner.nextDouble();

        // Limpiar el buffer
        scanner.nextLine();

        // Solicitar la moneda destino
        System.out.print("Introduce la moneda a convertir (dolar, peso canadiense, peso argentino, yen, libra): ");
        String moneda = scanner.nextLine();

        // Llamar al método correspondiente según la moneda seleccionada
        switch (moneda.toLowerCase()) {
            case "dolar":
                convertirADolar(pesosColombianos);
                break;
            case "peso canadiense":
                convertirAPesoCanadiense(pesosColombianos);
                break;
            case "peso argentino":
                convertirAPesoArgentino(pesosColombianos);
                break;
            case "yen":
                convertirAYen(pesosColombianos);
                break;
            case "libra":
                convertirALibra(pesosColombianos);
                break;
            default:
                System.out.println("Moneda no reconocida. Intenta nuevamente.");
        }

        scanner.close();
    }
}
