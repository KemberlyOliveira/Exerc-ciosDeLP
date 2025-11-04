import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opicao;

        System.out.println("Selecione uma opição");
        System.out.println("1- X-Salada (R$ 15,00)");
        System.out.println("2- X-Baicon (R$ 18,00)");
        System.out.println("3- Refrigerante (R$ 6,00)");
        System.out.println("4- Suco (R$ 8,00)");
        opicao = ler.nextInt();

        switch (opicao) {
            case 1:
            System.out.println("Pedido conputado ");
            System.out.println("X-Salada (R$ 15,00)");
                break;
            case 2:
            System.out.println("Pedido conputado ");
            System.out.println("X-Baicon (R$ 18,00)");
                break;
            case 3:
            System.out.println("Pedido conputado ");
            System.out.println("Refrigerante (R$ 6,00)");
                break;
            case 4:
            System.out.println("Pedido conputado ");
            System.out.println("Suco (R$ 8,00)");
                break;
            default:
            System.out.println("Opição Invalida!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
        }
    }
}
