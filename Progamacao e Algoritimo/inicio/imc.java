import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        /*
         * Construa um algoritmo para realizar o cálculo do IMC de uma pessoa,
         * sabendo-se que o cálculo do IMC é feito dividindo o peso pela altura (em
         * metros) ao quadrado.
         * (peso/(altura*altura);
         */

        Scanner ler = new Scanner(System.in);
        float peso, altura, imc;

        System.out.println("informe o seu peso:");
        peso = ler.nextFloat();
        System.out.println("informe o sus altura:");
        altura = ler.nextFloat();

        imc = peso / (altura * altura);

        System.out.println("Seu imc é: " + imc);
        System.out.printf("Seu imc é: %.2f%n", imc);// %.2f%n Diminui as casa decimais
    }
}
