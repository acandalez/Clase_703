package evaluacion.primera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DEFINIMOS LOS PARAMETROS Y ACCIONES DE CONEXION A LA BASE DE DATOS
 * 
 * @author acandalez
 *
 */
public class ConnectionBBDD {
	/** PARAMETROS DE CONEXION */

	static String bd = "REGIONS";
	static String login = "HR";
	static String password = "a693232977";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	/** INICIAMOS EL OBJETO DE LA CLASE */
	ConnectionBBDD conn = null;
	/** OBJETO DE CONNECTIONBBDD */
	static ConnectionBBDD connectionBBDD = new ConnectionBBDD();
	Connection connection;
	private static Statement stmt = null;

	/** CONECTAR BBDD */
	public Statement connectionBBDD() {
		try {

			/** OBTENEMOS EL DRIVER DE ORACLE */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/** OBTENEMOS LA CONEXION */
			connection = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Conexion a la base de datos" + bd + "OK\n");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		return stmt;
	}

	/** OBTENER CONEXION */
	public static Connection secure_connection() {
		return connectionBBDD.connection;
	}

	/** DEVOLVER CONEXION */
	public ConnectionBBDD getConnection() {
		return conn;
	}

	/** ESTADO */
	public static Statement statement() {
		return stmt;
	}

	/** DESCONECTAR (disconnect) */
	public void disconnect() {
		conn = null;
	}

	/** METODO CREATE STATEMENT */
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return stmt = conn.createStatement();
	}

}
