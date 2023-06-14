import conicas2.*;
import java.util.Scanner;

/*Esta clase contiene un menú compuesto por el package del equipo 2, realizado por todos los integrantes del equipo 1

* Equipo 1 - Integrantes
* ----> Parabola:
* ----> Hiperbole:
*---->  Circunferencia:
* ----> Elipse:

* */
public class Main {
    public static void main(String[] args) {

        //Llamamos al m[etodo para el scanner
        Scanner entrada = new Scanner(System.in);

        /* En esta seccion agregaremos las instancias, dependiendo de cada sub equipo y conica */
        //Parabola

        //Hiperbola

        //Circunferencia

        //Elipse

        //Creamos la pantalla del menu principal
        System.out.println("------------------------------------Figuras 3D con Package Equipo 2----------------------------------");

        System.out.println("\nEl presente sistema permite al usuario el calcular diferentes operaciones de cónicas, mediante el empleo" +
                            "de un menu y selección. \nLas conicas que se ofrecen son:");

        System.out.println("\n----> a. Parabola");
        System.out.println("\n----> b. Hiperbole");
        System.out.println("\n----> c. Circunferencia");
        System.out.println("\n----> d. Elipse");

        System.out.println("\nPara continuar, seleccione la letra de la conica a usar: ");
        String opt = entrada.next();

        switch (opt){
            case ("a"):

                break;

            case ("b"):

                break;

            case ("c"):

                break;

            case ("d"):

                break;

            default:
                
                break;
        }

    }
}
