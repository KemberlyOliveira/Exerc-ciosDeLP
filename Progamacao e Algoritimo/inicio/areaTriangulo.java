import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        /*
         * 8. Construa um algoritmo para realizar o calculo da área de um triangulo,
         * sendo que o usuário irá informar os dados.
         */

        Scanner ler = new Scanner(System.in);
        Float area, altura, base;

        System.out.println("Informe a altura do triangulo:");
        altura = ler.nextFloat();
        System.out.println("Informe a base do triangulo:");
        base = ler.nextFloat();

        area = (altura * base) / 2;

        System.out.println("A area do triangulo é: " + area);
    }
}
