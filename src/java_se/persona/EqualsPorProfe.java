package java_se.persona;

public class EqualsPorProfe {
	
	public boolean equals (Object obj) {
		
		boolean dev = false;
		Persona p = null;
		
		dev = (null != obj) && ((obj == this) || ((null != (p = esTipoPersona(obj)))
				&& (contienenLoMismo(this,p))));
		
		return dev;
	}

	private Persona esTipoPersona(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean contienenLoMismo(EqualsPorProfe equalsPorProfe, Persona p) {
		// TODO Auto-generated method stub
		return false;
	}
}
