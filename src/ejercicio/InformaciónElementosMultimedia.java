package ejercicio;

import java.util.ArrayList;
import java.util.List;

import herramientas.Salida;
import herramientas.Teclado;

public class InformaciónElementosMultimedia {

	public static void main(String[] args) {
		
		/*
		Queremos registrar información acerca de diferentes medios de almacenamiento multimedia.
		De los CDs será el nombre del artista y el número total de pistas, y un comentario acerca de él.
		De los DVD, qué es su director, un comentario y el título.
		Los CD y los Games tienen título.
		Disponemos de dos tipos de Games, los VideoGames y los BoardGame. De los primeros, queremos saber, por un enumerado para qué plataforma es y de los BoarGame, para qué sistema operativo también de un enumerado.
		Tando de los CD, como de los DVD y de cualquer Game, saber si ya lo tengo, el título y algún comentario.
		Dar de alta a una lista de medios de almacenamiento multimedia.
		 */
		
		String respuesta1 = "";
		String respuesta2 = "";
		String respuestaLoTengo = "";
		
		boolean loTengo = false;
		String titulo = "";
		String comentario = "";
		
		String nombreArtista = "";
		Integer numeroPista = 0;
		
		String director = "";
		
		Plataforma plataforma = Plataforma.OTRO;
		SistemaOperativo sistemaOperativo = SistemaOperativo.OTRO;
		
		CD c;
		VideoGame vg;
		BoardGame bg;
		DVD dvd;
		
		List<Medio> listaMedios = new ArrayList<Medio>();
		
		
		do {
			
			respuesta1 = Teclado.introducirCadenaTeclado("Medios de Almacenamiento Multimedia:\n1 - CD\n2 - Game\n3 - DVD\n¿Qué tipo de medio desea incluir? Inserte el número que corresponda: ");
			
			titulo = Teclado.introducirCadenaTeclado("Título: ");
			comentario = Teclado.introducirCadenaTeclado("Comentario: ");
			respuestaLoTengo = Teclado.introducirCadenaTeclado("¿Lo tiene (S/N)? ");
			loTengo = respuestaLoTengo.equalsIgnoreCase("S") ? true : false;		
			
			switch(respuesta1) {
			case "1":	nombreArtista = Teclado.introducirCadenaTeclado("Nombre del Artista: ");
						numeroPista = Teclado.introducirNumeroTeclado("Número de Pistas: ");
						c = new CD (loTengo, titulo, comentario, nombreArtista, numeroPista);
						listaMedios.add(c);
						break;
			case "2":	
				Integer tipo = Teclado.introducirNumeroTeclado("Tipo de Game a incluir (1 - VideoGame/2 - BoardGame) ");
				Integer respuestaPlataforma;
				Integer respuestaSistemaOperativo;
				switch (tipo) {
				case 1:respuestaPlataforma = Teclado.introducirNumeroTeclado("Tipo de Plataforma (1-MÓVIL, 2-TABLET, 3-SOBREMESA, 4-PORTÁTIL, 5-OTRO): ");
					switch(respuestaPlataforma) {
					case 1:plataforma = Plataforma.MÓVIL;break;
					case 2:plataforma = Plataforma.TABLET;break;
					case 3:plataforma = Plataforma.SOBREMESA;break;
					case 4:plataforma = Plataforma.PORTÁTIL;break;
					case 5:plataforma = Plataforma.OTRO;break;
					default:Salida.escribir("Opción no válida");
					}
					vg = new VideoGame (loTengo, titulo, comentario, plataforma);
					listaMedios.add(vg);
				break;
				case 2:respuestaSistemaOperativo = Teclado.introducirNumeroTeclado("Sistema Operativo (1-WINDOWS, 2-LINUX, 3-MAC, 4-OTRO: ");
					switch(respuestaSistemaOperativo) {
					case 1:sistemaOperativo = SistemaOperativo.WINDOWS;break;
					case 2:sistemaOperativo = SistemaOperativo.LINUX;break;
					case 3:sistemaOperativo = SistemaOperativo.MAC;break;
					case 4:sistemaOperativo = SistemaOperativo.OTRO;break;
					default:Salida.escribir("Opción no válida");
					}
					bg = new BoardGame(loTengo, titulo, comentario, sistemaOperativo);
					listaMedios.add(bg);
				break;
				default:Salida.escribir("Opción no válida");
				}
			break;
			case "3":	director = Teclado.introducirCadenaTeclado("Director: ");
						dvd = new DVD (loTengo, titulo, comentario, director);
						listaMedios.add(dvd);
						break;
			default:Salida.escribir("Opción no válida");
			}
			
			Salida.escribir("\n");
			
			respuesta2 = Teclado.introducirCadenaTeclado("¿Desea introduir otro medio (S/N)? ");
			
			Salida.escribir("\n");
			
		} while (respuesta2.equals("S"));
		
		for (Medio m:listaMedios) {
			Salida.escribir(m);
		}
	}
}
