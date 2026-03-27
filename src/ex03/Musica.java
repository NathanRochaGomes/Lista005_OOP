package ex03;

public class Musica {
    private final String titulo;
    private final String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}

