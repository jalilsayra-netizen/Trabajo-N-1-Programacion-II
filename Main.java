import java.util.Scanner;

 class NotaAlumno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nota: ");
        int nota = input.nextInt();

        if (nota == 10) {
            System.out.println("Sobresaliente");
        } else if (nota >= 4) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Desaprobó");
        }

    }
}
