package evaluacion.primera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
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

	/** TRANSACCIONES */
	Savepoint sp = null;

	/**
	 * CONECTAR BBDD
	 * 
	 * @throws SQLException
	 */
	public Statement connectionBBDD() throws SQLException {
		try {
			connection.setAutoCommit(false);
			Savepoint sp = connection.setSavepoint();

			/** OBTENEMOS EL DRIVER DE ORACLE */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/** OBTENEMOS LA CONEXION */
			connection = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Conexion a la base de datos" + bd + "OK\n");
			}
		} catch (SQLException e) {
			connection.rollback(sp);
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			connection.rollback(sp);
			System.out.println(e);
		} catch (Exception e) {
			connection.rollback(sp);
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

	/** METODO CREATE STATEMENT */
	public Statement createStatement() {

		return stmt = conn.createStatement();
	}

	/** DESCONECTAR (disconnect) */
	public void disconnect() {
		conn = null;
	}

}
