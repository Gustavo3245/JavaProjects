import java.lang.String;

public class Agente {
    private String nome;
    private String missao;
    private int habilidade;
    private int experiencia;
    private int dificuldade;
    private int codigo;

    public Agente(){

    }
    public Agente(String nome){
        this.nome = nome;
    }

    public Agente(String nome, int habilidade, int experiencia){
        this.nome = nome;
        this.habilidade = habilidade;
        this.experiencia = experiencia;
    }

    public void setNome(String nome){
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setMissao(String missao){
        if(nome != null && !missao.isEmpty()){
            this.missao = missao;
        }
    }

    public String getMissao(){
        return missao;
    }

    public void setHabilidade(int habilidade){
        if(habilidade >= 0 && habilidade <= 10){
            this.habilidade = habilidade;
        }
    }

    public int getHabilidade(){
        return habilidade;
    }

    public void setExperiencia(int experiencia){
        if(experiencia >= 0 && experiencia <= 10){
            this.experiencia = experiencia;
        }
    }

    public int getExperiencia(){
        return experiencia;
    }

    public void setDificuldade(int dificuldade){
        if(dificuldade >= 0 && dificuldade <= 10){
            this.dificuldade = dificuldade;
        }
    }

    public int getDificuldade(){
        return dificuldade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo >= 0){
            this.codigo = codigo;
        }
    }

    public String relatorioDaMissao(){
        return String.format("---Relatorio--- \n" +
                "Nome: %s \n" + "Codigo: %d \n" + "Missao: %s \n" +
                "Dificuldade: %d \n" + "Habilidade: %d \n" + "Experiencia: %d", nome, codigo, missao, dificuldade, habilidade, experiencia );
    }

    public String executarMissao(){
        if(missao == null || missao.isEmpty() || codigo <= 0){
            return "Sem missao!";
        }

        if((habilidade + experiencia) > (2 * dificuldade)){
            return "A missao foi um sucesso!";
        }
        else if ((habilidade + experiencia) == (2 * dificuldade)){
            return "Inconclusivo";
        }
        else {
            return "A missao fracassou!";
        }
    }
}