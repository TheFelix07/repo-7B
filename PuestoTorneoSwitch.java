import java.util.Scanner;

public class PuestoTorneoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puesto;

        System.out.print("Ingrese el puesto del torneo (1-3): ");
        puesto = scanner.nextInt();

        // Usamos switch para determinar qué medalla o mensaje mostrar
        switch (puesto) {
            case 1:
                System.out.println("El primero obtiene la medalla de oro.");
                break;
            case 2:
                System.out.println("El segundo obtiene la medalla de plata.");
                break;
            case 3:
                System.out.println("El tercero obtiene la medalla de bronce.");
                break;
            default:
                System.out.println("Siga participando.");
        }

        scanner.close();
    }
}