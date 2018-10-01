package ejercicio;

public class Medio {

	private boolean loTengo;
	private String titulo;
	private String comentario;
	
	public Medio() {
		this.loTengo = false;
		this.titulo = "";
		this.comentario = "";
	}
	
	public Medio(boolean loTengo, String titulo, String comentario) {
		this.loTengo = loTengo;
		this.titulo = titulo;
		this.comentario = comentario;
	}

	public boolean isLoTengo() {
		return loTengo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setLoTengo(boolean loTengo) {
		this.loTengo = loTengo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
