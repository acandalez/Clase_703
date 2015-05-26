package java_se.XML_JAVA.practica2_JDOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * 1. parsear xml. 2. Crear array_list. 3. Ordeno Array. 4. Genero nuevo
 * Document. 5. Escribo fichero.
 * 
 * 
 * @author acandalez
 *
 */
public class JDOM2 {

	public static void main(String[] args) throws FileNotFoundException,
			JDOMException, IOException {

		Libro lb = new Libro();
		int c = 0;
		ArrayList<Libro> aLb = new ArrayList<Libro>();

		// CREAMOS EL PARSER
		SAXBuilder builder = new SAXBuilder();
		// Construimos el arbol DOM a partir del fichero xml
		Document documentJDOM = builder
				.build(new FileInputStream("libros.xml"));

		// MOSTRAMOS EL DOCUMENTO
		Element raiz = documentJDOM.getRootElement();
		// Recorremos los hijos de la etiqueta raíz
		List<Element> libros = raiz.getChildren();
		for (Element libro : libros) {

			libros = aLb.get(c);
			// para cada libro, obtenemos su detalle
			// System.out.println(libro.getAttribute("isbn"));
			// List<Element> detalles = libro.getChildren();

			for (Element detalle : detalles) {

				switch (detalle.getName()) {
				case "titulo":
					lb.setTitulo(detalle.getValue());

					break;

				case "autor":
					lb.setTitulo(detalle.getValue());

					break;
				case "anyo":
					lb.setTitulo(detalle.getValue());

					break;
				case "editorial":
					lb.setTitulo(detalle.getValue());

					break;

				}
				aLb.add(lb);
				// System.out.println("Nombre =" + detalle.getName());
				// System.out.println("Valor =" + detalle.getValue());

			}

			Collections.sort(aLb);
		}
		// for (Libro lbs : aLb) {
		// System.out.println(lbs);
		// } muestra mi array list.

		// AÑADO UN NUEVO HIJO
		Element padre = documentJDOM.getRootElement();// libros
		// Creamos una nueva etiqueta
		Element nuevolibro = new Element("libro");
		// Añadimos un atributo
		nuevolibro.setAttribute("isbn", "xxxx-yyyy");

		Element titulo = new Element("titulo");
		titulo.addContent("Dragonlance");// aqui indicamos si es dentro de padre
											// o
											// dentro de isbn.
		nuevolibro.addContent(titulo);// estas añadiendo la etiqueta titulo al
										// libro
		padre.addContent(nuevolibro);// Al padre le he añadido el libro

		// SERIALIZO EL DOCUMENT A UN FICHERO DE SALIDA

		Format format = Format.getPrettyFormat();
		// Creamos el serializador con el formato deseado
		XMLOutputter xmloutputter = new XMLOutputter(format);
		// Serializamos el document parseado
		String docStr = xmloutputter.outputString(documentJDOM);
		// Volcamos en un fichero
		FileWriter fw = new FileWriter("lsalida3.xml");
		fw.write(docStr);
		fw.close();

	}
}
