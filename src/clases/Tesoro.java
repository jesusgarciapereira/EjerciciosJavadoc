package clases;

import java.util.Random;

/**
 * Clase que representa un juego de busqueda del tesoro
 */
public class Tesoro {

	/**
	 * Tamannio del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Valor de la cordenada 'x' de la posicion del tesoro
	 */
	static int xTesoro;
	/**
	 * Valor de la cordenada 'y' de la posicion del tesoro
	 */
	static int yTesoro;
	/**
	 * Valor de la cordenada 'x' de la posicion del jugador
	 */
	int xJugador = 1;
	/**
	 * Valor de la cordenada 'y' de la posicion del jugador
	 */
	int yJugador = 1;

	/**
	 * Funcion que genera la posicion del tesoro asignando a los valores de sus
	 * cordenadas 'x' e 'y' sendos numeros generados aleatoriamente entre el 1 y el
	 * valor del tamannio del tablero (ambos inclusive)
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Funcion para mostrar el tablero con la posicion actual del jugador
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
	 * Funcion para mover al jugador en la direccion especificada sumando o restando
	 * 1 a una de sus cordenadas. Siempre y cuando se introduzca el parametro
	 * correcto y no se salga del tablero
	 * 
	 * @param movimiento Direccion del movimiento. Solo posibles: "arriba", "abajo",
	 *                   "izquierda" o "derecha"
	 * @return Codigo del resultado: 0 para movimiento exitoso, -1 para limite del
	 *         tablero, -2 para direccion no valida
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
	 * Funcion para comprobar si el jugador ha encontrado el tesoro
	 * 
	 * @return true, si las coordenadas de la posicion del jugador coinciden con las
	 *         de la posicion del tesoro; false en caso contrario
	 */
	boolean buscaTesoro() {
		boolean res = false;
		if (xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
