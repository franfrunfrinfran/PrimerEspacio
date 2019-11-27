package es.Studium.Ejercicio16T3;

import java.util.Scanner;

public class QuitarElPrimerEspacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
		String cad1;
		
		System.out.println("Escriba una cadena");
		cad1=teclado.nextLine(); //Si no usas nextLine y pones solo next, te lee solo la primera palabra
		
		
		cad1=cad1.replaceFirst(" ", "");
		
		System.out.println(cad1);
		
		
		
		teclado.close();
	}
	}


