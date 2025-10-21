import java.util.Scanner;

public class ati1 {

    public static void main(String[] args) {
        //1. Fazer um programa que leia um número N, entre 2 e 10, inclusive, e construa sua tabuada. Tal programa só deverá ser encerrado quando o usuário digitar O para o número N, caso contrário, deverá voltar, ler outro número N e construir a tabuada do mesmo.
        Scanner ler = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("me de um numero");
            numero = ler.nextInt();
            if (numero>=2 && numero<=10) {
                for(int i =1; i<=10; i++){
                    System.out.println(numero+"x"+i+"="+(numero*i));
                }
            }
            if (numero==0) {
                break;
            }
        }while(true);
    }
}