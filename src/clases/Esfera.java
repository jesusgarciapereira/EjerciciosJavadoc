package clases;

/**
 * Clase que representa una esfera con sus atributos, constructores y funciones
 * asociadas
 * 
 * @author jgarcia
 * @version 1.0
 */
public class Esfera {
	/**
	 * Longitud del radio de la esfera
	 */
	double radio = 1.0;

	/**
	 * Construcctor sin parametros
	 */
	public Esfera() {
		super();
	}

	/**
	 * Constructor que toma el radio como parametro
	 * 
	 * @param radio Longitud del radio de la esfera
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * Funcion para calcular la superficie de la esfera utilizando la formula
	 * correspondiente
	 * 
	 * @return Valor de la superficie de la esfera
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Funcion para calcular el volumen de la esfera utilizando la formula
	 * correspondiente
	 * 
	 * @return Valor del volumen de la esfera
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}
