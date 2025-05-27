package Lutas;

public class Tanque extends Lutador {

    @Override
    public void setVida(int vida) {
        if (vida >= getVelocidade() && vida >= getCura() && vida >= getForca()) {
            super.setVida(vida);
        }
    }

    public Tanque() {
    }

    public Tanque(String nome, String alcunha) {
        super.setNome(nome);
        super.setAlcunha(alcunha);

    }

    public Tanque(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        super(nome, alcunha, forca, velocidade, 0, cura);
        setVida(vida);
    }

    @Override
    public int poderDeAtaque() {
        return (getForca() * getVelocidade()) + getVida();
    }

    @Override
    public int poderDeDefesa() {
        return (getCura() * getVida()) + getVida();
    }

}