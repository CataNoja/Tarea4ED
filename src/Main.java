import java.util.Scanner;

/**
 * 
 * Clase principal del sistema
 * @author Medion
 */
public class Main {

	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creo objeto de la clase scanner para que el usuario introduzca su edad 
		 * y almacenarlo en la variable edad
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		/**
		 * Creo una instancia de la clase Persona para calcular los anios hasta la
		 * jubilacion y mostrar en consola el mensaje correspondiente
		 */
		Persona trabajador = new Persona(edad);
		
		int aniosHastaJubilacion = trabajador.calcularAniosHastaJubilacion(edad);
		
		if (aniosHastaJubilacion <= 10) {
			
			System.out.println("Sólo te quedan " + aniosHastaJubilacion + " años. ¡Vámos que ya queda poco!");
			
		}
		
		else if (aniosHastaJubilacion >= 20) {

			System.out.println("Te quedan " + aniosHastaJubilacion + " años. ¡A seguir trabajando gandul!");
			
			
			System.out.println("Probando actualización del código para github");
			entrada.close();
		}
	}
}
