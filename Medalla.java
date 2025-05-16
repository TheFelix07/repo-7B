import java.util.Scanner;

public class Medalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puesto;

        System.out.print("Ingrese el puesto obtenido en el torneo: ");
        puesto = scanner.nextInt();

        if (puesto == 1) {
            System.out.println("El primero obtiene la medalla de oro.");
        } else if (puesto == 2) {
            System.out.println("El segundo obtiene la medalla de plata.");
        } else if (puesto == 3) {
            System.out.println("El tercero obtiene la medalla de bronce.");
        } else {
            System.out.println("Y para el resto, sigue participando.");
        }

        scanner.close();
    }
}