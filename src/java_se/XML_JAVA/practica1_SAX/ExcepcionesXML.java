package java_se.XML_JAVA.practica1_SAX;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ExcepcionesXML implements ErrorHandler {

	@Override
	public void error(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub

		System.out.println("Error grave");
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub

		System.out.println("Error medio");

	}

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		// TODO Auto-generated method stub

		System.out.println("Error leve, peudes seguir trabajando");

	}

}
