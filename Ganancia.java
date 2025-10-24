import java.util.Scanner;
public class Ganancia{
	public static void main(String[]args){
	Scanner leer = new Scanner (System.in);
		System.out.println("Ingresa la cantidad que deseas invertir: ");
		double inversion = leer.nextDouble();
		double montoF = (inversion*0.2) + inversion;
		double ganancia = (montoF - inversion);
		System.out.println("Monto total despues de un mes: " + montoF);
		System.out.println("Interés ganado en un mes: " + ganancia);
	}
}