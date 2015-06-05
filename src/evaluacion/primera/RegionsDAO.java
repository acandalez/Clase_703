package evaluacion.primera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegionsDAO {
	
	private static List<RegionsDTO> list_regions = null;
	public static ConnectionBBDD  conecction = null;
	public static ConnectionBBDD conn = new ConnectionBBDD();
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
			stmt = ((Connection) conn.getConnection()).createStatement();//creo que no funciona
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

		PreparedStatement preparedStament;

		try {

			//conecction = Connection.;//clase conexion ARREGLAR
			stmt = conn.getConnection()/*falta codigo prepareStament pero no funciona*/
					("SELECT * FROM regions where id = ?");//creo que no funciona
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
