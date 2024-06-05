package com.mycompany.tallerarraylist;

import java.util.ArrayList;

public class funciones {

    private static ArrayList<String> lista = new ArrayList<>();

    public static void opcion1() {
        System.out.println("================================");
        System.out.println("Definicion: ArrayList");
        System.out.println("================================");
        System.out.println("Array List es una clase que permite manipular las colecciones, arreglos y/o vectores de manera dinamica.");
        System.out.println("Es una coleccion que puede crecer segun sea necesario. Implementa todos los metodos \nopcionales del interfaz List. \nEsta clase proporciona metodos para manipular el tamaño del array que se \nutiliza internamente para almacenar la lista.");
        System.out.println("================================");
        System.out.println("Fuente: Documentacion Oracle"); //https://docs.oracle.com/cd/E17802_01/j2se/j2se/1.5.0/jcp/beta1/apidiffs/java/util/ArrayList.html
    }

    public static void opcion2() {
        System.out.println("================================");
        System.out.println("Diferencias: ArrayList / Arreglos");
        System.out.println("================================");
        System.out.println("=====1. Tamaño=====");
        System.out.println("ArrayList: El tamaño es dinamico, puede ser modificado si es necesario.");
        System.out.println("Arreglos/Vectores: El tamaño es definido desde un principio y no es modificable.");
        System.out.println("=====2. Tipo de datos=====");
        System.out.println("ArrayList: Solo puede almacenar objetos.");
        System.out.println("Arreglos/Vectores: Puede almacenar tanto objetos como datos primitivos");
        System.out.println("=====3. Metodos=====");
        System.out.println("ArrayList: Posee metodos propios para la modificacion de la coleccion.");
        System.out.println("Arreglos/Vectores: No posee metodos. Todas las modificaciones deben ser realizadas manualmente con codigo extra.");
        System.out.println("=====4. Memoria=====");
        System.out.println("ArrayList: Si no se especifica el tamaño de la coleccion al momento de crear el arraylist, este lo redimensiona en caso de llenar su capacidad.");
        System.out.println("Arreglos/Vectores: La memoria a ocupar está determinada al momento de crear el arreglo. Para utilizar un arreglo mas grande o pequeño se debe crear otro.");
        System.out.println("=====5. Rendimiento=====");
        System.out.println("ArrayList: Puede ser menos eficiente debido al dinamismo del manejo de elementos y los metodos que utiliza.");
        System.out.println("Arreglos/Vectores: Suelen ser mas eficientes en terminos de rendimiento debido a la falta de sobrecarga inicial.");
        System.out.println("=====6. Colecciones=====");
        System.out.println("ArrayList: Es parte de la coleccion del framework de Java, por lo que hereda varios metodos definidos en 'List'.");
        System.out.println("Arreglos/Vectores: No es parte de la coleccion del framework de Java. No hereda metodos para manejo adicional, solo se limitan a operaciones proporcionadas por el lenguaje Java.");
        System.out.println("================================");
        System.out.println("Fuente: Documento de Array y ArrayList. Universidad de Cantabria"); //https://personales.unican.es/corcuerp/java/Slides/Arrays.pdf
    }

    public static void opcion3() {
        System.out.println("================================");
        System.out.println("Metodos");
        System.out.println("================================");
        System.out.println("=====1. Add =====");
        System.out.println("Añade un elemento al final de la lista. Aumenta el tamaño del arraylist en caso de ser necesario.");
        System.out.println("=====2. Get (int index) =====");
        System.out.println("Permite alcanzar un elemento especifico con su indice de ubicacion en la lista.");
        System.out.println("=====3. Remove =====");
        System.out.println("Remueve un elemento especificado, con su indice, de la lista.");
        System.out.println("=====4. Size =====");
        System.out.println("Devuelve el tamaño del arraylist");
        System.out.println("================================");
        System.out.println("Fuente: Documentacion Oracle"); //https://docs.oracle.com/cd/E17802_01/j2se/j2se/1.5.0/jcp/beta1/apidiffs/java/util/ArrayList.html
    }

    public static void opcion4() {
        System.out.println("================================");
        System.out.println("Conclusiones");
        System.out.println("================================");
        System.out.println("Los ArrayList son una buena opcion en programas mas complejos, donde los datos con los que se trabajan las listas van \nvariando constantemente, en informacion y tamaño.\nAunque su uso debe ser considerado con relacion al manejo de memoria y la eficiencia que requiera el programa.");
    }

    public static void agregarElemento(String elemento) {
        lista.add(elemento);
        System.out.println("Elemento '" + elemento + "' agregado al ArrayList.");
    }

    public static void eliminarElemento(String elemento) {
        if (lista.remove(elemento)) {
            System.out.println("Elemento '" + elemento + "' eliminado del ArrayList.");
        } else {
            System.out.println("Elemento '" + elemento + "' no encontrado en el ArrayList.");
        }
    }

    public static void buscarElemento(String elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento '" + elemento + "' encontrado en el ArrayList.");
        } else {
            System.out.println("Elemento '" + elemento + "' no encontrado en el ArrayList.");
        }
    }

    public static void mostrarContenido() {
        System.out.println("Contenido del ArrayList: " + lista);
    }
}
