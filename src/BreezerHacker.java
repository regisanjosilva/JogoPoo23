public class BreezerHacker extends Criaturas {

    public BreezerHacker() {
        super("BreezerHacker", getRandomValue(10, 30),getRandomValue(5, 15),
        getRandomValue(5, 10 ), getRandomValue(1, 10), getRandomValue(200, 400), "Ar");
        
    }

    @Override
    public void atacar(Criaturas inimigos) {
    }  
}
