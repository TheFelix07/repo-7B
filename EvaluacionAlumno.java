public class EvaluacionAlumno {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        scanner.close();
    }
}