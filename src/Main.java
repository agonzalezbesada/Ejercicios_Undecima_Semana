import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("\n"+"Introduzca sus datos personales"+"\n");
        String nombre="0";
        String primerApellido="0";
        String segundoApellido="0";
        int altura=0;
        int edad=0;
        char lDNI=0;
        int telefono=0;

        Agenda agenda = new Agenda();

        int menu=0;
        int posicion = 0;
        do {
            System.out.println("Que accion desea realizar?"+"\n"+"0. Salir"+"\n"+"1. Crear perfil"+"\n"+"2. Ver perfil"+"\n"+"3. Ver agenda");
            menu = guardar.nextInt();

            switch (menu){

                case 1:
                    try {
                        System.out.println("Nombre:");
                        nombre = guardar.next();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, debe ser una cadena de caracteres");
                    }

                    try {
                        System.out.println("Primer apellido:");
                        primerApellido = guardar.next();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, debe ser una cadena de caracteres");
                    }

                    try {
                        System.out.println("Segundo apellido:");
                        segundoApellido = guardar.next();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, debe ser una cadena de caracteres");
                    }

                    try {
                        System.out.println("Edad: ");
                        edad = guardar.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, debe ser un número entero");
                    }

                    try {
                        System.out.println("Letra del DNI:");
                        lDNI = guardar.next().charAt(0);
                    } catch (InputMismatchException ex) {
                        System.out.println("Caracter equivocado");
                    }

                    try {
                        System.out.println("Altura (en centímetros):");
                        altura = guardar.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, debe ser un número decimál");
                    }

                    try {
                        System.out.println("Número de teléfono:");
                        telefono = guardar.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, debe ser una serie de números enteros");
                    }

                    Perfil nuevoPerfil = new Perfil(nombre,primerApellido,segundoApellido,edad,lDNI,altura,telefono);

                    System.out.println("\n"+"En qué posición desea registrar perfil?");
                    agenda.verAgenda();
                    posicion = guardar.nextInt();

                    agenda.anadirContacto(nuevoPerfil, posicion);
                    break;

                case 2:
                    System.out.println("\n"+"Qué número de la agenda quiere consultar?");
                    agenda.verAgenda();
                    posicion = guardar.nextInt();
                    agenda.verPerfil(posicion);
                    break;

                case 3:
                    System.out.println("\n"+"Agenda:");
                    agenda.verAgenda();
                    break;

                default:
                    System.out.println("\n"+"No es una opción del menú"+"\n");
            }

        } while (menu != 0);
    }
}