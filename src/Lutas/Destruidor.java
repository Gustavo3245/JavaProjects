package Lutas;

public class Destruidor extends Lutador {

    @Override
    public void setForca(int forca) {
        if(forca >= getVelocidade() && forca >= getCura() && forca >= getVida()){
            super.setForca(forca);
        }
    }

    public Destruidor(){}

    public Destruidor(String nome, String alcunha){
        super.setNome(nome);
        super.setAlcunha(alcunha);
    }

    public Destruidor(String nome, String alcunha, int forca, int velocidade, int vida, int cura){
        super.setNome(nome);
        super.setAlcunha(alcunha);
        super.setVelocidade(velocidade);
        super.setVida(vida);
        super.setCura(cura);
        setForca(forca);
    }


    @Override
    public int poderDeAtaque() {
        return (getForca() * getVelocidade()) + getForca();
    }


    @Override
    public int poderDeDefesa() {
        return (getCura() * getVida()) + getForca();
    }
}
