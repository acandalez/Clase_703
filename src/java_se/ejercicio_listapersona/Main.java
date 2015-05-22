package java_se.ejercicio_listapersona;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//
		// Persona p persona;
		// Alumno al1 = new Alumno("pedro","kimeneze",14)
		// al1.getPersona(x)
		//
		ListaPersonas lp = new ListaPersonas();
		Persona p = new Persona("kk", 21);

		lp.mostrar();
		lp.deserializar();
		lp.mostrar();
		System.out.println("sssxxxxssss");
		lp.insertarPersona(p);
		lp.mostrar();
		lp.insertarPersona(p);
		lp.mostrar();
		// lp.eliminarPersona(p);
		lp.mostrar();
		lp.insertarPersona(p);
		lp.mostrar();

	}

}
