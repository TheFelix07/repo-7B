import java.util.Scanner;

public class VocalOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char caracter;

        System.out.print("Ingrese un carácter: ");
        caracter = scanner.next().charAt(0);

        // Usamos OR lógico para comprobar si el carácter es una vocal
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
            caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("El carácter es una vocal.");
        } else {
            System.out.println("El carácter no es una vocal.");
        }

        scanner.close();
    }
}