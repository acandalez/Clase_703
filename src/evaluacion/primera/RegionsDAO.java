package evaluacion.primera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegionsDAO {
	
	private static List<RegionsDTO> list_regions = null;
	private static Connection conexion = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static RegionsDTO regionsDTO = null;


	private static RegionsDTO composing_object(ResultSet rs)
			throws SQLException {

		RegionsDTO regions = new RegionsDTO();

		int Region_ID = rs.getInt(1);
		String Region_Name = rs.getString(2);

		return regions;

	}

	/**OBTENER TODAS LAS REGIONES*/
	public static List<RegionsDTO> obtain_all_regions() throws SQLException {

		

		try {

			// conexion = Conexion.obtenerConexion();//clase conexion ARREGLAR
			stmt = conexion.createStatement();
			rs = stmt.executeQuery(SQL_Statements.Regions_Consultation);
			list_regions = new ArrayList<RegionsDTO>();
			while (rs.next()) {
				regionsDTO = composing_object(rs);
				list_regions.add(regionsDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();

			list_regions = null;
			throw e;
		} finally {
			// Conexion.liberarRecursos(conexion, stmt, rs); ARREGLAR
		}

		return list_regions;

	}
	
	/**OBTENER REGIONES POR ID*/
	public static List<RegionsDTO> obtain_id_regions() throws SQLException {

		List<RegionsDTO> list_regions = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionsDTO regionsDTO = null;

		try {

			// conexion = Conexion.obtenerConexion();//clase conexion ARREGLAR
			stmt = conexion.createStatement();
			rs = stmt.executeQuery(SQL_Statements.Regions_Consultation_ID);
			list_regions = new ArrayList<RegionsDTO>();
			while (rs.next()) {
				regionsDTO = composing_object(rs);
				list_regions.add(regionsDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();

			list_regions = null;
			throw e;
		} finally {
			// Conexion.liberarRecursos(conexion, stmt, rs); ARREGLAR
		}

		return list_regions;

	}
	
	/** INSERTAR REGION 
	 * @throws SQLException */
	public void InsertarRegion(String region) throws SQLException{
	    stmt.executeQuery(" INSERT "+region+"INTO region_table");

	}
}
