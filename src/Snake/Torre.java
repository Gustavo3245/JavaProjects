public class Torre {
    private String nivelDeDificuldade;
    private int andares;

    public Torre(int andares, String nivelDeDificuldade) {
        if(nivelDeDificuldade != null && !nivelDeDificuldade.isEmpty() && andares > 0){
            this.nivelDeDificuldade = nivelDeDificuldade;
            this.andares = andares;
        }
    }

    public Torre(){}

    public String getNivelDeDificuldade() {
        if (nivelDeDificuldade == null) {
            return null;
        }

        String valor = nivelDeDificuldade.toLowerCase().trim();

        if (valor.equals("facil") || valor.equals("medio") || valor.equals("dificil")) {
            return valor;
        } else {
            return null;
        }
    }

    public void setNivelDeDificuldade(String nivelDeDificuldade) {
        if(nivelDeDificuldade != null && !nivelDeDificuldade.isEmpty()){
            this.nivelDeDificuldade = nivelDeDificuldade;
        }
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        if(andares > 0){
            this.andares = andares;
        }
    }

    public String cobraConsegueEscalar(Cobra cobra){

        if (nivelDeDificuldade == null || nivelDeDificuldade.trim().isEmpty()) {
            return "Nivel nao definido";
        }

        if(nivelDeDificuldade == "facil"){
            if(cobra.getPontosDeEscalada() * 2 >= andares){
                return String.format("%s consegue escalar", cobra.getNome());
            } else {
                return String.format("%s nao consegue escalar", cobra.getNome());
            }
        }

        else if (nivelDeDificuldade == "medio"){
            if(cobra.getPontosDeEscalada() >= andares){
                return String.format("%s consegue escalar", cobra.getNome());
            } else {
                return String.format("%s nao consegue escalar", cobra.getNome());
            }
        }

        else if(nivelDeDificuldade == "dificil"){
            if(cobra.getPontosDeEscalada() / 3 >= andares){
                return String.format("%s consegue escalar", cobra.getNome());
            } else {
                return String.format("%s nao consegue escalar", cobra.getNome());
            }
        }
        else {
            return "null";
        }

    }
}