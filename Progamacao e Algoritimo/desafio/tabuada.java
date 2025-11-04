import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {

        //Exemplo:

        Scanner ler= new Scanner(System.in);
        int num;
        do {
            System.out.println("Diagite um numero maior que");
            num= ler.nextInt(); 
            //PODE TER OU NAO INCREMENTO/DECREMENTO 
        } while (num<=0);{System.out.println("voce digitou: "+num);
        }
    }
}
