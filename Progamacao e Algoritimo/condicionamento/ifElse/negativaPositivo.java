import java.util.Scanner;

public class negativaPositivo {
    public static void main(String[] args) {

        // 1. Fazer um programa que leia um número N, entre 2 e 10, inclusive, e
        // construa sua tabuada. Tal programa só deverá ser encerrado quando o usuário
        // digitar O para o número N, caso contrário, deverá voltar, ler outro número N
        // e construir a tabuada do mesmo.

        Scanner ler = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero");
        num = ler.nextInt();

        if (num >= 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("o numero é negativo");
        }
    }
}