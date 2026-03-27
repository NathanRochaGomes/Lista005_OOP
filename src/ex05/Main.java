package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        System.out.println("Filmes disponiveis:");
        for (Filme filme : cinema.getFilmesDisponiveis()) {
            System.out.println("- " + filme.getNome() + " (R$ " + filme.getPreco() + ", idade minima " + filme.getIdadeMinima() + ")");
        }

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nQue filme voce deseja assistir? ");
            String nomeFilme = scanner.nextLine();

            System.out.print("Qual assento voce deseja? ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idade;
            try {
                idade = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Idade invalida.");
                continue;
            }

            try {
                Ingresso ingresso = cinema.venderIngresso(nomeCliente, idade, nomeFilme, assento);
                System.out.println("Ingresso vendido com sucesso! " + ingresso);
            } catch (AssentoIndisponivelException | IdadeNaoPermitidaException | FilmeNaoEncontradoException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja comprar outro ingresso? (s/n): ");
            String resposta = scanner.nextLine();
            continuar = "s".equalsIgnoreCase(resposta);
        }
    }
}

