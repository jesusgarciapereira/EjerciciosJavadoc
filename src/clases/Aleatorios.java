package clases;

import java.util.Random;

/**
 * Clase en la que se definen las funciones para generar números aleatorios
 * 
 * @author jgarcia
 * @version 1.0
 */
public class Aleatorios {

	/**
	 * Función que muestra tantos números aleatorios como se indique
	 * 
	 * @param cantidad Cantidad de números que se mostrarán
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que muestra tantos números aleatorios como se indique con un límite
	 * máximo
	 * 
	 * @param cantidad Cantidad de números que se mostrarán
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
	 * Función que muestra tantos números aleatorios como se indique con un límite
	 * mínimo y un límite máximo
	 * 
	 * @param cantidad Cantidad de números que se mostrarán
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
