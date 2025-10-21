import java.util.Scanner;

public class termometro {
    public static void main(String[] args) {
        /*Escreva um programa que leia a temperatura em graus Celsius e classifique
da seguinte forma: abaixo de 0 = "Congelante", entre 0 e 25 = "Agradável", acima
de 25 = "Quente".
 */
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("digite uma temperatura");
        num = ler.nextInt();
        if (num<0) {
            System.out.println("Congelante");
        }else if (num>=0 && num<=25) {
            System.out.println("Agradável");
        }else{
            System.out.println("Quente");
        }
    }
}
