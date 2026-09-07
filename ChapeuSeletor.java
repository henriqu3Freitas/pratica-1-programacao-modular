package pratica1;

import java.util.Scanner;

public class ChapeuSeletor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("\n=== Chapeu Seletor de Hogwarts ===");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Coragem: ");
            double coragem = lerNota(scanner);

            System.out.print("Inteligencia: ");
            double inteligencia = lerNota(scanner);

            System.out.print("Ambicao: ");
            double ambicao = lerNota(scanner);

            System.out.print("Lealdade: ");
            double lealdade = lerNota(scanner);

            System.out.print("Estrategia: ");
            double estrategia = lerNota(scanner);

            System.out.print("Criatividade: ");
            double criatividade = lerNota(scanner);

            Aluno aluno = new Aluno(nome, idade, coragem, inteligencia,
                    ambicao, lealdade, estrategia, criatividade);
            aluno.calcularCasa();
            aluno.exibirInformacoes();

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static double lerNota(Scanner scanner) {
        return Double.parseDouble(scanner.nextLine().replace(',', '.'));
    }
}
