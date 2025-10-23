import java.util.Scanner;
public class Edad{
   	public static void main(String[]args){
		Scanner leer = new Scanner(System. in);
		System.out.println("Ingresa tu año de nacimiento: ");
          	int añoN = leer.nextInt();
          	System.out.println("ingresa el año en curso: ");
          	int añoC = leer.nextInt();
          	int edad = (añoC - añoN);
          	System.out.println("Tu edad es de: " + edad + " años");
     }
}