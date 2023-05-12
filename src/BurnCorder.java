public class BurnCorder extends Criaturas{

    public BurnCorder() {
        super("BurnCoder.java", getRandomValue(10, 30),getRandomValue(5, 15),
        getRandomValue(5, 10 ), getRandomValue(1, 10), getRandomValue(200, 400), "fogo");
        
    }

    @Override
    public void atacar(Criaturas inimigos) {
        
    }
    
}
