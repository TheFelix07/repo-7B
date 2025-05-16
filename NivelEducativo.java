import java.util.Scanner;

public class NivelEducativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso del curso
        System.out.print("Ingrese el número del curso (0 a 12): ");
        int curso = scanner.nextInt();

        // Evaluación del curso
        if (curso == 0) {
            System.out.println("Jardín de infantes");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("Primaria");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("Secundaria");
        } else {
            System.out.println("Curso no válido");
        }

        scanner.close();
    }
}