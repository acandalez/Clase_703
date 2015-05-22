package java_se.ejemplos_basicos;

public class QueHace {

	int a;// por estar declarada aquí, fuera de cualquier método; a es un
			// atributo de la clase. Por lo tanto, es accesible y visible desde
			// todos los métodos de la clase
	static int b;
	
	public QueHace () {
		a = 0;
		b = 50;//Inicializar atributos
	}
	public QueHace (int valor) { //Otro constructor al cual recibe un valor de entrada
		a = valor;               //Cuando el contructor se repite se llama sobrecarga
	}

	void metodo() {
		
		System.out.println(a);
		a++; // equivalente --> a = a + 1;
	}

	public static void main(String[] args) {
		
		QueHace qh1 = null;
		QueHace qh2 = null;
		QueHace qh7 = null;
		

		qh1 = new QueHace();
		qh2 = new QueHace();
		qh7 = new QueHace();
		System.out.println(qh7.a);
		qh7 = new QueHace(7);
		System.out.println(qh7.a);
	

		//qh1.b++; //Tbm funciona con abvertencia, hace lo mismo que QueHace.b
		QueHace.b++;
		//System.out.println(qh1.b); Tbm funciona con abvertencia, hace lo mismo que QueHace.b
		System.out.println(QueHace.b);
		//System.out.println(qh2.b); Tbm funciona con abvertencia, hace lo mismo que QueHace.b
		System.out.println(QueHace.b);
		qh1.metodo();
		qh1.metodo();
		qh1.a = 33;
		qh1.metodo();
		System.out.println(qh1.a);
		qh2.metodo();
		System.out.println(QueHace.b);
	}

}
