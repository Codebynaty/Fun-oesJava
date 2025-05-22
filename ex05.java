public class ex05 {

    public static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "domingo";
            case 2:
                return "segunda";
            case 3:
                return "terça";
            case 4:
                return "quarta";
            case 5:
                return "quinta";
            case 6:
                return "sexta";
            case 7:
                return "sabado";
            default:
                return "Dia da semana invalido";
        }
    }

    public static void main(String[] args) {
        System.out.println(exibirDiaSemana(1)); // domingo
        System.out.println(exibirDiaSemana(4)); // quarta
        System.out.println(exibirDiaSemana(7)); // sábado
        System.out.println(exibirDiaSemana(0)); // inválido
    }
}
