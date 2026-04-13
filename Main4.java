import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
         int dia, mes, año;

         System.out.print("Dia: ");
         dia = teclado.nextInt();

         System.out.print("Mes: ");
         mes = teclado.nextInt();

         System.out.print("Año: ");
         año = teclado.nextInt();

         if (mes >= 1 && mes <= 3) {
             System.out.println("Primer trimestre");
         } else if (mes >= 4 && mes <= 6){
             System.out.println("Segundo trimestre");
         } else if (mes >= 7 && mes <= 9) {
             System.out.println("Tercer trimestre");
         } else {
             System.out.println("Cuarto trimestre");

         }
    }
}