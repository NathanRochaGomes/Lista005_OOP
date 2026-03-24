import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    private String nome;
    private List<Barco> barcos;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcos = new ArrayList<>();
    }

    public void atracarBarco(Barco barco) {
        this.barcos.add(barco);
        System.out.println("Barco " + barco.getNome() + " atracado no porto " + this.nome);
    }

    public void desatracarBarco(Barco barco) {
        this.barcos.remove(barco);
        System.out.println("Barco " + barco.getNome() + " desatracado do porto " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeBarcos() {
        return barcos.size();
    }
}