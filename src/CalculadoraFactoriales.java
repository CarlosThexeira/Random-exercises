import java.util.Scanner;

public class CalculadoraFactoriales {

	public CalculadoraFactoriales() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.print("Ingrese un valor: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int input = sc.nextInt();
			CalcularFactorial(input);
			
			
		}catch(Exception e) {
			
			System.out.println("Error: "+e.getMessage());
			
		}
		
		
	}
	
	private static void CalcularFactorial(long parm) {
		
		System.out.println("Factorial de "+parm);
		long i = 1;
		long producto = 1;
		
		if(parm!=0) {
			
			if(parm==1) {
				
				System.out.println(parm+"!="+1);
				
			}
			else {
				
				System.out.print(parm+"!=");
				
				while(parm>=i){
					
					if(parm==i) {
						System.out.print(i+"=");
					}
					else {
						System.out.print(i+"x");
					}
					
					producto*=i;
					
					i++;
					
				}
				
				System.out.print(producto);
				
			}
		}
	}

}
