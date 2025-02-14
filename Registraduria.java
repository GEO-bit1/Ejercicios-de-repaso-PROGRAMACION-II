package registraduria;

import java.util.Scanner;

public class Registraduria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int año_actual, año_nac, centinela;

        do {
            System.out.println(
                "Sabes si ya tienes la edad necesaria para votar ¿? ");
        System.out.println(
                "");
        System.out.println(
                "Ingresa a continuacion el año actual en el que ejecutas el codigo");

        año_actual = leer.nextInt();

        System.out.println("Ok ahora si digita tu año de nacimiento ");
        año_nac = leer.nextInt();
        if (año_actual >= año_nac + 18) {
            System.out.println(" ¡Super!, tienes la edad suficiente para votar ");

        }else{
            System.out.println(" Lo siento ;c no tienes la edad suficiente");
            
        }
        System.out.println("¿ Deseas seguir ?");
        System.out.println(" Si = 1 o No= 0 ");
            centinela = leer.nextInt();
            
        } while (centinela == 1 );


    }

}
