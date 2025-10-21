import java.util.Scanner;

public class idadeVoto {
    public static void main(String[] args) {
        // 2- Crie um programa que leia a idade de uma pessoa e mostre se ela pode ou
        // não votar (considere que a idade mínima para votar é 16 anos).

        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("me fale sua idade");
        idade = ler.nextInt();
        if (idade >= 16) {
            System.out.println("pode votar");
        } else {
            System.out.println("nao pode votar");
        }
    }
}
