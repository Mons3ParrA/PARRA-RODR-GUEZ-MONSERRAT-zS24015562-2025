import java.util.Scanner;
public class raicescuadraticas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente A: ");
        double A = leer.nextDouble();
        System.out.println("Ingrese el coeficiente B: ");
        double B = leer.nextDouble();
        System.out.println("Ingrese el coeficiente C: ");
        double C = leer.nextDouble();
        leer.close();

        if (A == 0) {
            System.out.println("La ecuación no es cuadrática");
        } else {
            double discriminante = B * B - 4 * A * C;
            if (discriminante < 0) {
                System.out.println("Las raíces son imaginarias");
            } else if (discriminante == 0) {
                double raiz = -B / (2 * A);
                System.out.println("La raíz es: " + raiz);
            } else {
                double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
            }
        }
    }
}