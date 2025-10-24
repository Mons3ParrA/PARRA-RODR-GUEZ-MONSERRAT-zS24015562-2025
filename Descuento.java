import java.util.Scanner;
public class Descuento{
	public static void main(String[]args){
	Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el monto original de tu compra: ");
		double MontoAc = leer.nextDouble();
		double MontoFin = MontoAc - (0.15*MontoAc);
		System.out.println("El monto fnal de tu compra es de: " + MontoFin + " pesos");
	}
}