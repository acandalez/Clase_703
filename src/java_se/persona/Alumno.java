package java_se.persona;

public class Alumno extends Persona {

	private byte nota = 0;
	private Notas notaconletra = null;
	
	public int getNota() {
		return nota;
	}

	public void setNota(byte nota) {
		this.nota = nota;
	}

	public Alumno(String nombre, byte edad) {
		super(nombre,edad);
	}
	
	public Alumno(String nombre, int i, int j) {
		super(nombre,(byte) i);
		this.nota = (byte) j;
		this.notaconletra = this.tipoNota();
	}
	
	public String toString() {
		String alumno = null;
		
		alumno = "El nombre es " + this.nombre + ", la edad es " + this.edad 
				+ " y la nota es: " + this.notaconletra;
		
		return alumno; 
	}
	
	public enum Notas { //Es un tipo de dato que muestra un rango de valores constante
						//Con este método creamos el tipo Notas
		SOBRESALIENTE, NOTABLE, BIEN, APROBADO, SUSPENSO
	}
	
	private Notas tipoNota() {
		
		Notas nota_alumno = null;
		
		switch (this.nota) {
		case 10:
		case 9: nota_alumno = Notas.SOBRESALIENTE;
			break;
		case 8:
		case 7: nota_alumno = Notas.NOTABLE;
			break;
		case 6: nota_alumno = Notas.BIEN;
			break;
		case 5: nota_alumno = Notas.APROBADO;
			break;
		default: nota_alumno = Notas.SUSPENSO;
			break;
		}
		
//		switch (this.nota) { //Otra manera de hacer le switch
//		case 0:
//		case 1: 
//		case 2:
//		case 3:
//		case 4: nota_alumno = Notas.SUSPENSO;
//			break;
//		case 5: nota_alumno = Notas.APROBADO;
//			break;
//		case 6: nota_alumno = Notas.BIEN;
//			break;
//		case 7:
//		case 8: nota_alumno = Notas.NOTABLE;
//			break;
//		case 9:
//		case 10: nota_alumno = Notas.SOBRESALIENTE;
//			break;		
//		}
		return nota_alumno;	
	}

}
