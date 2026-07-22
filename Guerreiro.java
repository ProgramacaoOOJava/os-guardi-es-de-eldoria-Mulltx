// Subclasse que representa um personagem do tipo Guerreiro
public class Guerreiro extends Personagem {

    // Atributo próprio do Guerreiro: a arma que ele utiliza
    private String arma;

    // Construtor que usa super() para inicializar os dados herdados da superclasse
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, String arma) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    // Sobrescrita do método abstrato com o comportamento específico do Guerreiro
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + getNome() + " ataca com " + arma + "!");
    }
}
