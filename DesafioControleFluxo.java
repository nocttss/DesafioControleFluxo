import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioControleFluxo {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = lerInteiro(terminal);

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = lerInteiro(terminal);

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static int lerInteiro(Scanner terminal) {
        while (!terminal.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro:");
            terminal.next();
        }
        return terminal.nextInt();
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = parametroDois; i <= parametroUm; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}