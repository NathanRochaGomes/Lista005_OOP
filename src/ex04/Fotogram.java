package ex04;

public class Fotogram implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        throw new UnsupportedOperationException("Fotogram nao suporta esse tipo de compartilhamento.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        if (postagem.getTipo() != TipoPostagem.IMAGEM) {
            throw new IllegalArgumentException("Fotogram aceita apenas postagens do tipo imagem.");
        }

        System.out.println("Voce compartilhou essa postagem no Fotogram.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Voce compartilhou esse video no Fotogram.");
    }
}

