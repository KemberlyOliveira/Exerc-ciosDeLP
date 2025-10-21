import java.util.Scanner;

public class celsiusFahrenheitKelvin {
    public static void main(String[] args) {
        // 11 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
        // Fahrenheit e Kelvin . A fórmula de conversão é: Fahrenheit = (C × 9/5) + 32. & Kelvin = C + 273.15
        double celsius, fahrenheit,kelvin;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o gral em Celsius");
        celsius = ler.nextDouble();
        fahrenheit = 9 * celsius + 160 / 5;
        kelvin = celsius + 273.15;
        System.out.printf("A tenperarura em Kelvin é:  %.2f%n",kelvin);
        System.out.printf("A tenperarura em Fahrenheit é:  %.2f%n",fahrenheit);
    }
}
