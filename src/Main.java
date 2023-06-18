import Conicas1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Llamamos al metodo para el scanner
        Scanner entrada = new Scanner(System.in);

        //Creación de las instancias
        Parabola figura1 = new Parabola(9,8,19,30);

        //Hiperbola
        Hiperbole figura2 = new Hiperbole(9,1,2,4,3,2,20);

        //Circunferencia
        Circunferencia figura3 = new Circunferencia(2,3,4,5,20,9);

        //Elipse
        ELIPSEE figura4 = new ELIPSEE(4,5,2,20,9,90);

        //Creamos la pantalla del menu principal
        System.out.println("\n\t------------------------------------Figuras 3D con Package Equipo 1----------------------------------");

        System.out.println("\nEl presente sistema permite al usuario el calcular diferentes operaciones de cónicas, mediante el empleo" +
                            "de un menu y selección. \nLas conicas que se ofrecen son:");

        System.out.println("\n----> a. Parabola");
        System.out.println("----> b. Hiperbole");
        System.out.println("----> c. Circunferencia");
        System.out.println("----> d. Elipse");

        System.out.println("\nPara continuar, seleccione la letra de la conica a usar: ");
        String opt = entrada.next();


        /*switch (opt) {
            case ("a") -> {
                System.out.println("\n-----> Ha seleccionado Parabola");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura3.Parabola_Equipo2_ImpVer();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura4.Parabola_Equipo2_ImpVer();
            }
            case ("b") -> {
                System.out.println("\n-----> Ha seleccionado Hiperbole");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura1.variables();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura2.variables();
            }
            case ("c") -> {
                System.out.println("\n-----> Ha seleccionado Circunferencia");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura5.imprimir_Datos();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura6.imprimir_Datos();
            }
            case ("d") -> {
                System.out.println("\n-----> Ha seleccionado Elipse");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura7.imprimir_Datos();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura8.imprimir_Datos();
            }
            default -> System.out.println("----> ERROR! Esta conica no se encuentra en el sistema!");
        }*/

    }
}
