package Lutas;
import java.lang.String;

public class Ringue {
    private Lutador lutadorUm;
    private Lutador lutadorDois;

    public Lutador getLutadorUm() {
        return lutadorUm;
    }

    public void setLutadorUm(Lutador lutadorUm) {
        this.lutadorUm = lutadorUm;
    }

    public Lutador getLutadorDois() {
        return lutadorDois;
    }

    public void setLutadorDois(Lutador lutadorDois) {
        this.lutadorDois = lutadorDois;
    }

    public Ringue(){}

    public Ringue(Lutador lutadorUm, Lutador lutadorDois){
        this.lutadorUm = lutadorUm;
        this.lutadorDois = lutadorDois;
    }

    public String apresentandoLutadores(){
        return String.format("De um lado o(a) %s o(a) incrivel %s\n" +
                            "VS\n" +
                            "E do outro %s o(a) espetacular %s \n" +
                            "Quem sera o(a) campeao", lutadorUm.getNome(), lutadorUm.getAlcunha(), lutadorDois.getNome(), lutadorDois.getAlcunha());
    }

    public String lutar() {
        int placar = 0;

        int ataqueUm = lutadorUm.poderDeAtaque();
        int ataqueDois = lutadorDois.poderDeAtaque();
        int defesaUm = lutadorUm.poderDeDefesa();
        int defesaDois = lutadorDois.poderDeDefesa();
        String MaiorDefesa;
        String MaiorAtaque;

        if (ataqueUm > ataqueDois) {
            placar++;
            MaiorAtaque = lutadorUm.getNome();
        } else if (ataqueUm < ataqueDois) {
            placar--;
            MaiorAtaque = lutadorDois.getNome();
        } else {
            MaiorAtaque = "Empatados";
        }

        if (defesaUm > defesaDois) {
            placar++;
            MaiorDefesa = lutadorUm.getNome();
        } else if (defesaUm < defesaDois) {
            placar--;
            MaiorDefesa = lutadorDois.getNome();
        } else {
            MaiorDefesa = "Empatados";
        }

        String resultado;
        if (placar > 0) resultado = lutadorUm.getNome();
        else if (placar < 0) resultado = lutadorDois.getNome();
        else resultado = "Empate";


        return String.format("Maior poder de ataque: %s \n"
                + "Maior poder de defesa: %s \n"
                + "O resultado e: %s",MaiorAtaque, MaiorDefesa, resultado);
    }

}
