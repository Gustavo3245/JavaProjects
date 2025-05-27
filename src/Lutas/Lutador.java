package Lutas;

abstract class Lutador {
    private String nome;
    private String alcunha;
    private int forca;
    private int velocidade;
    private int vida;
    private int cura;

    public Lutador(){}

    public Lutador(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        setNome(nome);
        setAlcunha(alcunha);
        setForca(forca);
        setVelocidade(velocidade);
        setVida(vida);
        setCura(cura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlcunha() {
        return alcunha;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    public abstract int poderDeAtaque();
    public abstract int poderDeDefesa();
}


