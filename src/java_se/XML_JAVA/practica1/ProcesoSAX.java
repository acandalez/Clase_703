package java_se.XML_JAVA.practica1;

import java.io.FileInputStream;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX {

	public static void main(String[] args) {

		try {
			// Creamos nuestros objetos libro y libroxml vacío
			Libro libros = new Libro();
			LibroXML libroxml = new LibroXML(libros);
			// Creamos la factoria de parseadores por defecto
			XMLReader reader = XMLReaderFactory.createXMLReader();
			// Añadimos nuestro manejador al reader pasandole el objeto libro
			reader.setContentHandler(libroxml);
			// Procesamos el xml de ejemplo
			reader.parse(new InputSource(new FileInputStream("libros.xml")));

			System.out.println(libros.toString());
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
