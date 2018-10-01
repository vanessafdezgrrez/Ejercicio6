package herramientas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {

	public static Integer introducirNumeroTeclado(String pregunta) /* throws NumberFormatException, IOException */ {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		Integer numero = null;

		try {
			System.out.print(pregunta);
			numero = Integer.parseInt(teclado.readLine());
		} catch (Exception e) {
		}
		return numero;
	}
	
	public static float introducirNumeroRealTeclado(String pregunta) {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		Float numeroreal = null;

		try {
			System.out.print(pregunta);
			numeroreal = Float.parseFloat(teclado.readLine());
		} catch (Exception e) {
		}
		return numeroreal;
	}
	
	public static String introducirCadenaTeclado(String pregunta) /* throws NumberFormatException, IOException */ {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		String salida = "";

		try {
			System.out.print(pregunta);
			salida = teclado.readLine();
		} catch (Exception e) {
		}
		return salida;
	}
}
