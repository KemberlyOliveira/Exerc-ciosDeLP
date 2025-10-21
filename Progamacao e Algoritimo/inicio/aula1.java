import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {

        String nome;
        int telefone;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = leitura.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = leitura.nextInt();

        System.out.println("o seu nome é: " + nome + " e o telefone é: " + telefone);
    }
}