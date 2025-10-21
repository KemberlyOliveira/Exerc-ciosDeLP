import java.util.Scanner;

public class cincoPor100Desconto {
    public static void main(String[] args) {
        // O cliente irá informar o valor 4 produtos de uma possível compra, faça um
        // programa que apresente o valor final da compra, e também apresente o valor
        // final da compra com desconto de 5% se o valor total da compra for maior ou
        // igual a 350 reais
        double produto1, produto2, produto3, produto4, reustado, desconto, decontado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o promeiro produto");
        produto1 = ler.nextDouble();
        System.out.println("Informe o segundo produto");
        produto2 = ler.nextDouble();
        System.out.println("Informe o treceiro produto");
        produto3 = ler.nextDouble();
        System.out.println("Informe o quarto produto");
        produto4 = ler.nextDouble();

        reustado = produto1 + produto2 + produto3 + produto4;

        if (reustado >= 350) {
            decontado = reustado * 0.05;
            desconto = reustado - decontado;
            System.out.println("valor com desconto" + desconto);
        } else {
            System.out.println("não tem desconto");
        }

        System.out.println("valor sem desconto" + reustado);
    }
}
