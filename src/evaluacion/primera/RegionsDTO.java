package evaluacion.primera;

/**
 * EN ESTA CLASE DEFINIMOS LOS ATRIBUTOS DE REGIONS
 * 
 * @author acandalez
 *
 */
public class RegionsDTO {

	private int Region_ID;
	private String Region_Name;

	public RegionsDTO() {

		this.Region_ID = Region_ID;
		this.Region_Name = Region_Name;

	}

	public int getRegion_ID() {
		return Region_ID;
	}

	public void setRegion_ID(int region_ID) {
		Region_ID = region_ID;
	}

	public String getRegion_Name() {
		return Region_Name;
	}

	public void setRegion_Name(String region_Name) {
		Region_Name = region_Name;
	}

	@Override
	public String toString() {

		return Region_ID + "\t \t " + Region_Name;
	}
}
