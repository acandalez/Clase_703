package java_se.XML_JAVA.practica2_JDOM;

public class Libro implements Comparable {
	private String isbn;
	private String titulo;
	private String autor;
	private String anyo;
	private String editorial;

	// Constructor por defecto
	public Libro() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // tipo de String m�s r�pido en
												// a�adir!
		sb.append("\nISBN: " + isbn);
		sb.append("\nT�tulo: " + titulo);
		sb.append("\nAutor: " + autor);
		sb.append("\nA�o: " + anyo);
		sb.append("\nEditorial: " + editorial);

		return sb.toString();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
