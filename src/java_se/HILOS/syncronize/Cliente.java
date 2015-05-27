package java_se.HILOS.syncronize;

public class Cliente implements Runnable {

	private String nombre;

	@Override
	public void run() {
		Taquilla taquilla = Taquilla.getTaquilla();

		for (int i = 0; i < 15; i++) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// synchronized (taquilla) { con el modo synchronized (if) forzamos
			// a que entre hilo por hilo

			if ((taquilla.quedanEntradas())) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				taquilla.comprarEntrada(this);
			} else {
				System.out.println("No quedan entradas, se siente");
			}
			// }//fin sync

		}

	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
