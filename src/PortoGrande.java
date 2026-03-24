public class PortoGrande extends BasePorto {
    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (getQuantidadeBarcos() >= 10) {
            System.out.println("Atracacao negada! Seu barco deve ser atracado em um porto pequeno.");
        } else {
            super.atracarBarco(barco);
        }
    }
}