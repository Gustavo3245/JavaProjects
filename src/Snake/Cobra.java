import java.lang.String;

public class Cobra {
    private String nome;
    private int pontosDeEscalada;

    public Cobra(String nome, int pontosDeEscalada) {
        if(nome != null && !nome.isEmpty() && pontosDeEscalada >= 0){
            this.nome = nome;
            this.pontosDeEscalada = pontosDeEscalada;
        }
    }

    public Cobra(){}

    public int getPontosDeEscalada() {
        return pontosDeEscalada;
    }

    public void setPontosDeEscalada(int pontosDeEscalada) {
        if(pontosDeEscalada >= 0){
            this.pontosDeEscalada = pontosDeEscalada;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void comer(Comida comida){
        pontosDeEscalada += comida.getEnergia();
    }

    public String toString(){
        if(pontosDeEscalada > 0){
            return String.format("Sou a cobra %s, tenho %d de energia!", nome, pontosDeEscalada);
        }
        else {
            return String.format("Eu era a cobra %s, estou morta!", nome);
        }
    }
}