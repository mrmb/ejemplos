/*

	  hol , 'a' "a" , w
	Retornar = holw holw holw
*/

import java.util.*;

public class HojaDeRepaso{


	public static String ejercicio1(String pal, char cr, char car){
		Scanner sc = new Scanner(pal);
		sc.useDelimiter("" + cr);
		String nuevoString = "";
		while( sc.hasNext() ){
			nuevoString = nuevoString + sc.next() ;
			if( sc.hasNext() ) nuevoString = nuevoString + car;
		}
		return nuevoString;
	}


	public static int ejercicio3(boolean[] arr, int n){		
		int cantVecesFalse = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			if( arr[i] == false ) cantVecesFalse++;

			if( cantVecesFalse == n){
				return i ;
			}
		}
		return -1 ;
	} 

	public static void ejercicio4(boolean[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			if( arr[i] == true ){
				System.out.print( "X | ");
			} else {
				System.out.print( (i + 1) + " | " );
			}
		}
	}






















}