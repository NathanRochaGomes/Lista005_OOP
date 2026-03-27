package ex04;

public class MyBook implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Voce compartilhou essa postagem no MyBook.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Voce compartilhou essa imagem no MyBook.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Voce compartilhou esse video no MyBook.");
    }
}

