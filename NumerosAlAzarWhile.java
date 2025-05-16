import java.util.Random;

public class NumerosAlAzarWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;
        int cantidad = 10;
        int contador = 0;

        // Ciclo while para generar y mostrar 10 números al azar
        while (contador < cantidad) {
            int numero = random.nextInt(100) + 1; // Generar número al azar entre 1 y 100
            System.out.println("Número aleatorio: " + numero);
            suma += numero;
            contador++;
        }

        // Calcular el promedio
        double promedio = suma / (double) cantidad;
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
    }
}