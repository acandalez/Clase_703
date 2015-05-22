package java_se.ficheropropiedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

/**
 * Nuestro programa genera un cuento en diferentes idiomas. El idioma elegido
 * por el usuario, viene como parámetro por línea de comandos pudiendo ser IT,
 * ES o EN. Se pide: cargar el fichero apropiado en función de la entrada y
 * generar el cuento en un fichero de salida indicado
 */

public class EJ_Properties implements Serializable {// por si en un futuro lo
													// necesitamos procesar.

	public static void display_language() throws IOException {

		Properties properties = new Properties();
		File file = null;
		FileWriter fw = null;
		FileInputStream in = new FileInputStream(file);
		// CARGAMOS LAS PROPIEDADES

		properties.load(in);// cargo el fichero de idioma seleccionado

		// preparamos fichero de salida

		file = new File(properties.getProperty("outfile"));

		// Creo el fichero
		file.createNewFile();

		// Preparo el fichero
		fw = new FileWriter(file);

		// Indicamos los parametros a mostrar
		fw.write(properties.getProperty("start") + "\n");
		fw.write(properties.getProperty("body") + "\n");
		fw.write(properties.getProperty("end") + "\n");

		// Cierro el fichero
		fw.close();

	}

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream in = null;

		String name_file = "story_it.properties";
		String name_file1 = "story_en.properties";
		String name_file2 = "story_es.properties";

		// CREAMOS LAS CONDICIONES
		try {
			switch (args[0]) {
			case "it":
				System.out.println("IT:");
				in = new FileInputStream(name_file);
				break;

			case "en":
				System.out.println("ES:");
				in = new FileInputStream(name_file1);
				break;

			case "ES":
				System.out.println("ES:");
				in = new FileInputStream(name_file2);
				break;

			default:
				System.out.println("Idioma incorrecto");
				break;
			}

			// imprimimos las propiedades
			printProperties(in);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private static void printProperties(FileInputStream in) {
		// TODO Auto-generated method stub

	}

}