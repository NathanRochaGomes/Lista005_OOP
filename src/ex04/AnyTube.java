package ex04;

public class AnyTube implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        if (postagem.getTipo() != TipoPostagem.TEXTO) {
            throw new IllegalArgumentException("AnyTube aceita postagens de texto apenas neste metodo.");
        }

        System.out.println("Voce compartilhou essa postagem no AnyTube.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        throw new UnsupportedOperationException("AnyTube nao suporta compartilhamento de imagem nesse metodo.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        if (postagem.getTipo() != TipoPostagem.VIDEO) {
            throw new IllegalArgumentException("O tipo da postagem nao e video.");
        }

        System.out.println("Voce compartilhou esse video no AnyTube.");
    }
}

