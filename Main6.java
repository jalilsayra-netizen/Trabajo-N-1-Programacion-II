import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        int equilatero = 0, isoscesles = 0, escaleno = 0;

        System.out.print("Ingrese cantidad de triangulos: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Triangulo " + i);

            System.out.print("Lado 1: ");
            int a = teclado.nextInt();

            System.out.print("Lado 2: ");
            int b = teclado.nextInt();

            System.out.print("Lado 3: ");
            int c = teclado.nextInt();

            if (a == b && b == c) {
                System.out.println("Equilatero");
                equilatero++;
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
                isosceles++;
            } else {
                System.out.println("Escaleno");
                escaleno++;
            }
        }
        System.out.println("Cantidad de equilateros: " + equilatero);
        System.out.println("Cantidad de isosceles: " + isosceles);
        System.out.println("Cantidad de escalenos: " + escaleno);

        if (equilatero < isosceles && equilatero < escaleno) {
            System.out.println("Hay menos equilateros");
        } else if (isosceles < equilatero && isosceles < escaleno) {
            System.out.println("Hay menos isosceles");
        } else {
            System.out.println("Hay menos escalenos");
        }
    }
}