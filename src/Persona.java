
/**
 * 
 * Define la clase persona con su edad actual y calcula los anios que le quedan para jubilarse
 * @author Medion
 */
public class Persona {

	
	int edadActual;
	
	
	/**
	 * Metodo constructor
	 * @param edad Edad actual del usuario
	 */
	public Persona(int edad) {
		this.edadActual = edad;
	}
	
	/**
	 * Metodo para calcular los anios hasta la jubilacion
	 * @param edad Edad actual del usuario
	 * @return Devuelve el resultado de la operacion
	 */
	public int calcularAniosHastaJubilacion(int edad) {
		
		int aniosHastaJubilacion = 67-edadActual;
		
		return aniosHastaJubilacion;
	}
}