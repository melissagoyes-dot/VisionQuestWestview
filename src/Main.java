import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("===== WESTVIEW: VISION Y SU COPIA =====");

        Vision recluta = new Vision();
        Vision aprendiz = new Vision("Jarvis");

        System.out.println("\nRecluta:");
        recluta.mostrar();

        System.out.println("\nAprendiz:");
        aprendiz.mostrar();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de nuevo vision: ");
        String nombre = sc.nextLine();
        System.out.println("Color de "+ nombre + ": ");
        String color = sc.nextLine();
        System.out.println("Ingrese la inteligencia entre 0-100");
        int memoria = sc.nextInt();

        Vision v1 = new Vision(nombre, color, memoria);

        Vision v2 = v1;

        Vision v3 = new Vision(v1);

        v3.borrarMemoria();
        v3.cambiarColor("Blanco");

        v2.recordar(10,2);

        System.out.println("\nV1:");
        v1.mostrar();
        System.out.println("\nV2:");
        v2.mostrar();
        System.out.println("\nV3:");
        v3.mostrar();


        System.out.println("DIFERENCIA memorias entre v1 y v3");
        System.out.println(v1.diferenciarMemoria(v3));

        System.out.println("\nCodigo v1: " + v1.codigo() + "\nCodigo v3: " + v3.codigo());

        System.out.println("\nComparacion v1 y v2");
        System.out.println(v1==v2);

        System.out.println("\nComparacion v1 y v3:");
        System.out.println(v1==v3);



    }
}