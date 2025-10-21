import java.util.Scanner;

public class inposto15Por100 {
    public static void main(String[] args) {
        /*10- inposto de 15% */
        Scanner ler = new Scanner(System.in);

        double resltado, valor, retorno;
        System.out.println("digite o valor que você deseja ver o lucro liqudo de um desconto de 15%");
        valor = ler.nextDouble();

        resltado = valor * 0.15;
        retorno = valor - resltado;
        System.out.println("o valor do inposto é de: "+resltado);
        System.out.println("o valor liquido é: R$" + retorno);
    }
}
