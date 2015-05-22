package java_se.ejercicio_listapersona;

import javax.swing.JOptionPane;

public class MessageError extends Exception {// creamos el mensaje de error.

	public MessageError() {// paso la string con el mensaje

		JOptionPane
				.showMessageDialog(null, "Solo puedes introducir 4 personas");//
		System.out.println("Solo puedes introducir 4 personas");

	}

}
