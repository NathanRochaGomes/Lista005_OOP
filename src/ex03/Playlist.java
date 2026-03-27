package ex03;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String nome;
    private final List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void imprimir() {
        System.out.println("\nPlaylist: " + nome);
        if (musicas.isEmpty()) {
            System.out.println("(vazia)");
            return;
        }

        for (Musica musica : musicas) {
            System.out.println("- " + musica.getTitulo());
        }
    }
}

