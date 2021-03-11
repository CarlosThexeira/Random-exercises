import java.util.Scanner;

/*Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la
resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3, el resultado
debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado debe ser B – A,
es decir, 3.*/

public class Restar {

	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		try {
			
			System.out.print("Ingrese un número: ");
			int numeroA = io.nextInt();
			
			System.out.print("\nIngrese otro número: ");
			int numeroB = io.nextInt();
			
			if(numeroA>numeroB) 	
				System.out.println(numeroA-numeroB);
			else
				System.out.println(numeroB-numeroA);
				
		}catch(Exception e) {
			
			System.out.println("Error detectado, mas detalles: ");
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
