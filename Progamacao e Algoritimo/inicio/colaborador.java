import java.util.Scanner;

public class colaborador {
    public static void main(String[] args) {
        /*9- salario final de um colaborador por horas trabalhadas */
        Scanner ler = new Scanner(System.in);
        double horas, semana1, semana2, semana3, semana4, valorHoras, salarioF, bonus, salario;

        System.out.println("Digite a quantidade das horas trabalhadas por esse colaborador na primeira semana");
        semana1 = ler.nextDouble();
        System.out.println("Digite a quantidade das horas trabalhadas por esse colaborador na seguinda semana");
        semana2 = ler.nextDouble();
        System.out.println("Digite a quantidade das horas trabalhadas por esse colaborador na terceira semana");
        semana3 = ler.nextDouble();
        System.out.println("Digite a quantidade das horas trabalhadas por esse colaborador na quarta semana");
        semana4 = ler.nextDouble();
        System.out.println("Digite o valor das horas trabalhadas");
        valorHoras = ler.nextDouble();
        System.out.println("Digite o valor de um bonus(caso não tenha digite 0 --> Zero)");
        bonus = ler.nextDouble();

        if (bonus==0) {
        horas=semana1+semana2+semana3+semana4;
        salarioF=valorHoras*horas;
        System.out.println("o salario é: R$"+salarioF);
        }else{
        horas=semana1+semana2+semana3+semana4;
        salario=valorHoras*horas; 
        salarioF=((bonus/100)*salario)+salario;
        System.out.println("o salario é: R$"+salarioF);
        }

        


    }
}
