import java.util.Scanner;

public class DiasDelMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes;

        System.out.print("Ingrese el número del mes (1-12): ");
        mes = scanner.nextInt();

        // Usamos switch para determinar los días del mes
        switch (mes) {
            case 1: // Enero
                System.out.println("Enero tiene 31 días.");
                break;
            case 2: // Febrero
                System.out.println("Febrero tiene 28 o 29 días (dependiendo del año).");
                break;
            case 3: // Marzo
                System.out.println("Marzo tiene 31 días.");
                break;
            case 4: // Abril
                System.out.println("Abril tiene 30 días.");
                break;
            case 5: // Mayo
                System.out.println("Mayo tiene 31 días.");
                break;
            case 6: // Junio
                System.out.println("Junio tiene 30 días.");
                break;
            case 7: // Julio
                System.out.println("Julio tiene 31 días.");
                break;
            case 8: // Agosto
                System.out.println("Agosto tiene 31 días.");
                break;
            case 9: // Septiembre
                System.out.println("Septiembre tiene 30 días.");
                break;
            case 10: // Octubre
                System.out.println("Octubre tiene 31 días.");
                break;
            case 11: // Noviembre
                System.out.println("Noviembre tiene 30 días.");
                break;
            case 12: // Diciembre
                System.out.println("Diciembre tiene 31 días.");
                break;
            default:
                System.out.println("Mes no válido.");
        }

        scanner.close();
    }
}