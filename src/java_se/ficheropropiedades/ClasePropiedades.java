package java_se.ficheropropiedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * Con esto pretendemos entender el uso de properties Tenemos 3 archivos.
 * properties de los cuales tienen en comun los parametros outfile, start, body
 * y end. En el programa, por parametro seleccionas un idioma y automaticamente
 * segun el i
 * 
 * @author Alberto Vivas
 *
 * 
 */
public class ClasePropiedades {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */

	public static void imprimirPropiedades(FileInputStream fis)
			throws IOException {
		Properties propiedades = new Properties();
		File file = null;
		FileWriter fw = null;
		// cargamos las propiedades
		propiedades.load(fis);// cargo el fichero seleccionado antes

		// ------------------------------------------

		System.out.println(propiedades.getProperty("outfile"));
		System.out.println(propiedades.getProperty("start"));
		System.out.println(propiedades.getProperty("body"));
		System.out.println(propiedades.getProperty("end"));
		// ----------------------------^lo encerado no hace falta^
		file = new File(propiedades.getProperty("outfile"));// preparamos un
															// fichero de salida
															// y con outfile se
															// da el nombre del
															// fichero
		file.createNewFile();// creo el ficehro
		fw = new FileWriter(file);// preparo la escritura
		fw.write(propiedades.getProperty("start") + "\n");// escribo
		fw.write(propiedades.getProperty("body") + "\n");// escribo
		fw.write(propiedades.getProperty("end") + "\n");// escribo
		fw.close();// cierro

	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		/*
		 * String nombre_archivo = "story_it.properties" + "story_en.properties"
		 * + "story_es.properties";
		 */

		try {
			switch (args[0]) {// creamos la condicion.
			case "it":
				System.out.print("Italiano: ");
				fis = new FileInputStream("story_it.properties"/* nombre_archivo */);
				break;
			case "en":
				System.out.print("Ingles: ");
				fis = new FileInputStream("story_en.properties");
				break;

			default: // ES español
				System.out.print("Español: ");
				fis = new FileInputStream("story_es.properties");
				break;
			}

			// imprimimos las propiedades
			imprimirPropiedades(fis);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}