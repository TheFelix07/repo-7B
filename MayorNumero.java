import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Ingrese el primer número: ");
        a = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("El mayor número es: " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor número es: " + b);
        } else {
            System.out.println("El mayor número es: " + c);
        }

        scanner.close();
    }
}