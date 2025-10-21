import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        /*
         * 5 - Faça um algoritmo que leia a média final de um aluno e mostre a situação:
         * média abaixo de 5 = "insatisfatorio",
         * entre 5 e 6.9 = "regular",
         * 7 E 8 = "bom".
         * 9 e 10 = "muito bom"
         */
        Scanner ler = new Scanner(System.in);
        double num1, num2, num3, num4, notaF;

        System.out.println("dugite a nota do " + n + 1 + " bimestre:");
        num1 = ler.nextDouble();
        System.out.println("dugite a nota do " + n + 1 + " bimestre:");
        num2 = ler.nextDouble();
        System.out.println("dugite a nota do " + n + 1 + " bimestre:");
        num3 = ler.nextDouble();
        System.out.println("dugite a nota do " + n + 1 + " bimestre:");
        num4 = ler.nextDouble();

        notaF = (num1 + num2 + num3 + num4) / 4;
        if (notaF < 4) {
            System.out.println("Insatisfatorio");
        } else if ((notaF >= 4) && (notaF <= 6.9)) {
            System.out.println("Regular");
        } else if ((notaF>= 7) && (notaF<=8.9)) {
            System.out.println("Bom");
        } else{
            System.out.println("Muito Bom");
        }
    }
}
