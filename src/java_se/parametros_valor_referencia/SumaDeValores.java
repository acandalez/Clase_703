package java_se.parametros_valor_referencia;

public class SumaDeValores {//suma de valores
	
	public static void porValor(int a) {//variable por valor y de referencias
		
		a = a + 7;
		
	}
	public static void main(String[] args) {
		
		
		   int a = 5;
/*llamada*/porValor(a);
	       System.out.println(a);
		
	}

}
