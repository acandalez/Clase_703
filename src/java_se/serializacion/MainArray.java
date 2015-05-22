package java_se.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		Persona[] grupopersonas = null;
		grupopersonas = new Persona[3];
		int longarray = grupopersonas.length;
		String name = null;
		byte edad = 0;
		Scanner sc = new Scanner(System.in);

		// SERIALIZAR UN ARRAY

		for (int i = 0; i < longarray; i++) {// agrupamos en una array

			System.out.print("Introduzca nombre:");
			// name = "" + i;// asigna que es automaticamente un string//modo
			// rudo
			name = sc.next();

			// edad
			System.out.println("Introduzca edad:");
			// edad = (byte) i;// lo mismo pero con byte//modo rudo
			// es sin el modo scanner para agrupar rapidamente y ver el
			// resultado.
			edad = sc.nextByte();

			grupopersonas[i] = new Persona(name, edad);

		}
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"serializar_array.dat"));

		out.writeObject(grupopersonas);
		out.close();

		// ----------------------------
		// DESSERIALIZAR UN ARRAY

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"serializar_array.dat"));
		grupopersonas = (Persona[]) in.readObject();
		in.close();

		// mostar la array para comprobar
		for (int i = 0; i < longarray; i++) {
			System.out.println(grupopersonas[i]);
		}

	}
}
