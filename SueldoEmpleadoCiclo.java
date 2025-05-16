import java.util.Random;

public class SueldoEmpleadoCiclo {
    public static void main(String[] args) {
        Random rand = new Random();

        // Contador para las repeticiones
        int contador = 0;

        // Realizar 10 repeticiones
        while (contador < 10) {
            // Generación aleatoria de datos
            char categoria = generarCategoriaAleatoria();
            int antiguedad = rand.nextInt(21);  // Edad entre 0 y 20 años
            double sueldoBruto = rand.nextDouble() * (5000 - 1500) + 1500; // Sueldo entre 1500 y 5000

            // Calcular el aumento por antigüedad
            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5) {
                aumento = 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                aumento = 0.10;
            } else if (antiguedad > 10) {
                aumento = 0.30;
            }

            // Calcular el sueldo con el aumento por antigüedad
            double sueldoConAumento = sueldoBruto + (sueldoBruto * aumento);

            // Calcular el plus según la categoría
            double plus = 0;
            if (categoria == 'A') {
                plus = 1000;
            } else if (categoria == 'B') {
                plus = 2000;
            } else if (categoria == 'C') {
                plus = 3000;
            }

            // Calcular el sueldo neto
            double sueldoNeto = sueldoConAumento + plus;

            // Mostrar el resultado
            System.out.println("Repetición " + (contador + 1) + ":");
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo bruto: " + sueldoBruto);
            System.out.println("Sueldo neto: " + sueldoNeto);
            System.out.println();

            contador++;
        }
    }

    // Método para generar una categoría aleatoria
    public static char generarCategoriaAleatoria() {
        int categoriaAleatoria = (int) (Math.random() * 3); // Genera un número entre 0 y 2
        switch (categoriaAleatoria) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            default:
                return 'A'; // Por si acaso, nunca debería llegar aquí
        }
    }
}