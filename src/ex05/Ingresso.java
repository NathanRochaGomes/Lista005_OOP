package ex05;

public class Ingresso {
    private final Cliente cliente;
    private final Filme filme;
    private final String assento;

    public Ingresso(Cliente cliente, Filme filme, String assento) {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getAssento() {
        return assento;
    }

    @Override
    public String toString() {
        return filme.getNome() + " - " + assento + " - " + cliente.getNome();
    }
}

