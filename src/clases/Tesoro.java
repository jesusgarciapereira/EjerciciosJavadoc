package clases;

import java.util.Random;

/**
 * Clase que representa un juego de búsqueda del tesoro
 */
public class Tesoro {

	/**
	 * Tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Valor de la cordenada 'x' de la posición del tesoro
	 */
	static int xTesoro;
	/**
	 * Valor de la cordenada 'y' de la posición del tesoro
	 */
	static int yTesoro;
	/**
	 * Valor de la cordenada 'x' de la posición del jugador
	 */
	int xJugador = 1;
	/**
	 * Valor de la cordenada 'y' de la posición del jugador
	 */
	int yJugador = 1;

	/**
	 * Función que genera la posición del tesoro asignando a los valores de sus
	 * cordenadas 'x' e 'y' sendos números generados aleatoriamente entre el 1 y el
	 * valor del tamaño del tablero (ambos inclusive)
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Función para mostrar el tablero con la posición actual del jugador
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}

	/**
	 * Función para mover al jugador en la dirección especificada sumando o restando
	 * 1 a una de sus cordenadas. Siempre y cuando se introduzca el parámetro
	 * correcto y no se salga del tablero
	 * 
	 * @param movimiento Dirección del movimiento. Sólo posibles: "arriba", "abajo",
	 *                   "izquierda" o "derecha"
	 * @return Código del resultado: 0 para movimiento exitoso, -1 para límite del
	 *         tablero, -2 para dirección no válida
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}

		return res;
	}

	/**
	 * Función para comprobar si el jugador ha encontrado el tesoro
	 * 
	 * @return true, si las coordenadas de la posición del jugador coinciden con las
	 *         de la posición del tesoro; false en caso contrario
	 */
	boolean buscaTesoro() {
		boolean res = false;
		if (xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
