package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.print("Nome da playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o nome da musica (ou 'sair'): ");
            String nomeMusica = scanner.nextLine();

            if ("sair".equalsIgnoreCase(nomeMusica)) {
                continuar = false;
                continue;
            }

            try {
                Musica musica = musicCloud.pesquisarMusica(nomeMusica);
                playlist.adicionarMusica(musica);
                System.out.println("Voce adicionou a musica " + musica.getTitulo() + " na playlist.");
            } catch (MusicaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }

        playlist.imprimir();
    }
}

