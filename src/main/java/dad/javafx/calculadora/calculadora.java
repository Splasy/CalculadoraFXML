package dad.javafx.calculadora;

/**
 * Implementaci�n de la l�gica de una calculadora.
 * @author Fran Vargas
 */
public class calculadora {
	
	public static final char IGUAL = '='; 
	public static final char SUMAR = '+'; 
	public static final char RESTAR = '-'; 
	public static final char DIVIDIR = '/'; 
	public static final char MULTIPLICAR = '*';
	
	private static final char COMA = '.'; 
	
	private static Double operando;
	private static char operador;
	private static Boolean nuevoOperando;
	private static String pantalla;
	
	public calculadora() {
		borrar();
	}
	
	/**
	 * Devuelve el contenido de la pantalla de la calculadora.
	 * @return Cadena de texto con el contenido de la pantalla de la calculdora.
	 */
	public static String getPantalla() {
		return pantalla;
	}

	/**
	 * Inicializa por completo la calculadora, borrando la informaci�n que tiene memorizada y la pantalla.
	 */
	public static void borrar() {
		operando = 0.0;
		operador = '=';
		borrarTodo();
	}
	
	/**
	 * Borra lo que hay en la pantalla (el �ltimo operando introducido).
	 */
	public static void borrarTodo() {
		nuevoOperando = true;
		pantalla = "0.0";
	}
	
	/**
	 * Indica a la calculadora que realice la operaci�n indicada. 
	 * @param operador Operaci�n a realizar; usar una constante: IGUAL, SUMAR, RESTAR, MULTIPLCIAR, DIVIDIR.
	 */
	public static void operar(char operador) {
		nuevoOperando = true;
		double operando2 = Double.parseDouble(pantalla);
		switch (operador) {
			case SUMAR: operando += operando2; break;
			case RESTAR: operando -= operando2; break;
			case MULTIPLICAR: operando *= operando2; break;
			case DIVIDIR: operando /= operando2; break;
			case IGUAL: operando = operando2; break;
		}
		operador = operador;
		pantalla = "" + operando;
	}
	
	/**
	 * Inserta una coma en el operando actual (pantalla).
	 */
	public static void insertarComa() {
		if (!pantalla.contains("" + COMA)) {
			pantalla += COMA;
		}
	}
	
	/**
	 * Inserta un d�gito en el operando actual (pantalla).
	 * @param digito Digito a introducir en la pantalla.
	 */
	public static void insertar(char digito) {
		if (digito >= '0' && digito <= '9') {
			if (nuevoOperando) {
				nuevoOperando = false;
				pantalla = "";
			}
			pantalla += digito;
		} else if (digito == COMA) {
			insertarComa();
		}
	}
	
}
