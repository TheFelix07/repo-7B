import java.util.Scanner;

public class DocenaAndOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        // Combinamos AND y OR para verificar la docena
        if ((numero >= 1 && numero <= 12)) {
            System.out.println("El número " + numero + " está en la primera docena (1-12).");
        } else if ((numero >= 13 && numero <= 24)) {
            System.out.println("El número " + numero + " está en la segunda docena (13-24).");
        } else if ((numero >= 25 && numero <= 36)) {
            System.out.println("El número " + numero + " está en la tercera docena (25-36).");
        } else if (!(numero < 1 || numero > 36)) { // Utilizamos OR aquí para verificar si el número está fuera de rango
            System.out.println("El número " + numero + " está fuera de rango.");
        }

        scanner.close();
    }
}