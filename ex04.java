import java.util.Scanner;

public class ex04 {

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (isPar(numero)) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }

        scanner.close();
    }
}
