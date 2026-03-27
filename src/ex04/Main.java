package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Descricao: ");
        String descricao = scanner.nextLine();

        System.out.print("Tipo (texto, imagem, video): ");
        String tipoTexto = scanner.nextLine();

        Postagem postagem;
        try {
            postagem = new Postagem(titulo, descricao, TipoPostagem.fromTexto(tipoTexto));
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de postagem invalido.");
            return;
        }

        PlataformaSocial myBook = new MyBook();
        PlataformaSocial fotogram = new Fotogram();
        PlataformaSocial anyTube = new AnyTube();

        try {
            myBook.compartilharPostagem(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no MyBook.");
        }

        try {
            fotogram.compartilharImagem(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");
        }

        try {
            anyTube.compartilharVideo(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no AnyTube.");
        }
    }
}

