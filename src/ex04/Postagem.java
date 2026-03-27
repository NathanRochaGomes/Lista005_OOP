package ex04;

public class Postagem {
    private final String titulo;
    private final String descricao;
    private final TipoPostagem tipo;

    public Postagem(String titulo, String descricao, TipoPostagem tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoPostagem getTipo() {
        return tipo;
    }
}

