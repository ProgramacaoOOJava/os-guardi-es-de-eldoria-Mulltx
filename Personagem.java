// Superclasse abstrata que define as características e o comportamento comum a todo personagem
public abstract class Personagem {

    // Atributos comuns a qualquer tipo de personagem
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Construtor que inicializa os dados básicos do personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método concreto reaproveitado por todas as subclasses, exibe os dados comuns do personagem
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Método abstrato: cada subclasse deve implementar sua própria habilidade especial
    public abstract void usarHabilidadeEspecial();
}
