import java.util.Scanner;

public class tipoDeaconto {
    public static void main(String[] args) {

        /*
         * 4- Elabore um programa que leia o valor de uma compra. Caso o valor seja:
         * • Menor que R$100,00 → não há desconto.
         * • Entre R$100,00 e R$200,00 → 10% de desconto.
         * • Acima de R$200,00 → 20% de desconto.
         * Mostre o valor final da compra com o desconto aplicado.
         */

        Scanner ler = new Scanner(System.in);
        double valor, desconto, valorf;
        System.out.println("digite o salario");
        valor = ler.nextDouble();
        if (valor < 100.00) {
            System.out.println("sem desonto ");
        } else if (valor >= 100.00 && valor <= 199.99) {
            desconto = valor * 0.1;
            valorf = valor - desconto;
            System.out.println("o valor final com 10% de desconto é: " + valorf);
        } else {
            esconto = valor * 0.2;
            valorf = valor - desconto;
            System.out.println("o valor final com 20% de desconto é: " + valorf);
        }
    }
}
