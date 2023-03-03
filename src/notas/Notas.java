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
		Scanner reader = new Scanner(System.in); // Para pedir números por teclado
		int numero = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		numero = reader.nextInt();

		calificacion = califica(numero);

		System.out.println(calificacion);
		reader.close();
	}

	public static String califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 8)
			calificacion = "Aprobado";
		else if (num_nota >= 8 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}

}