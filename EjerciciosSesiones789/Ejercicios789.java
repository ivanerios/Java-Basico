package EjerciciosSesiones789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ejercicios789 {
    public static void main(String[] args) {
        System.out.println(reverse("Pastanagonia"));
        saltoLinea();
        recorrerArray();
        saltoLinea();
        arrayBidimensional();
        saltoLinea();
        operadorVector();
        /*El problema con la capacidad por defecto (10) son todas las operaciones
        de incremento automático que tiene que hacer hasta llegar a 1000, operaciones
        que no se tendrían que hacer si, inicialmente, se le asignase una capacidad acorde.
        */
        saltoLinea();
        listas();
        saltoLinea();
        operadorListas();
        saltoLinea();
        try {dividePorCero(5 , 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }
        saltoLinea();
        copiadorFicheros("archivo7.txt", "archivocopiado2.txt");



    }

    public static void saltoLinea() {
        System.out.println("");
    }

    public static String reverse(String texto) {

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return invertida;
    }

    public static void recorrerArray() {

        String[] nombres = {"Padro", "Pedro", "Pidro", "Podro", "Pudro"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    public static void arrayBidimensional() {
        int[][] array2d = {{5, 3, 1, 7}, {6, 4, 2, 8}};
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.println(i + ". " + j + ". = " + array2d[i][j]);
            }
        }

    }

    public static void operadorVector() {
        Vector<Double> numericos = new Vector<>(8);
        numericos.add(1.5);
        numericos.add(2.5);
        numericos.add(3.5);
        numericos.add(4.5);
        numericos.add(5.5);

        numericos.remove(1);
        numericos.remove(1);

        numericos.trimToSize();

        for (Double numerico : numericos) {
            System.out.println(numerico);
        }
        System.out.println("El vector tiene: " + numericos.capacity() + " elementos");
    }

    public static void listas() {
        List<String> lista1 = new ArrayList<>();
        lista1.add("Norte");
        lista1.add("Sur");
        lista1.add("Este");
        lista1.add("O este");

        List<String> lista2 = new LinkedList<>(lista1);
        System.out.println("Mi ArrayList: " + lista1);
        System.out.println("Mi LinkedList: " + lista2);
    }

    public static void operadorListas() {
        List<Integer> operadorLista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            operadorLista.add(i);}
            for (int i = 0; i < operadorLista.size(); i++) {
                if (operadorLista.get(i) % 2 == 0) {
                    operadorLista.remove(i);
                }
            }
        for (int i = 0; i < operadorLista.size(); i++) {
            System.out.println(operadorLista.get(i));
        }
        }
        public static int dividePorCero(int a, int b) throws ArithmeticException{
        int resultado = 0;
        try{
            resultado = a / b;
        } catch (ArithmeticException e){
           throw new ArithmeticException();
            }
            System.out.println(resultado);
        return resultado;
        }
        public static void copiadorFicheros (String origen, String destino){
            try {
                InputStream fichero = new FileInputStream(origen);
                byte [] datos = fichero.readAllBytes();
                PrintStream copia = new PrintStream(destino);
                copia.write(datos);
            } catch (Exception e) {
                System.out.println("Archivo no encontrado: " + e.getMessage());
            }
        }
    }
