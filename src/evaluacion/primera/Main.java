package evaluacion.primera;

import java.sql.SQLException;
import java.util.List;

/*
 * Examen 1ª Evaluacion :
 * Hacer una aplicacion siguiendo el patron DAO, me permita:
 * 1 Crear regiones en la base de datos.
 * 2 Recuperar region dada si ID
 * 3 Recuperar toda la lista de regiones.
 * @author acandalez
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** MOSTRAR TODAS LAS REGIONES */
		try {

			List<RegionsDTO> list_regions = RegionsDAO.obtain_all_regions();
			System.out.println(list_regions);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

		/** MOSTRAR DADA SU ID */
		try {

			List<RegionsDTO> list_regions = RegionsDAO.obtain_id_regions();
			System.out.println(list_regions);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out
					.println("Error al recuperar la lista de regiones por ID de la base de datos");

		}

		/**
		 * FALTA PARA INSERTAR REGIONES
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
