package java_se.XML_JAVA.practica2_JDOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * 1. Parseo libros.xml (JDOM)
 * 2. Hago el ArrayList>libro>
 * 3. Ordeno ArrayList(por título)
 * 4. Creo el nuevo documentJDOM(consultar API JDOM)
 * 5. Serializo un nuevo XML
 * 
 * @author acandalez
 *
 */
public class JDOM2 {

	public static void main(String[] args) throws FileNotFoundException,
			JDOMException, IOException {

		// 1.Parseo libros.xml (JDOM
				SAXBuilder builder = new SAXBuilder();
				// Construimos el arbol DOM a partir del fichero xml
				Document documentJDOM = builder.build(new FileInputStream("libros.xml")); //La clase documentJDOM es un XML en memoria
		// 2. Hago el ArrayList>libro>
				ArrayList<Libro> listalibros = new ArrayList<Libro>();
				
				Element padre = documentJDOM.getRootElement();
				
				List<Element> libros = padre.getChildren();
				
				for (Element libro : libros) {
					
					Libro book = new Libro();
					String isbn = libro.getAttribute("isbn").getValue();
					book.setIsbn(isbn);
					
					List<Element> detalles = libro.getChildren();
					
					for (Element detalle : detalles) {
						
						switch (detalle.getName()) {
						
						case "titulo": book.setTitulo(detalle.getValue());
								break;
						case "autor" : book.setAutor(detalle.getValue());
								break;
						case "anyo"  : book.setAnyo(detalle.getValue());
								break;
						case "editorial": book.setEditorial(detalle.getValue());
								break;
							
						}
					
					}
					listalibros.add(book);
				}
				//Muestra mi array de libros que está en memoria
//				for (Libro l : listalibros) {
//				
//					System.out.println(l);
//				}
				
				//3. Ordeno ArrayList(por título)
				
				Collections.sort(listalibros);// Ordena mi array de libros por el nombre	
				
				Element librosxml = new Element("libros");
			
				for (Libro li : listalibros) {
					
					librosxml.addContent(LibroAElemento(li));
					
				}
				Document doc = new Document(librosxml);
				
				Format format = Format.getPrettyFormat();
			    // Creamos el serializador con el formato deseado  
			    XMLOutputter xmloutputter = new XMLOutputter(format);
			    // Serializamos el document parseado  
			    String docStr = xmloutputter.outputString(doc); 
			    //Volcamos en un fichero
			    FileWriter fw = new FileWriter("practicaJDOM.xml");
			    fw.write(docStr);
			    fw.close();
			}
			
			public static Element LibroAElemento (Libro l) {
				
				Element elibro = new Element("libro");
				Element etitulo = new Element("titulo");
				Element eautor = new Element("autor");
				Element eanyo = new Element("anyo");
				Element eeditorial = new Element("editorial");
				
				etitulo.addContent(l.getTitulo());
				eautor.addContent(l.getAnyo());
				eanyo.addContent(l.getAnyo());
				eeditorial.addContent(l.getEditorial());
				
				elibro.setAttribute("isbn", l.getIsbn());
				elibro.addContent(etitulo);
				elibro.addContent(eautor);
				elibro.addContent(eanyo);
				elibro.addContent(eeditorial);
				
				return elibro;
	}
}
