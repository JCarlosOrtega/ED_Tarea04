package notas;

import java.util.Scanner;

/**
 * @author Juan Carlos Ortega Ibáñez
 *
 */
/**
 * @version 1.1
 *
 */
public class Notas {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		/**
		 * @param reader, numero, calificacion
		 */
		Scanner reader = new Scanner(System.in); // Para pedir números por teclado
		int numero = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		numero = reader.nextInt();
		 /**
		  * @califica(numero)
		  * Éste método actúa según el parármetro que le introduzcamos
		  * Si es menor de 5 (suspoenso), de 5 a 7(aprobado), 
		  * de 8 a 10(Sobresaliente) y el resto no válidos.
		  * 
		  * Se encuentra en la clase califica dentro del paquete notas.
		  */
		calificacion = califica.califica(numero);

		System.out.println(calificacion);
		reader.close();
	}

//	public static String califica(int num_nota) {
//		String calificacion;
//		if (num_nota >= 0 && num_nota < 5)
//			calificacion = "Suspenso";
//		else if (num_nota >= 5 && num_nota < 8)
//			calificacion = "Aprobado";
//		else if (num_nota >= 8 && num_nota <= 10)
//			calificacion = "Sobresaliente";
//		else
//			calificacion = "La nota introducida no es correcta";
//		return calificacion;
//	}

}