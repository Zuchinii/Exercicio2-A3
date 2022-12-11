import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {

        System.out.println("Digite um numero ");
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        imprimeNumeros(n);

        teclado.close();
    }

    public static void imprimeNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println(" ");
        }
    }
}
