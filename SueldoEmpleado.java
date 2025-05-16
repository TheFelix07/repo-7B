import java.util.Scanner;

public class SueldoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la categoría del empleado (A, B, C): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Ingrese la antigüedad del empleado (en años): ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        // Calcular el aumento por antigüedad
        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05; // 5% de aumento
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10; // 10% de aumento
        } else if (antiguedad > 10) {
            aumento = 0.30; // 30% de aumento
        }

        // Calcular el sueldo con el aumento por antigüedad
        double sueldoConAumento = sueldoBruto + (sueldoBruto * aumento);

        // Calcular el plus según la categoría
        double plus = 0;
        if (categoria == 'A' || categoria == 'a') {
            plus = 1000;
        } else if (categoria == 'B' || categoria == 'b') {
            plus = 2000;
        } else if (categoria == 'C' || categoria == 'c') {
            plus = 3000;
        }

        // Calcular el sueldo neto
        double sueldoNeto = sueldoConAumento + plus;

        // Mostrar el resultado
        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);

        scanner.close();
    }
}