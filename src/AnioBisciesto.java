import java.util.Scanner;

/*
 Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4;
utilícese el operador módulo. ¡Pero hay más excepciones! Los múltiplos de
100 no son bisiestos, aunque sean múltiplos de 4. Pero los múltiplos de 400
sí, aunque sean múltiplos de 100. Qué follón. La Tierra es muy maleducada
al no ajustarse a los patrones de tiempo humanos.

Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sea
divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es
divisible entre 400, también resulta bisiesto.
 */

public class AnioBisciesto {

	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		
		try {
			
			System.out.print("Ingrese un año: ");
			int anio = io.nextInt();
			
			if(anio%4==0 || (anio%400==0 && anio%100==1)) {
				
				System.out.println("El año: "+anio+" es bisciesto.");
				
			}
			else
				System.out.println("El año: "+anio+" no es bisciesto.");
			
		}catch(Exception e) {
			
			System.out.println("Error, mas detalles: ");
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
	}

}
