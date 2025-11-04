import java.util.Scanner;

public class maiorDE18 {
    public static void main(String[] args) {
        /*
         * 2- Escreva um algoritmo que calcule se o usuário é maior ou menor de idade, o
         * usuário deverá informar quantos anos ele tem, e o algoritmo deverá retornar uma
         * mensagem dizendo se ele é maior ou menor de idade
         */
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Voce é maior de idade");
        } else {
            System.out.println("Voce é maior de idade");
        }
    }
}
