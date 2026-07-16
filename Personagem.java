// Classe que representa um personagem do jogo, com suas características básicas
public class Personagem {

    // Atributos que armazenam as características do personagem
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Método responsável por exibir as informações do personagem de forma legível
    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println("-----------------------------");
    }
}
