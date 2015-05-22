package java_se.password;

//import java.io.ObjectInputStream.GetField;

public class MainPassword {
	
		public static void main(String[] args) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		
		String pwguardada = null;
		
		Password pw = null;
		PedirPass pd = null;
		
		pd = new PedirPass();
		
		do {
			pwguardada = pd.introPassword();
			pw = new Password(pwguardada);	
		} while (pw.esPasswordBuena() != true);
		
		System.out.println("La contraseña introducida se ha creado correctamente :-)");
		
	}
}
