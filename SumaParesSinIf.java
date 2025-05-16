import java.util.Scanner;

public class SumaParesSinIf {
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

        // Usamos el operador ternario para sumar los pares
        suma += (nota1 % 2 == 0) ? nota1 : 0;
        suma += (nota2 % 2 == 0) ? nota2 : 0;
        suma += (nota3 % 2 == 0) ? nota3 : 0;

        // Mostramos el resultado
        System.out.println("La suma de las notas pares es: " + suma);

        scanner.close();
    }
}