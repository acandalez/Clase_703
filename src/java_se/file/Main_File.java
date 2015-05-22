package java_se.file;

import java.io.*;

public class Main_File {
/**
 * Esta clase tiene la función de: 
 * - Comprobar si existe el directorio.
 * - Acceder al directorio.
 * - Mostrar los archivos del directorio.
 * 
 * @author acandalez
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fichero = new File ("Ejemplo_File");//creamos el objeto de file (que es un string) y le definimos una direccion
		if (fichero.exists()){//comprobamos si existe
		
			if (fichero.isDirectory()){
				
				String []contenido = fichero.list();//Obtemenos el listado del directorio
				//Las arrays empiezan sin contenido y por medio del valor del incremento vamos añadiendo los datos
					for (int i=0; i<contenido.length; i++){
						System.out.println(contenido[i]);
					}
			}
			
		}
		
	}
	
	

}
