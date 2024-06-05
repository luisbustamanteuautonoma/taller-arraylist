package com.mycompany.tallerarraylist;

import java.util.Scanner;

public class menu {

    static Scanner scanner = new Scanner(System.in);

    public static void menu1() {
        int op = 0;
        do {
            System.out.println("================================");
            System.out.println("ArrayList");
            System.out.println("================================");
            System.out.println("1. Definicion");
            System.out.println("2. Diferencias con arreglos/vectores");
            System.out.println("3. Metodos de ArrayList");
            System.out.println("4. Conclusiones");
            System.out.println("5. Implementacion");
            System.out.println("6. Salir");
            System.out.println("Digite su opcion:");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    funciones.opcion1();
                    break;
                case 2:
                    funciones.opcion2();
                    break;
                case 3:
                    funciones.opcion3();
                    break;
                case 4:
                    funciones.opcion4();
                    break;
                case 5:
                    menu2();
                    
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
                    break;
            }
        } while (op != 6);
        System.out.println("Hasta prontoo");
    }

    public static void menu2() {
        int op = 0;
        do {
            System.out.println("================================");
            System.out.println("Implementacion");
            System.out.println("================================");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Mostrar contenido");
            System.out.println("5. Salir");
            System.out.println("Digite su opcion:");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elemento = scanner.nextLine();
                    funciones.agregarElemento(elemento);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a eliminar: ");
                    String elemento1 = scanner.nextLine();
                    funciones.eliminarElemento(elemento1);
                    break;
                case 3:
                    System.out.print("Ingrese el elemento a buscar: ");
                    String elemento2 = scanner.nextLine();
                    funciones.buscarElemento(elemento2);
                    break;
                case 4:
                    funciones.mostrarContenido();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
                    break;
            }
        } while (op != 5);
    }

}
