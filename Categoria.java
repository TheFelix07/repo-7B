import java.util.Scanner;

public class Categoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char categoria;

        System.out.print("Ingrese la categoría (a, b o c): ");
        categoria = scanner.next().charAt(0);  // Leemos un solo carácter

        if (categoria == 'a') {
            System.out.println("hijo");
        } else if (categoria == 'b') {
            System.out.println("padres");
        } else if (categoria == 'c') {
            System.out.println("abuelos");
        } else {
            System.out.println("Categoría no válida");
        }

        scanner.close();
    }
}