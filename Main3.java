import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero: ");
        num = teclado.nextInt();

        if (num < 10) {
            System.out.print("Tiene un digito: ");
        } else {
            System.out.println("Tiene dos digitos");
        }
    }
}