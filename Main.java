import java.util.ArrayList;

// Classe principal, responsável por criar os personagens e demonstrar o polimorfismo
public class Main {

    public static void main(String[] args) {

        // Criando uma estrutura para armazenar diferentes tipos de personagem
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Instanciando um Guerreiro e adicionando à lista
        personagens.add(new Guerreiro("Arthus", 6, 120, 18.0, "Espada Flamejante"));

        // Instanciando um Mago e adicionando à lista
        personagens.add(new Mago("Elenara", 7, 90, 25.5, "Bola de Fogo"));

        // Iterando sobre a lista de personagens de forma genérica
        for (Personagem personagem : personagens) {
            // Chama o método comum, herdado da superclasse
            personagem.exibirStatus();

            // Chama o método sobrescrito, com comportamento definido em cada subclasse
            // (polimorfismo de tempo de execução: o Java decide qual versão executar)
            personagem.usarHabilidadeEspecial();

            System.out.println("-----------------------------");
        }
    }
}
