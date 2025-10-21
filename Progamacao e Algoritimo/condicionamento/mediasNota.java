import java.util.Scanner;

public class mediasNota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2, num3, num4, notaF,n=0;
        String nome;

        System.out.println("digite o nome do(a) aluno(a)");
        nome = ler.nextLine();
        System.out.println("dugite a nota do "+n+1+" bimestre:");
        num1 = ler.nextDouble();
        System.out.println("dugite a nota do "+n+1+" bimestre:");
        num2 = ler.nextDouble();
        System.out.println("dugite a nota do "+n+1+" bimestre:");
        num3 = ler.nextDouble();
        System.out.println("dugite a nota do "+n+1+" bimestre:");
        num4 = ler.nextDouble();

        notaF = (num1 + num2 + num3 + num4)/4;
        if (notaF>=7) {
            System.out.println("Aluno(a) Aprovado"); 
            System.out.println("A nota final do(a) aluno(a) " + nome + " é: " + notaF);
        }else{
            System.out.println("Aluno(a) não Aprovado");
            System.out.println("A nota final do(a) aluno(a) " + nome + " é: " + notaF);
        }
       
    }
}
