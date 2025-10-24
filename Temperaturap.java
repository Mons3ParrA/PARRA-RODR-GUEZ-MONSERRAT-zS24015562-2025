import java.util.Scanner; 
public class Temperaturap{
	public static void main(String[]args){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa la temperatura en °C.");
		double grados = leer.nextDouble();
		double fahrenheit = (grados * 9.0/5.0)+32;
		double TAmbiente = (grados+273.15);
		System.out.println(+ grados + "°C equivalen a:" + fahrenheit + " °F");
		System.out.println(+ grados + "°C equivalen a:" + TAmbiente + " K (temperatura absoluta)");
	}
}