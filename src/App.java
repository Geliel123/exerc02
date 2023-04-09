import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva o mnumero");

        int numero = teclado.nextInt();

        System.out.println("O numero informado foi " + numero + " ");
    }

}