package Lutas;

public class Curandeiro extends Lutador{

    @Override
    public void setCura(int cura){
        if(cura >= getVida() && cura >= getVelocidade() && cura >= getForca()){
            super.setCura(cura);
        }
    }

    public Curandeiro() {}

    public Curandeiro(String nome, String alcunha){
        super.setNome(nome);
        super.setAlcunha(alcunha);
    }

    public Curandeiro(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        super(nome, alcunha, forca, velocidade, vida, 0);
        setCura(cura);
    }

    @Override
    public int poderDeAtaque() {
        return (getForca() * getVelocidade()) + getCura();
    }

    @Override
    public int poderDeDefesa() {
        return (getVida() * getCura()) + getCura();
    }
}
