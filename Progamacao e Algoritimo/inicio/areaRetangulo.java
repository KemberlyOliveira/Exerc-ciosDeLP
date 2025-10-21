import java.util.Scanner;

public class areaRetangulo {
        public static void main(String[] args) {
            /*6. Construa um algoritmo para realizar o calculo da área de um retangulo, sendo que o usuário irá informar os dados. */

        Scanner ler=new Scanner(System.in);
        double aria, altura, base;
 
        System.out.println("Informe o valor da altura.");
        altura= ler.nextDouble();
        System.out.println("Informe o valor da base.");
        base= ler.nextDouble();

        aria= altura*base;

        System.out.println("o valor da aria é"+ aria);
    }
}
