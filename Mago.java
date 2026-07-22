// Subclasse que representa um personagem do tipo Mago
public class Mago extends Personagem {

    // Atributo próprio do Mago: o feitiço que ele utiliza
    private String feitico;

    // Construtor que usa super() para inicializar os dados herdados da superclasse
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, String feitico) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.feitico = feitico;
    }

    public String getFeitico() {
        return feitico;
    }

    // Sobrescrita do método abstrato com o comportamento específico do Mago
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + getNome() + " lança " + feitico + "!");
    }
}
