import Conicas1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Llamamos al metodo para el scanner
        Scanner entrada = new Scanner(System.in);

        //Creación de las instancias
        Parabola figura1 = new Parabola(2,40,2,12);

        //Hiperbola
        Hiperbole figura2 = new Hiperbole(9,1,2,4,3,2,20);

        //Circunferencia
        Circunferencia figura3 = new Circunferencia(2,3,4,5,20,9);

        //Elipse
        ELIPSEE figura4 = new ELIPSEE(4,5,2,20,9,90);

        //Creamos la pantalla del menu principal
        System.out.println("\n\tFiguras 3D con Package Equipo 1");

        System.out.println("\nEl presente sistema permite al usuario el calcular diferentes " +
                "operaciones de cónicas " +"\nLas conicas que se ofrecen son:");

        System.out.println("\n1. Parabola");
        System.out.println("2. Hiperbole");
        System.out.println("3. Circunferencia");
        System.out.println("4. Elipse");

        System.out.print("\nPara continuar, seleccione la letra de la conica a usar: ");
        int opt = entrada.nextInt();


        switch (opt) {
            case (1) -> {
                System.out.println("\nParabola ");
                System.out.println("\nCalculo eje Horizonal: ");
                figura1.calculo_eje_horizontal();
                figura1.imprimirDatos();
            }
            case (2) -> {
                System.out.println("\nHiperbole");
                System.out.println("\nVertices");
                figura2.hallar_vertices();
            }
            case (3) -> {
                System.out.println("\nCircunferencia");
                figura3.imprimir();
            }
            case (4) -> {
                System.out.println("Elipse");
                figura4.imprimir();
            }
            default -> System.out.println("----> ERROR! Esta conica no se encuentra en el sistema!");
        }

    }
}
