package utez.edu.mx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola Bienvenido:");
        int opc = 0;
        do {
            System.out.println("1. Ingresar un numero");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese un numero: ");
                    int numero = sc.nextInt();
                    System.out.println("El numero ingresado es: " + numero);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opc != 2);

    }
}