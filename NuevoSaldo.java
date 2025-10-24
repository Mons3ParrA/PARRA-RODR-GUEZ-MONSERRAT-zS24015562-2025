import java.util.Scanner;
public class NuevoSaldo{
	public static void main(String[]args){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu sueldo actual: ");
		double sueldoA = leer.nextDouble();
		double sueldoF = (sueldoA * 0.25) +sueldoA;
		System.out.println("Tu sueldo final es de: " + sueldoF);
	}
}