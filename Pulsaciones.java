import java.util.Scanner;
public class Pulsaciones{
 	public static void main(String[]args){
          	Scanner leer = new Scanner(System.in);
          	System.out.println("¿Cuál es tu edad? "); 
          	int edad = leer.nextInt();
          	double pulsaciones = (220 - edad)/10;
          	System.out.println("El número de pulsaciones por cada 10 seg. de ejercicio es de: " + pulsaciones) ;
	}
}