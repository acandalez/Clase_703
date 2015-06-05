package evaluacion.primera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBBDD {
	/**PARAMETROS DE CONEXION*/
	
	static String bd = "REGIONS";
	static String login = "HR";
	static String password = "a693232977";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	ConnectionBBDD conn = null;
	private static Statement stmt = null;
	
	/**CONECTAR BBDD*/
	public Statement connectionBBDD (){
		try{
			
			/**OBTENEMOS EL DRIVER DE ORACLE*/
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			/**OBTENEMOS LA CONEXION*/
			conn = (ConnectionBBDD) DriverManager.getConnection(url, login, password);
			
			if (conn!=null){
				System.out.println("Conexion a la base de datos"+bd+"OK\n");
			}
		}catch (SQLException e){
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		return stmt;
	}
	/**DEVOLVER CONNECTION*/
	public ConnectionBBDD getConnection(){
		return conn;
	}
	/**DESCONECTAR (disconnect)*/
	public void disconnect(){
		conn=null;
	}

}
