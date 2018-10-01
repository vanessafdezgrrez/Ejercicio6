package ejercicio;

public class DVD extends Medio {

	private String director;

	public DVD() {
		super();
		this.director = "";
	}
	
	public DVD(boolean loTengo, String titulo, String comentario, String director) {
		super(loTengo, titulo, comentario);
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "DVD [director=" + director + ", isLoTengo()=" + isLoTengo() + ", getTitulo()=" + getTitulo()
				+ ", getComentario()=" + getComentario() + "]";
	}	
}
