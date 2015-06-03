package java_se.jdbc_BBDD.practica2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {

	private static Connection conn = new Connection();

	public Connection secure_connection() {

		conn = null;
		ResultSet rset = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "HR", "a693232977");
			stmt = conn.createStatement();
			rset = stmt
					.executeQuery("select * from EMPLOYEES where SALARY > 3000");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
