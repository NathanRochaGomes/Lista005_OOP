import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    static void main(String[] args) {

        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Goblin", 30, 5));
        inimigos.add(new Personagem("Orc", 50, 10));
        inimigos.add(new Personagem("Troll", 80, 15));
        
        Personagem jogador = new Personagem("Heroi", 100, 20);
        
        Random random = new Random();
        
        while (jogador.getVida() > 0 && !inimigos.isEmpty()) {
            System.out.println("\n=== Rodada de Combate ===");
            System.out.println("Vida do Herói: " + jogador.getVida());
            
            // Jogador ataca um inimigo aleatório
            int indiceSorteado = random.nextInt(inimigos.size());
            Personagem inimigoAlvo = inimigos.get(indiceSorteado);
            System.out.println("Herói ataca " + inimigoAlvo.getNome() + "!");
            inimigoAlvo.receberDano(jogador.getAtaque());


            // Inimigos vivos atacam o jogador
            for (Personagem inimigo : inimigos) {
                System.out.println(inimigo.getNome() + " contra-ataca!");
                inimigo.atacar(jogador);
            }
        }
        
        System.out.println("=== FIM DO COMBATE ===");
        if (jogador.getVida() > 0) {
            System.out.println("Parabéns! O Herói venceu com " + jogador.getVida() + " de vida restante!");
        } else {
            System.out.println("Game Over! O Herói foi derrotado...");
        }
    }
}
