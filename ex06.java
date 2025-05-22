public class AnaliseVetor {

    public static int maiorValor(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }

    public static int menorValor(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }

    public static double mediaEntreMaiorEMenor(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);
        return (max + min) / 2.0;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 5, 23, 7, 3, 18};

        System.out.println("Maior valor: " + maiorValor(numeros));
        System.out.println("Menor valor: " + menorValor(numeros));
        System.out.println("Média entre maior e menor: " + mediaEntreMaiorEMenor(numeros));
    }
}
