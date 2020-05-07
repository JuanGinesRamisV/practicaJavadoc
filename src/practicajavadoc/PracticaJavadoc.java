/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajavadoc;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class PracticaJavadoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
        int opcion;
        Scanner lector = new Scanner(System.in);
        Operaciones prueba = new Operaciones();

        while (salir == false) {
            imprimirMenu();
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer numero:");
                    int a = lector.nextInt();
                    System.out.println("Introduce el seugndo número:");
                    int b = lector.nextInt();
                    System.out.println("La suma de los dos numeros es: "+ Operaciones.suma(a,b));
                    break;
                case 2:
                    System.out.println("Introduce el primer numero:");
                    a = lector.nextInt();
                    System.out.println("Introduce el seugndo número:");
                    b = lector.nextInt();
                    System.out.println("El numero máximo es: " + Operaciones.findMax(a, b));
                    break;
                case 3:
                    System.out.println("Introduce el primer numero:");
                    a = lector.nextInt();
                    System.out.println("Introduce el seugndo número:");
                    b = lector.nextInt();
                    System.out.println("La multiplicación da como resultado: "
                    + Operaciones.multiplicar(a, b));
                    break;
                case 4:
                    salir=true;
            }
        }

    }


    /**
     * Imprime el menu principal del programa por consola
     */
    public static void imprimirMenu() {
        System.out.println("1)sumar dos números");
        System.out.println("2)Encontrar el numero máximo");
        System.out.println("3)Multiplicar dos números");
        System.out.println("4)salir");
        System.out.println("-----------");
        System.out.println("Selecciona una opción");
    }
    
}
