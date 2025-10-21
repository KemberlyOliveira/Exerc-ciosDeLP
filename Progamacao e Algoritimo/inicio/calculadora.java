import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        // ln println coloca espaco
        // 1- Faça um algoritmo que receba 2 números e ao final mostre a soma,
        // subtração, multiplicação e a divisão dos números lidos.

        double num1, num2, resltado = 0;
        int opicao;
        Scanner ler = new Scanner(System.in);
        System.out.println(" Soma = 1 | Subtração = 2 | Multiplicação = 3 | Divisão = 4");
        opicao = ler.nextInt();
        System.out.println("Informe pirmeiro o numero");
        num1 = ler.nextInt();
        System.out.println("Informe pirmeiro o numero");
        num2 = ler.nextInt();

        if (opicao == 1) {
            resltado = num1 + num2;
        } else if (opicao == 2) {
            resltado = num1 - num2;
        } else if (opicao == 3) {
            resltado = num1 * num2;
        } else if (opicao == 4) {
            resltado = num1 / num2;
        }

        System.out.println("resutado: " + resltado);
    }
}
