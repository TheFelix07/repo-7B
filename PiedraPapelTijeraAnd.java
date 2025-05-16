import java.util.Scanner;

public class PiedraPapelTijeraAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int competidor1, competidor2;

        System.out.print("Ingrese la opción del primer competidor (0 = piedra, 1 = papel, 2 = tijera): ");
        competidor1 = scanner.nextInt();

        System.out.print("Ingrese la opción del segundo competidor (0 = piedra, 1 = papel, 2 = tijera): ");
        competidor2 = scanner.nextInt();

        // Usamos AND lógico para evaluar el ganador
        if ((competidor1 == 0 && competidor2 == 2) || (competidor1 == 1 && competidor2 == 0) || (competidor1 == 2 && competidor2 == 1)) {
            System.out.println("El primer competidor gana");
        } else if ((competidor2 == 0 && competidor1 == 2) || (competidor2 == 1 && competidor1 == 0) || (competidor2 == 2 && competidor1 == 1)) {
            System.out.println("El segundo competidor gana");
        } else {
            System.out.println("Es un empate");
        }

        scanner.close();
    }
}