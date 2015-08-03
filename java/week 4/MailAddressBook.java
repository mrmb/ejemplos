/*
	CC2 - 2015 - Laboratorio #3
	Ejercicio #1 - MailAddressBook.java
*/

import java.io.*;
import java.util.*;

public class MailAddressBook {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void insert(ArrayList<MailContact> contacts) throws Exception{
		System.out.println("INGRESO DE CONTACTOS: ");
		System.out.println("Ingrese apellido: ");
		String ap = br.readLine();
		System.out.println("Ingrese nombre: ");
		String nom = br.readLine();
		System.out.println("Ingrese email: ");
		String email = br.readLine();
		if ( !ap.equals("") && !nom.equals("") && !email.equals("") ) {
			contacts.add(new MailContact(ap,nom,email));
			System.out.println("Contacto ingresado exitosamente!\n");
		} else System.out.println("Hubo un error al ingresar el contacto!\n");
	}

	public static void printAll(ArrayList<MailContact> contacts) {
		System.out.println("--------------------------");
		for (MailContact contact: contacts) {
			System.out.println(contact);
		}
		System.out.println("--------------------------");
	}

		public static void printGrupos(ArrayList<MailContact> contacts) {
		System.out.println("--------------------------");
		System.out.println("AMIGOS: ");
		for (MailContact contact: contacts) {
			if (contact.getGrupo() == 1) System.out.println(contact);
		}
		System.out.println("FAMILIA: ");
		for (MailContact contact: contacts) {
			if (contact.getGrupo() == 2) System.out.println(contact);
		}

		System.out.println("TRABAJO: ");
		for (MailContact contact: contacts) {
			if (contact.getGrupo() == 3) System.out.println(contact);
		}
		System.out.println("--------------------------");
	}

	public static int search(ArrayList<MailContact> contacts, String email) {
		int count = 0;
		for (MailContact contacto: contacts) {
			if (contacto.getEmail().equals(email)) return count;
			count++;
		}
		return -1;
	}

	public static void setGroup(ArrayList<MailContact> contacts) throws Exception {
		System.out.println("MANEJO DE GRUPOS: ");
		System.out.println("Ingrese email de contacto: ");
		String email = br.readLine();
		int x = search(contacts,email);
		if (x == -1) {
			System.out.println("El contacto no se encontro!\n");
		} else {
			System.out.println("GRUPOS: \n(1) Amigos\n(2) Familia\n(3) Trabajo\n");
			System.out.println("Ingrese grupo al que quiere que el contacto pertenezca: ");
			try {
				int grupo = Integer.parseInt(br.readLine());
				if ((grupo >= 1) && (grupo <= 3)) contacts.get(x).setGrupo(grupo);
				System.out.println("Contacto agregado a grupo exitosamente!\n");
			} catch (NumberFormatException e) { System.out.println("Grupo invalido, no se pudo agregar contacto! ");}
		}
	}

	public static void main(String[] args) throws Exception {
		
		ArrayList<MailContact> contacts = new ArrayList<MailContact>();

		contacts.add(new MailContact("Quan","Andrea","andreaq@gmail.com"));
                contacts.add(new MailContact("Lemus","Ali","alilemus@galileo.edu"));
		contacts.add(new MailContact("Mendez","Marvin","mmendez@gmail.com"));
		contacts.add(new MailContact("Hernandez","Mario","maritoh@galileo.edu"));	

		System.out.println("Bienvenido a Mail Address Book !!\n");
		byte opcion = 0;
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("(1) Ingresar contacto \n(2) Agregar o cambiar contacto a un grupo \n(3) Listar todos los contactos \n(4) Listar contactos por grupo \n(5) Salir \n");
			System.out.println("Que operacion desea realizar: ");
			try {
				opcion = Byte.parseByte(br.readLine());
				switch(opcion) {
					case 1: {
							insert(contacts);
							break;
					}
					case 2: {
							setGroup(contacts);
							break;
					}
					case 3: {
							printAll(contacts);
							break;
					}
					case 4: {
							printGrupos(contacts);
							break;
					}
					case 5: {
							System.out.println("Saliendo del programa...");
							break;
					}
					default:
						System.out.println("Opcion invalida!");
				}
			} catch (NumberFormatException e) { System.out.println("Opcion invalida!");}

		} while (opcion != 5);

	}
}