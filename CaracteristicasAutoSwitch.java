import java.util.Scanner;

public class CaracteristicasAutoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char clase;

        System.out.print("Ingrese la clase del auto ('a', 'b' o 'c'): ");
        clase = scanner.next().charAt(0);

        // Usamos switch para mostrar las características según la clase
        switch (clase) {
            case 'a':
                System.out.println("Clase A: El auto tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("Clase B: El auto tiene 4 ruedas, un motor, cierre centralizado y aire acondicionado.");
                break;
            case 'c':
                System.out.println("Clase C: El auto tiene 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag.");
                break;
            default:
                System.out.println("Clase no válida.");
        }

        scanner.close();
    }
}