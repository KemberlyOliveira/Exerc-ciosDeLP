import java.util.Scanner;

public class maioeMenorIgual {
    public static void main(String[] args) {
        /*
         * 5- Desenvolva um programa que leia dois números inteiros. O algoritmo deve
         * informar qual dos dois é maior ou se eles são iguais.
         */
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o prmeiro numero ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero ");
        num2 = ler.nextInt();

        if (num1 >= num2) {
            System.out.println("O numero " + num1 + "é maior que o numero " + num2);
        } else if (num1 <= num2) {
            System.out.println("O numero " + num1 + "é menor que o numero " + num2);
        } else {
            System.out.println("O numero " + num1 + "é igual que o numero " + num2);
        }
    }
}
