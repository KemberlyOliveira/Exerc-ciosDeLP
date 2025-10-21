import java.util.Scanner;

public class descontoPORproduto {
    public static void main(String[] args) {
        /*
         * 3- Escreva um algoritmo que calcule o valor final a pagar de acordo com a
         * quantidade de produtos comprados e o valor final da compra que o cliente
         * deverá
         * informar. Se a quantidade de produtos for superior ou igual a 20 aplicar 15%
         * de
         * desconto, do contrário aplicar somente 5%.
         */
        Scanner ler = new Scanner(System.in);
        double valor, quantidade, porcemtagen, valorf;
        System.out.println("Digite o valor da unidade de sabonete ");
        valor = ler.nextDouble();
        System.out.println("Digite a quantidade de sabonete comprados");
        quantidade = ler.nextDouble();
        if (quantidade >= 20) {
            porcemtagen = valor * 0.15;
            valorf = porcemtagen - valor;
            System.out.println("O seu desconto é de 15% dando o valor de: " + valorf);
        } else {
            porcemtagen = valor * 0.05;
            valorf = porcemtagen - valor;
            System.out.println("O seu desconto é de 5% dando o valor de: " + valorf);
        }
    }
}
