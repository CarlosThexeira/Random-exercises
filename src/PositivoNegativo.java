/*Leer un número por teclado mediante un método, y decir si es positivo o
negativo con otro método. La salida por consola puede ser algo así como: "el
número X es positivo"*/

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = leerNumero();
		
		esPositivoNegativo(numero);
		
	}
	
	private static int leerNumero() {
		
		int numero=0;
		
		System.out.println("Ingrese un número: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			numero = Integer.parseInt(sc.nextLine().trim());
			
		}catch(Exception javaException) {
			
			System.out.println("Se detecto un error, mas detalles:");
			System.out.println(javaException.getMessage());
			
		}
		
		return numero;
		
	}
	
	private static boolean esPositivoNegativo(int numero) {
		
		boolean positivo = false;
		
		if(numero==0) {
			
			System.out.println("El número ingresado es 0.");
			
		}
		else {
			
			if(numero>0) {
				
				System.out.println("El numero es positivo.");
				
			}
			else {
			
				System.out.println("El numero es negativo.");
				
			}
			
		}
		
		
		return positivo;
		
	}

}
