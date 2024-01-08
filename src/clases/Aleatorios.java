package clases;

import java.util.Random;

/**
 * Clase que proporciona métodos para generar números aleatorios
 * 
 * @author jgarcia
 * @version 1.0
 */
public class Aleatorios {

	/**
	 * Función que genera y muestra la cantidad especificada de números decimales aleatorios 
	 * entre 0 (inclusive) y 1 (exclusive) 
	 * 
	 * @param cantidad Cantidad de números generados que se mostrarán
	 */
	public static void numerosAleatorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que genera y muestra la cantidad especificada de números enteros aleatorios entre 0
	 * (inclusive) y el valor introducido como parámetro (exclusive) 
	 * 
	 * @param cantidad Cantidad de números generados que se mostrarán
	 * @param max      Valor máximo que tomarán los números generados aleatoriamente
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que genera y muestra la cantidad especificada de números enteros aleatorios entre los
	 * valores mínimo y máximo (ambos inclusive) introducidos como parámetro 
	 * 
	 * 
	 * @param cantidad Cantidad de números generados que se mostrarán
	 * @param minimo   Valor mínimo que tomarán los números generados aleatoriamente
	 * @param maximo   Valor máximo que tomarán los números generados aleatoriamente
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for (int i = 1; i <= cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo + 1);
			System.out.println(aleatorio);
		}
	}
}
