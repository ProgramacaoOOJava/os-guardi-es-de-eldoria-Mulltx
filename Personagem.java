// Superclasse abstrata que define as características e o comportamento comum a todo personagem.
// Implementa Comparable para permitir a ordenação dos personagens por nível.
public abstract class Personagem implements Comparable<Personagem> {

    // Atributos encapsulados (privados), acessados apenas por getters
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor que inicializa os dados básicos do personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Getters: forma correta de acessar os atributos privados de fora da classe
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
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

    // Calcula o poder total do personagem, usado nas batalhas
    // poderTotal = nivel * poderBase
    public double calcularPoderTotal() {
        return nivel * poderBase;
    }

    // Implementação do Comparable: personagens são comparados pelo nível,
    // permitindo usar Collections.sort() para ordená-los
    @Override
    public int compareTo(Personagem outro) {
        return Integer.compare(this.nivel, outro.nivel);
    }
}
