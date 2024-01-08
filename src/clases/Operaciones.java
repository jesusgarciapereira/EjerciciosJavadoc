package clases;

/**
 * Clase que proporciona métodos para realizar operaciones matemáticas con dos
 * números
 * 
 * @author jgarcia
 * @version 1.0
 */
public class Operaciones {

	/**
	 * Primer número utilizado en las operaciones
	 */
	double num1;
	/**
	 * Segundo número utilizado en las operaciones
	 */
	double num2;

	/**
	 * Construcctor sin parámetros
	 */
	public Operaciones() {

	}

	/**
	 * Constructor que toma los dos números como parámetro
	 * 
	 * @param num1 Valor del primer número
	 * @param num2 Valor del segundo número
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Función para calcular la suma de ambos números
	 * 
	 * @return Resultado de la suma
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Función para calcular la resta de ambos números
	 * 
	 * @return Resultado de la resta
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Función para calcular el producto de ambos números
	 * 
	 * @return Resultado de la multiplicación
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Función para calcular la división entre ambos números, siempre que el segundo
	 * número sea distinto de 0
	 * 
	 * @return Resultado de la división, o 0 si el segundo número es 0
	 */

	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Función para comparar ambos números y devolver el mayor entre ellos
	 * 
	 * @return Valor del número mayor
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Función para comparar ambos números y devolver el menor entre ellos
	 * 
	 * @return Valor del número menor
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
