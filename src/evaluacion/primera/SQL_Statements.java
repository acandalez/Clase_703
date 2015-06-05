package evaluacion.primera;

public class SQL_Statements {
	public static final String Regions_Consultation = "select * from REGIONS ";
	public static final String Regions_Consultation_ID = "SELECT * FROM REGIONS where REGION_ID = ?";
	public static final String New_Regions = " INSERT INTO REGIONS VALUES(?,'?')";

}
