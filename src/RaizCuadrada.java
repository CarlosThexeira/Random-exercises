import java.util.Scanner;

public class RaizCuadrada {

	public static void main(String[] args) {
		
		//Calcular la raíz cuadrada de un número introducido por teclado. Hay que
		//tener la precaución de comprobar que el número sea positivo.
		
		System.out.print("Ingrese un número: ");
		
		Scanner io = new Scanner(System.in);
		
		try {
			
			int numero = Integer.parseInt(io.nextLine().trim());
			
			if(numero>0) {
				
				System.out.println("La raiz cuadrada de "+numero+" es: "+Math.sqrt(numero));
				
			}
			
			
		}catch(Exception e) {
			
			System.out.println("Se detecto un error, mas detalles: ");
			System.out.println(e.getMessage()); 
			
		}
		
	}

}
