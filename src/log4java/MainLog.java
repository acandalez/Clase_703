package log4java;

import org.apache.log4j.Logger;

public class MainLog {

	private final static Logger log = Logger.getLogger("mylog");

	// private final static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {// cada uno de los log lo ponemos en donde lo necesitemos dependiendo del error encontrado.
		log.error("JODER CON LOS Q TOCAN!!!!!");
		log.info("Informando...");
		log.warn("Cuidaito!!!!!");
		log.debug("A es igual a 12");
		log.trace("A que no sales!");
	}

}
