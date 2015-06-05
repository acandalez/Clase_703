package evaluacion.primera;

/**
 * DEFINIMOS LAS DECLARACIONES QUE VAMOS A DARLE A LA BASE DE DATOS.
 * 
 * @author acandalez
 *
 */
public class SQL_Statements {
	public static final String Regions_Consultation = "select * from REGIONS ";
	public static final String Regions_Consultation_ID = "SELECT * FROM REGIONS where REGION_ID = ?";
	public static final String New_Regions = " INSERT INTO REGIONS VALUES(?,'?')";

}
