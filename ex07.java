import java.util.Scanner;

public class ex07 {

    // Método que calcula o fatorial de um número
    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            long resultado = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " = " + resultado);
        }

        scanner.close();
    }
}
