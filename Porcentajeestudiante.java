import java. util.Scanner;
public class PorcentajeEstudiante{
	public static void main (String[]args){
		Scanner leer = new Scanner(System.in);
		System.out. println("Ingresa la cantidad de alumnos en tu gropo: ");
		double alumnos = leer.nextDouble();
		System.out.println("Ingresa la cantidade de hombres que hay en tu grupo: ");
		double hombres = leer.nextDouble();
		double mujeres = (alumnos - hombres);
		double porcentajeH = (hombres / alumnos)*100;
		double porcentajeM = (mujeres /alumnos) * 100;
		System.out.println("Tú grupo de alúnos esta conformado por:");
		System.out.println(+ porcentajeH + " % hombres");
		System.out.println(+ porcentajeM + " % mujeres");
	}
}