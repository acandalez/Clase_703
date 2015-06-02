package java_se.jdbc_BBDD.practica2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		String FIRST_NAME = null;
		String LAST_NAME = null;
		String EMAIL = null;
		String PHONE_NUMBER = null;
		Date HIRE_DATE = null;
		String JOB_ID = null;
		int SALARY = 0;

		try {
			// registro el driver, en realidad, hago que se ejecuten unas pocas
			// líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager.registerDriver (new
			// oracle.jdbc.driver.OracleDriver());// método equivalente al
			// anterior
			// Sea como sea, es, <<oye, si te piden una conexión, se la pides a
			// esa clase!>>
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "HR", "a693232977");
			stmt = conn.createStatement();
			rset = stmt
					.executeQuery("select * from EMPLOYEES where SALARY > 3000");

			ArrayList<EmployeesDTO> aEmployess = new ArrayList<EmployeesDTO>();

			while (rset.next()) {
				System.out.println(rset.getString(1));
				FIRST_NAME = rset.getString("FIRST_NAME");
				LAST_NAME = rset.getString("LAST_NAME");
				EMAIL = rset.getString("EMAIL");
				PHONE_NUMBER = rset.getString("PHONE_NUMBER");
				HIRE_DATE = rset.getDate("HIRE_DATE");
				JOB_ID = rset.getString("JOB_ID");
				SALARY = rset.getInt("SALARY");

				EmployeesDTO newEmployee = new EmployeesDTO(FIRST_NAME,
						LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID,
						SALARY);

				aEmployess.add(newEmployee);

				// for ()

				// Metodos de una Transaccion
				conn.setAutoCommit(false);
				conn.setSavepoint();
				conn.commit();

			}
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();// voler a un punto anterior
		} finally // libero recursos, de "adentro a fuera" , ResultSet,
					// Statment, Conexion
		{
			if (rset != null) {
				try {
					rset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}

		}

	}
}
