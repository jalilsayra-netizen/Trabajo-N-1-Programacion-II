import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int n1, n2, n3;
            double promedio;

            System.out.print("Nota 1: ");
            n1 = teclado.nextInt();

            System.out.print("Nota 2: ");
            n2 = teclado.nextInt();

            System.out.print("Nota 3: ");
            n3 = teclado.nextInt();

            promedio = (n1 + n2 + n3) / 3.0;

            if (promedio >= 8) {
                System.out.println("Promocionado");
            } else {
                System.out.println("No promociona");
            }
        }
    }

