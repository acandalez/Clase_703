package evaluacion.primera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	/**PARAMETROS DE CONEXION*/
	
	static String bd = "REGIONS";
	static String login = "HR";
	static String password = "a693232977";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = null;
	
	/**CONSTRUCTOR*/
	public Connection (){
		try{
			
			/**OBTENEMOS EL DRIVER DE ORACLE*/
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			/**OBTENEMOS LA CONEXION*/
			conn = (Connection) DriverManager.getConnection(url, login, password);
			
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
	}
	/**DEVOLVER CONNECTION*/
	public Connection getConnection(){
		return conn;
	}
	/**DESCONECTAR (disconnect)*/
	public void disconnect(){
		conn=null;
	}

}
