import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {
        /*
         * 1- Escreva um programa que leia um número inteiro informado pelo usuário e
         * mostre na tela se esse número é par ou ímpar
         */
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.println("Informe o numero para verifivacação: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é mnpar");
        }
    }
}