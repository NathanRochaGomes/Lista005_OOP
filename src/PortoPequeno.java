public class PortoPequeno extends BasePorto {
    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (getQuantidadeBarcos() < 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println("Porto " + getNome() + " esta cheio! Nao e possivel atracar o barco " + barco.getNome());
        }
    }
}