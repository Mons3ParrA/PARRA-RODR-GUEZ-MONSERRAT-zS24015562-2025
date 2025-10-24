import java.util.Scanner;
public class Valores{
	public static void main (String[]args){
	Scanner leer = new Scanner(System.in);

		int num1, num2, num3;
		int mayor, menor;
		int intermedio;

		System.out.println("Ingresa el primer número: ");
		num1 = leer.nextInt();
		System.out.println("Ingresa el segundo número: ");
		num2 = leer.nextInt();
		System.out.println("Ingresa el tercer número: ");
		num3 = leer.nextInt();

	if
		((num1 > num2) && (num1 > num3)){
		System.out.println(+ num1 + " Es el número mayor.");
	
		}else
	if 
		((num1<num2) && (num1>num3) || (num1> num2)&& (num1< num3)){
		System.out.println(+ num1 + " Es el número intermedio.");

		}else
	if
		((num1< num2) && (num1< num3)){
		System.out.println(+ num1 + " Es el número menor.");

		}else	

	if
		((num2 > num1) && (num2 > num3)){
		System.out.println(+ num2 + " Es el número mayor.");

		}else
	if
		((num2 < num1) && (num2 > num3) || (num2 > num1) && (num2 < num3)){
		System.out.println(+ num2 + " Es el número intermedio.");
	 
		}else

	if 
		((num2< num1) && (num2 < num3)){
		System.out.println(+ num2 +  " Es el número menor.");

		}else

	if
		((num3 > num1) && (num2 > num2)){
		System.out.println(+ num3 + " Es el número mayor.");

		}else
	if
		((num3 < num1) && (num3 > num2) || (num3 > num1) && (num3 < num2)){
		System.out.println(+ num3 + " Es el número intermedio.");

		}else

	if 
		((num3 < num1) && (num3 < num2)){
		System.out.println(+ num2 + " Es el número menor.");
	}
		
	}
}