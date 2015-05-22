package java_se.parametros_valor_referencia;

public class EjercicioEjemploPorValor {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//metodo que de un array de numeros enteros y un valor incremental me devuelva un nuevo array que sea el resultado de
//sumar un valor de cada valor de entrada.		
		
		int [] numero = {3,6,8,33};
		int [] numeros = sumaNumeros (numero,3);
		
		//muestra los arrays
		
		for (int i = 0; i < numeros.length ; i++){//imprime los valores
			
			System.out.println(numeros[i]);
			
		}
		

	}
	public static int [] sumaNumeros (int numero[], int valor){//doy el numero y devuelvo el numero incrementado
		
		
		int [] numeros = new int [numero.length]; //declaro la array numeros e inicializo la cadena numero para darle el valor
		
			for (int i = 0; i < numeros.length ; i++){//recorre la cadena 
				
				numeros [i] = numero[i] + valor;//numero [i] es donde vamos a almacenar los nuevos datos de numero[i] + 3
				
			}
			return numeros;
			
			
		
	}

}
