package java_se.serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		// TODO SERIALIZACION ----> ESCRIBIBIMOS Y GUARDAMOS LOS OBJETOS EN UN
		// FICHERO

		Persona persona = null;
		String fichero = "nuevo";
		String name = null;
		byte edad = 0;

		Persona obj1 = new Persona("Juan", (byte) 22);
		Persona obj2 = new Persona("Luis", (byte) 43);
		Persona obj3 = new Persona("Pedro", (byte) 15);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"serializacion.dat"));

		out.writeObject(obj1);
		out.writeObject(obj2);
		out.writeObject(obj3);

		out.close();

		// ------------------------------------------

		// DES- SERIALIZACION -----> CASTEAMOS LOS OBJETOS PARA TRANSFORMARLOS Y
		// LEERLOS

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"serializacion.dat"));

		obj1 = (Persona) in.readObject();
		obj2 = (Persona) in.readObject();
		obj3 = (Persona) in.readObject();
		in.close();

		System.out.println(obj1);

	}
}
