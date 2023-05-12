import java.util.Random;

public abstract class Criaturas {
    private String nome;
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int pontosDeVida;
    private String elemento;
    
    public Criaturas(String nome, int poder, int ataque, int defesa, int velocidade, int pontosDeVida, String elemento) {
        this.nome = nome;
        this.poder = poder;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.pontosDeVida = pontosDeVida;
        this.elemento = elemento;
    }
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;

      
    }
     public String getElemento() {
        return elemento;
    }
    public boolean foiDerrotado(){
        return pontosDeVida <=0;
    }
   
    public abstract void atacar(Criaturas inimigos);

   
    public void ataqueFisico(Criaturas inimigos){
        int dano = (int) (this.poder * this.ataque / inimigos.defesa);

        inimigos.pontosDeVida -= dano;

        System.out.println(this.nome + "realisou um ataque fisico" + inimigos.getNome()
         + "perdeu" + dano + "dano");
    }
     
    public void ataqueElemental(Criaturas inimigos, double fator){

        int dano = (int) (this.poder * this.ataque  / (inimigos.defesa * fator));
        inimigos.pontosDeVida -= dano;
        System.out.println(this.nome + "Realizou ataque elemental em " 
        + inimigos.nome + "perdeu" + dano + "dano");
    }
    
    
    protected static int getRandomValue(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
        
    }

   

   
    
}
