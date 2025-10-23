import java.util.Scanner;
public class Medidas{
	public static void main(String[]args){
		Scanner leer = new Scanner (System.in);
          	System.out. println(" Ingresa la medida en metros que quieres convertir: ");
          	double metros = leer.nextDouble();
          	double pies = (metros * 3.28084);
          	double pulgadas = (metros*39.3701);
          	System.out.println(metros + "metros equivalen a: " + pies + "pies");
          	System.out.println(metros + "metros equivalen a: " + pulgadas + "pulgadas");
	}
}