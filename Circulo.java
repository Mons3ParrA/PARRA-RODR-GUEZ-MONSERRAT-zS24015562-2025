import java.util.Scanner;
public class Circulo{
	public static void main(String[]args){
        	Scanner leer = new Scanner(System.in);
      		System.out.println("Ingresa el valor del radio: ");
          	double radio = leer.nextDouble ();
          	double longitud = (2*3.1416 * radio);
          	double area = (radio * radio) * 3.1416;
          	System.out.println("La longitud de la circunterencia es: " + longitud);
          	System.out.println("El área del circulo es: " + area);
    	}
}