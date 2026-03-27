package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cinema {
    private final List<Filme> filmesDisponiveis;
    private final List<Ingresso> ingressosVendidos;
    private final Set<String> assentosOcupados;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosOcupados = new HashSet<>();
        carregarFilmes();
    }

    private void carregarFilmes() {
        filmesDisponiveis.add(new Filme("Homem Aranha", 25.0, 10));
        filmesDisponiveis.add(new Filme("Batman", 28.0, 12));
        filmesDisponiveis.add(new Filme("Terrifier", 30.0, 18));
        filmesDisponiveis.add(new Filme("Toy Story", 20.0, 0));
        filmesDisponiveis.add(new Filme("Vingadores", 32.0, 14));
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public Ingresso venderIngresso(String nomeCliente, int idadeCliente, String nomeFilme, String assento)
            throws AssentoIndisponivelException, IdadeNaoPermitidaException, FilmeNaoEncontradoException {
        String assentoNormalizado = assento.trim().toUpperCase();
        validarAssento(assentoNormalizado);

        if (assentosOcupados.contains(assentoNormalizado)) {
            throw new AssentoIndisponivelException("O ingresso nao pode ser vendido pois seu assento nao esta mais disponivel!");
        }

        Filme filme = buscarFilme(nomeFilme);
        if (idadeCliente < filme.getIdadeMinima()) {
            throw new IdadeNaoPermitidaException("O ingresso nao pode ser vendido pois sua idade nao permite!");
        }

        Cliente cliente = new Cliente(nomeCliente, idadeCliente);
        Ingresso ingresso = new Ingresso(cliente, filme, assentoNormalizado);
        ingressosVendidos.add(ingresso);
        assentosOcupados.add(assentoNormalizado);

        return ingresso;
    }

    private Filme buscarFilme(String nomeFilme) throws FilmeNaoEncontradoException {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nomeFilme.trim())) {
                return filme;
            }
        }

        throw new FilmeNaoEncontradoException("Filme nao encontrado no catalogo.");
    }

    private void validarAssento(String assento) throws AssentoIndisponivelException {
        if (!assento.matches("[A-F][1-5]")) {
            throw new AssentoIndisponivelException("Assento invalido. Use de A1 ate F5.");
        }
    }
}

