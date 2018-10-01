package ejercicio;

public class VideoGame extends Game {
	
	private Plataforma plataforma;

	public VideoGame() {
		super();
		this.plataforma = Plataforma.OTRO;
	}
	
	public VideoGame(boolean loTengo, String titulo, String comentario, Plataforma plataforma) {
		super(loTengo, titulo, comentario);
		this.plataforma = plataforma;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "VideoGame [plataforma=" + plataforma + ", isLoTengo()=" + isLoTengo() + ", getTitulo()=" + getTitulo()
				+ ", getComentario()=" + getComentario() + "]";
	}
}
