/*
    CC2 - 2015 - Laboratorio #3
    Ejercicio #3 - Reproductor.java
*/

import java.util.Random;
import java.util.Scanner;

public class Reproductor {
    public static void main(String[] args) {
        String listacanciones = "cancion1;cancion2;cancion3;cancion4;cancion5;cancion6;cancion7;cancion8;cancion9;cancion10";
        PlayList pl = new PlayList(listacanciones,(byte)10);
        Scanner lectura = new Scanner(System.in);
        byte opcion = 0;
        while (opcion != 7) {
            System.out.println("1. Cancion actual\n2. Forward\n3. Backward");
            System.out.println("4. Random\n5. Elegir una cancion # \n6. Lista de Canciones\n7. Salir");
            System.out.println("Ingrese opcion: ");
            opcion = lectura.nextByte();
            switch(opcion) {
                case 1: {
                    System.out.println("Cancion actual: " + pl.getCancionActual());
                    System.out.println();
                    break; }
                case 2: {
                    System.out.println("Forward a siguiente cancion en la lista");
                    pl.forward();
                    System.out.println("Cancion: " + pl.getCancionActual());
                    System.out.println();					
                    break; }
                case 3: {
                    System.out.println("Backward a cancion anterior en la lista");
                    pl.backward();
                    System.out.println("Cancion: " + pl.getCancionActual());
                    System.out.println();					
                    break; }		
                case 4: {
                    System.out.println("Eleccion Aleatoria de cancion");
                    pl.random();
                    System.out.println("Cancion: " + pl.getCancionActual());
                    System.out.println();					
                    break;	}						
                case 5: {
                    System.out.println("Eleccion de cancion");
                    System.out.println("Ingrese numero de cancion del 1 al 10:");
                    byte n = lectura.nextByte();
                    if ((n>=1) && (n<=10)) {
                        pl.gotoCancion(n);
                        System.out.println("Cancion: " + pl.getCancionActual());
                    } else {
                        System.out.println("Numero de cancion invalido. No se cambio de cancion.");
                    }
                    System.out.println();					
                    break; }
                case 6: {
                    System.out.println("Listado de canciones:");
                    System.out.println(pl);
                    System.out.println();					
                    break;	}	
                case 7: {
                    System.out.println("Saliendo del programa...");
                    System.out.println();					
                    break; }
                default: 
                    System.out.println("Opcion invalida");
                    System.out.println();				
            }
                    
        }
    }
}