// Classe principal, responsável por criar e testar os personagens
public class Main {

    public static void main(String[] args) {

        // Instanciando o primeiro personagem com o operador new
        Personagem personagem1 = new Personagem();

        // Atribuindo valores diretamente aos atributos do primeiro personagem
        personagem1.nome = "Arthemis";
        personagem1.classe = "Arqueira";
        personagem1.nivel = 5;
        personagem1.pontosDeVida = 80;
        personagem1.poderBase = 12.5;

        // Instanciando o segundo personagem com o operador new
        Personagem personagem2 = new Personagem();

        // Atribuindo valores diretamente aos atributos do segundo personagem
        personagem2.nome = "Draven";
        personagem2.classe = "Guerreiro";
        personagem2.nivel = 8;
        personagem2.pontosDeVida = 150;
        personagem2.poderBase = 20.0;

        // Chamando o método exibirStatus() para cada um dos personagens criados
        personagem1.exibirStatus();
        personagem2.exibirStatus();
    }
}
