public class Comida {
    private String nome;
    private int energia;

    public Comida(String nome, int energia) {
        if(nome != null && !nome.isEmpty() && energia >= 0){
            this.nome = nome;
            this.energia = energia;
        }
    }

    public Comida(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
    }

    public int getEnergia() {
        int energiaAtual = energia;
        energia = 0;
        return energiaAtual;
    }

    public void setEnergia(int energia) {
        if(energia >= 0){
            this.energia = energia;
        }
    }
}

public class ComidaEstragada extends Comida{
    private int energia;

    @java.lang.Override
    public int getEnergia() {
        int energiaAtual = energia;
        energia = 0;
        return energiaAtual;
    }

    @java.lang.Override
    public void setEnergia(int energia) {
        this.energia = energia;

        if(this.energia > 0){
            this.energia = (energia * -1);
        }
    }

    public ComidaEstragada(String nome, int energia) {
        super(nome, energia);
        this.energia = (energia);

        if(this.energia > 0){
            this.energia = (energia * -1);
        }
    }
}