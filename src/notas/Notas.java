package notas;

import java.util.Scanner;

/**
 * @author Juan Carlos Ortega Ibáñez
 *
 */
public class Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // Para pedir números por   teclado
		int n = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		n = reader.nextInt();

		calificacion = calif(n);

		System.out.println(calificacion);
		reader.close();
	}

	public static String calif(int n) {
		String calificacion;
		if (n >= 0 && n < 5)
			calificacion = "Suspenso";
		else if (n >= 5 && n < 8)
			calificacion = "Aprobado";
		else if (n >= 8 && n <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}

}