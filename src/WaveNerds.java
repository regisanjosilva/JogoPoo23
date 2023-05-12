public class WaveNerds extends Criaturas {

    public WaveNerds() {
        super("WaveNerds", getRandomValue(10, 30),getRandomValue(5, 15),
        getRandomValue(5, 10 ), getRandomValue(1, 10), getRandomValue(200, 400), "Agua");
        
    }

    @Override
    public void atacar(Criaturas inimigos) {
        
    }
    
}
