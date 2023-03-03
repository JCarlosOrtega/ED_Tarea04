
/**
* Con este programa calcularemos el mcd de dos números dados
*/
package mcd;

/**
* @author Juan Carlos Ortega Ibáñez
*
*/
import java.util.Scanner;

public class Mcd {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("Dame el primer numero");
		int num1 = sn.nextInt();

		System.out.println("Dame el segundo numero");
		int num2 = sn.nextInt();

		int res = mcd(num1, num2);

		System.out.println("MCD: " + res);
		sn.close();
	}

	/**
	 *
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int mcd(int num1, int num2) {

		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);

		int resultado = 0;
		do {
			resultado = b;
			b = a % b;
			a = resultado;
		} while (b != 0);

		return resultado;

	}

}