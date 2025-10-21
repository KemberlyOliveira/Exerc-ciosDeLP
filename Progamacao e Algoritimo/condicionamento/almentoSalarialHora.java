import java.util.Scanner;

public class almentoSalarialHora {
    public static void main(String[] args) {
        /*
         * 4- Monte um algoritmo que irá calcular o valor final do salário de um colaborador
         * de acordo com as horas trabalhadas, o usuário deverá informar a quantidade de
         * horas trabalhadas e o valor do salário base, se o valor de horas trabalhadas for
         * maior ou igual a 35, aplicar 20% de aumento no salário base.
         */
        Scanner ler = new Scanner(System.in);
        double horas, salarioB, porcemtagen, salarioF;
        System.out.println("Digite suas horas trabalhadas: ");
        horas = ler.nextDouble();
        System.out.println("Digite o valor do salário base");
        salarioB = ler.nextDouble();

        if (horas == 35) {
            porcemtagen = salarioB * 0.2;
            salarioF = salarioB + porcemtagen;
            System.out.println("seu salari o é: " + salarioF);
        } else {
            System.out.println("seu salari o é: " + salarioB);
        }

    }
}
