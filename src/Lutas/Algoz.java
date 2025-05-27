package Lutas;

public class Algoz extends Lutador{

    @Override
    public void setVelocidade(int velocidade){
        if(velocidade >= getVida() && velocidade >= getCura() && velocidade >= getForca()){
            super.setVelocidade(velocidade);
        }
    }

    public Algoz() {
    }

    public Algoz(String nome, String alcunha){
        super.setNome(nome);
        super.setAlcunha(alcunha);
    }

    public Algoz(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        super(nome, alcunha, forca, 0, vida, cura);
        setVelocidade(velocidade);
    }

    @Override
    public int poderDeAtaque() {
        return (getForca() * getVelocidade()) + getVelocidade();
    }

    @Override
    public int poderDeDefesa() {
        return (getVida() * getCura()) + getVelocidade();
    }
}
