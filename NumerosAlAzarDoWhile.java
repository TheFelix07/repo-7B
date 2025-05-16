import java.util.Random;

public class NumerosAlAzarDoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int maximo = Integer.MIN_VALUE; // Inicializar con el valor más bajo posible
        int minimo = Integer.MAX_VALUE; // Inicializar con el valor más alto posible
        int contador = 0;

        // Ciclo do-while para generar 10 números al azar
        do {
            int numero = random.nextInt(100) + 1; // Generar número al azar entre 1 y 100
            System.out.println("Número aleatorio: " + numero);

            if (numero > maximo) {
                maximo = numero; // Actualizamos el máximo
            }
            if (numero < minimo) {
                minimo = numero; // Actualizamos el mínimo
            }

            contador++;
        } while (contador < 10);

        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
    }
}