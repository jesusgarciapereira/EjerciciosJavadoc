package clases;

import java.util.Random;

/**
 * Clase que proporciona metodos para generar numeros aleatorios
 * 
 * @author jgarcia
 * @version 1.0
 */
public class Aleatorios {

	/**
	 * Funcion que genera y muestra la cantidad especificada de numeros decimales
	 * aleatorios entre 0 (inclusive) y 1 (exclusive)
	 * 
	 * @param cantidad Cantidad de numeros generados que se mostraran
	 */
	public static void numerosAleatorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Funcion que genera y muestra la cantidad especificada de numeros enteros
	 * aleatorios entre 0 (inclusive) y el valor introducido como parametro
	 * (exclusive)
	 * 
	 * @param cantidad Cantidad de numeros generados que se mostraran
	 * @param max      Valor maximo que tomaran los numeros generados aleatoriamente
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Funcion que genera y muestra la cantidad especificada de numeros enteros
	 * aleatorios entre los valores minimo y maximo (ambos inclusive) introducidos
	 * como parametro
	 * 
	 * @param cantidad Cantidad de numeros generados que se mostraran
	 * @param minimo   Valor minimo que tomaran los numeros generados aleatoriamente
	 * @param maximo   Valor maximo que tomaran los numeros generados aleatoriamente
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
