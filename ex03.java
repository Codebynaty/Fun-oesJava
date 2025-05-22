import java.util.Scanner;

public class ex03 {

    public static int encontrarMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int maior = encontrarMax(numero1, numero2);

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
