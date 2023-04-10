import java.util.Scanner;

/**
 * Clase Principal del Sistema
 * Esta clase permite sumar dos cifras de tipo entero
 * @author Gonzalo
 *
 */


public class Start {
	
	
	/**
	 * Método para sumar dos números enteros
	 * @param n - Valor ingresado por el usuario
	 * @param x - Valor ingresado por el usuario
	 * @return  - Retorna un Valor entero con el resultado de la operación
	 */
	public static int sumaNumeros (int n, int x)
	
	{
		
		int res;
		
		res = n + x;
		
		System.out.println("La suma es "+ res);
		
		return  res;
		
		
	}

	/**
	 * Este es el método principal
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entradaDatos = new Scanner(System.in);
		
		int numUnoUno;
		int numDos;
		int salida;
		
		
		
		System.out.println("Introduzca un número");
		numUnoUno = entradaDatos.nextInt();
		System.out.println("Introduzca otro número");
		numDos = entradaDatos.nextInt();
		
		 salida=sumaNumeros (numUnoUno, numDos);
		 System.out.println(salida);
		 
	}

}
