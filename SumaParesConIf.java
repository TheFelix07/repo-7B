import java.util.Scanner;

public class SumaParesConIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresamos las 3 notas
        System.out.print("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();

        // Inicializamos la variable suma
        int suma = 0;

        // Verificamos si las notas son pares y sumamos
        if (nota1 % 2 == 0) {
            suma += nota1;
        }

        if (nota2 % 2 == 0) {
            suma += nota2;
        }

        if (nota3 % 2 == 0) {
            suma += nota3;
        }

        // Mostramos el resultado
        System.out.println("La suma de las notas pares es: " + suma);

        scanner.close();
    }
}