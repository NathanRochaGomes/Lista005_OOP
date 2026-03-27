package ex03;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private final List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();
        carregarCatalogoPadrao();
    }

    private void carregarCatalogoPadrao() {
        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidencias", "Chitaozinho e Xororo"));
        musicasDisponiveis.add(new Musica("Anna Julia", "Los Hermanos"));
        musicasDisponiveis.add(new Musica("Ai Se Eu Te Pego", "Michel Telo"));
        musicasDisponiveis.add(new Musica("Tempo Perdido", "Legiao Urbana"));
    }

    public Musica pesquisarMusica(String titulo) throws MusicaNaoEncontradaException {
        for (Musica musica : musicasDisponiveis) {
            if (musica.getTitulo().equalsIgnoreCase(titulo.trim())) {
                return musica;
            }
        }

        throw new MusicaNaoEncontradaException("A musica " + titulo + " nao foi encontrada no sistema.");
    }
}

