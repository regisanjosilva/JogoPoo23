import java.util.Random;

public class StoneDev extends Criaturas {

    
        
    public StoneDev() {
        super("StoneDev", getRandomValue(10, 30),getRandomValue(5, 15),
        getRandomValue(5, 10 ), getRandomValue(1, 10), getRandomValue(200, 400),"terra");
    }

    }

    @Override
    public void atacar(Criaturas inimigos) {
        int dano = calcularDano(inimigos.getDefesa());
        inimigos.setPontosDeVida(dano);
       

        
    }

    private int calcularDano(int defesa) {
        return 0;
    }

    public void ataqueFisico(Criaturas inimigos) {
        int dano = getPoder() * getAtaque() / inimigos.getDefesa();
        inimigos.setPontosDeVida(inimigos.getPontosDeVida() - dano);
        System.out.println(getNome() + "realisou uma ataque fisico em :" + inimigos.getNome() +
        "perdeu" + dano + "dano.");
        
    }
    
}
