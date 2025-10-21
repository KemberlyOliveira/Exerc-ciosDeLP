import java.util.Scanner;

public class consumoConbustivel {
    public static void main(String[] args) {
        // 12- consumo medio de um carro em 
        Scanner ler = new Scanner(System.in);
        double km, kmlitro, litro;

        System.out.println("informe a distancia percorrida(em km)");
        km = ler.nextDouble();
        System.out.println("gasto de combustivel (em litros)");
        litro = ler.nextDouble();

        kmlitro=km/litro;

        System.out.println("O gasto medio em  quilomoetros por litro (km/l) é:"+kmlitro);
    }
}
