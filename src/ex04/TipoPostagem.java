package ex04;

public enum TipoPostagem {
    TEXTO,
    IMAGEM,
    VIDEO;

    public static TipoPostagem fromTexto(String texto) {
        return TipoPostagem.valueOf(texto.trim().toUpperCase());
    }
}

