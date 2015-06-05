package evaluacion.primera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * EN ESTA CLASE DEFINIMOS LAS ACCIONES DE LA CLASE REGIONS
 * 
 * @author acandalez
 *
 */
public class RegionsDAO {

	private static List<RegionsDTO> list_regions = null;
	public static ConnectionBBDD conecction = null;
	public static Connection conn;
	private static Statement stmt;
	private static Statement stmt1;
	private static ResultSet rs = null;
	private static RegionsDTO regionsDTO = null;

	private static RegionsDTO composing_object(ResultSet rs)
			throws SQLException {

		RegionsDTO regions = new RegionsDTO();

		int Region_ID = rs.getInt(1);
		String Region_Name = rs.getString(2);

		return regions;

	}

	/** OBTENER TODAS LAS REGIONES */
	public static List<RegionsDTO> obtain_all_regions() throws SQLException {

		try {

			conn = ConnectionBBDD.secure_connection();// CREAMOS LA CONEXION
			stmt = conn.createStatement();// CREAMOS LA CONSULTA VACIA
			rs = stmt.executeQuery(SQL_Statements.Regions_Consultation);
			list_regions = new ArrayList<RegionsDTO>();
			while (rs.next()) {
				regionsDTO = composing_object(rs);
				list_regions.add(regionsDTO);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

			list_regions = null;
			throw e;
		} finally {
			// Conexion.liberarRecursos(conexion, stmt, rs); ARREGLAR
		}
		return list_regions;

	}

	/** OBTENER REGIONES POR ID */
	public static RegionsDTO obtain_id_regions(int region_ID)
			throws SQLException {

		try {

			// clase conexion ARREGLAR
			PreparedStatement consultation = ConnectionBBDD.secure_connection()
					.prepareStatement(
							"SELECT * FROM REGIONS where REGION_ID = ?");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL_Statements.Regions_Consultation_ID);
			RegionsDTO regions = new RegionsDTO();

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

		return regionsDTO;

	}

	/**
	 * INSERTAR REGION
	 * 
	 * @throws SQLException
	 */
	public void insertarRegion(String region) throws SQLException {

		try {

			conn = ConnectionBBDD.secure_connection();// clase conexion ARREGLAR
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL_Statements.New_Regions);
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

	}

}
