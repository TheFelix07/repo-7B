import java.util.Scanner;

public class TablasMultiplicarAnidadas {
    public static void main(String[] args) {
        // Dos ciclos for anidados para mostrar todas las tablas de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Para separar cada tabla
        }
    }
}