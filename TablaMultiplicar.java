import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        numero = scanner.nextInt();

        // Usamos un ciclo for para imprimir la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}