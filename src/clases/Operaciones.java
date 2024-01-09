package clases;

/**
 * Clase que proporciona metodos para realizar operaciones matematicas con dos
 * numeros
 * 
 * @author jgarcia
 * @version 1.0
 */
public class Operaciones {

	/**
	 * Primer numero utilizado en las operaciones
	 */
	double num1;
	/**
	 * Segundo numero utilizado en las operaciones
	 */
	double num2;

	/**
	 * Construcctor sin parametros
	 */
	public Operaciones() {

	}

	/**
	 * Constructor que toma los dos numeros como parametro
	 * 
	 * @param num1 Valor del primer numero
	 * @param num2 Valor del segundo numero
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Funcion para calcular la suma de ambos numeros
	 * 
	 * @return Resultado de la suma
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Funcion para calcular la resta de ambos numeros
	 * 
	 * @return Resultado de la resta
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Funcion para calcular el producto de ambos numeros
	 * 
	 * @return Resultado de la multiplicacion
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Funcion para calcular la division entre ambos numeros, siempre que el segundo
	 * numero sea distinto de 0
	 * 
	 * @return Resultado de la division, o 0 si el segundo numero es 0
	 */

	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Funcion para comparar ambos numeros y devolver el mayor entre ellos
	 * 
	 * @return Valor del numero mayor
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Función para comparar ambos numeros y devolver el menor entre ellos
	 * 
	 * @return Valor del numero menor
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
