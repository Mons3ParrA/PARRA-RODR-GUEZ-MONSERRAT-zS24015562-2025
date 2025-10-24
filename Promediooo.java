import java.util.Scanner;
public class Promediooo{
	public static void main(String[]args){
	Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa la calificación de tus materias. Primer materia: ");
		double cal1 = leer.nextDouble();
		System.out.println("Segunda materia: ") ;
		double cal2 = leer. nextDouble() ;
		System.out.println("Tercer materia: ");
		double cal3 = leer.nextDouble();
		double promedio = (cal1 + cal2 + cal3)/3;
		System.out.println("Tu promedio obtenido es de: " + promedio);
	}
}