package ejercicio;

public class BoardGame extends Game {

	private SistemaOperativo sistemaOperativo;

	public BoardGame() {
		super();
		this.sistemaOperativo = SistemaOperativo.OTRO;
	}
	
	public BoardGame(boolean loTengo, String titulo, String comentario, SistemaOperativo sistemaOperativo) {
		super(loTengo, titulo, comentario);
		this.sistemaOperativo = sistemaOperativo;
	}

	public SistemaOperativo getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "BoardGame [sistemaOperativo=" + sistemaOperativo + ", isLoTengo()=" + isLoTengo() + ", getTitulo()="
				+ getTitulo() + ", getComentario()=" + getComentario() + "]";
	}
}
