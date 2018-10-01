package ejercicio;

public class CD extends Medio {

	private String nombreArtista;
	private Integer numeroPista;
	
	public CD() {
		super();
		this.nombreArtista = "";
		this.numeroPista = 0;
	}
	
	public CD(boolean loTengo, String titulo, String comentario, String nombreArtista, Integer numeroPista) {
		super(loTengo, titulo, comentario);
		this.nombreArtista = nombreArtista;
		this.numeroPista = numeroPista;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public Integer getNumeroPista() {
		return numeroPista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public void setNumeroPista(Integer numeroPista) {
		this.numeroPista = numeroPista;
	}

	@Override
	public String toString() {
		return "CD [nombreArtista=" + nombreArtista + ", numeroPista=" + numeroPista + ", isLoTengo()=" + isLoTengo()
				+ ", getTitulo()=" + getTitulo() + ", getComentario()=" + getComentario() + "]";
	}	
}
