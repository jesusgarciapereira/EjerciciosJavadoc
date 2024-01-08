package clases;

/**
 * Clase que contendrá los atributos, constructores y funciones referentes a una
 * esfera
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
	 * Construcctor sin parámetros
	 */
	public Esfera() {
		super();
	}

	/**
	 * Construcctor con el atributo como parámetro
	 * 
	 * @param radio Longitud del radio de la esfera
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * Función para calcular la superficie de la esfera mediante su correspondiente
	 * fórmula
	 * 
	 * @return Valor de la superficie de la esfera
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Función para calcular volumen de la esfera mediante su correspondiente
	 * fórmula
	 * 
	 * @return Valor del volumen de la esfera
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}
