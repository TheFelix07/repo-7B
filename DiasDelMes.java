import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mes;
        int dias;

        System.out.print("Ingrese el nombre del mes: ");
        mes = scanner.nextLine().toLowerCase(); // Lo pasamos a minúsculas para evitar problemas con mayúsculas

        if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || 
            mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre")) {
            dias = 31;
        } else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            dias = 30;
        } else if (mes.equals("febrero")) {
            dias = 28;
        } else {
            System.out.println("Mes no válido");
            scanner.close();
            return;  // Salir del programa si el mes es incorrecto
        }

        System.out.println("El mes de " + mes + " tiene " + dias + " días.");

        scanner.close();
    }
}