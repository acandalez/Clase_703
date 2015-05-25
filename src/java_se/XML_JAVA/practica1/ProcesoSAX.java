package java_se.XML_JAVA.practica1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX {

	public static void main(String[] args) {

		ExcepcionesXML o = new ExcepcionesXML();
		// Creamos nuestros objetos libro y libroxml vacío
		Libro libro = new Libro();

		LibroXML libroxml = new LibroXML(libro);

		try {

			// Creamos la factoria de parseadores por defecto
			XMLReader reader = XMLReaderFactory.createXMLReader();
			// Añadimos nuestro manejador al reader pasandole el objeto libro
			reader.setContentHandler(libroxml);
			// Procesamos el xml de ejemplo
			reader.setErrorHandler(new ExcepcionesXML());
			// mensaje que evalua el estado del xml.

			reader.parse(new InputSource(
					new FileInputStream("libros-error.xml")));// parsea
																// o
																// lee

			HashMap<String, Libro> libros = libroxml.mapLibros();// creamos el
																	// hashmap
																	// donde
																	// almacenamos
																	// los
																	// libros
			System.out.println(o);
			System.out.println(libros);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
