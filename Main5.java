import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x, y;

        System.out.print("Ingrese x: ");
        x = teclado.nextInt();

        System.out.println("Ingrese y: ");
        y = teclado.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Tercer cuadrante");
        } else {
            System.out.println("Cuarto cuadrante");
        }
    }
}
