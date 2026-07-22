// Classe principal, responsável por criar personagens, grupos e demonstrar as batalhas
public class Main {

    public static void main(String[] args) {

        // Criando personagens do tipo Guerreiro
        Guerreiro arthus = new Guerreiro("Arthus", 6, 120, 18.0, "Espada Flamejante");
        Guerreiro draven = new Guerreiro("Draven", 8, 150, 20.0, "Machado de Guerra");

        // Criando personagens do tipo Mago
        Mago elenara = new Mago("Elenara", 7, 90, 25.5, "Bola de Fogo");
        Mago fenrys = new Mago("Fenrys", 5, 85, 22.0, "Raio Congelante");

        // Criando dois grupos distintos
        Grupo grupoA = new Grupo("Guardiões da Luz");
        Grupo grupoB = new Grupo("Legião das Sombras");

        // Adicionando personagens ao grupo A
        grupoA.adicionarPersonagem(arthus);
        grupoA.adicionarPersonagem(elenara);

        // Adicionando personagens ao grupo B
        grupoB.adicionarPersonagem(draven);
        grupoB.adicionarPersonagem(fenrys);

        // Ordenando os personagens de cada grupo por nível antes das batalhas
        grupoA.ordenarPorNivel();
        grupoB.ordenarPorNivel();

        // Listando os personagens de cada grupo
        grupoA.listarPersonagens();
        grupoB.listarPersonagens();

        // Demonstrando o uso das habilidades especiais de cada personagem (polimorfismo)
        System.out.println("=== Habilidades Especiais ===");
        arthus.usarHabilidadeEspecial();
        elenara.usarHabilidadeEspecial();
        draven.usarHabilidadeEspecial();
        fenrys.usarHabilidadeEspecial();
        System.out.println("-----------------------------");

        // Realizando uma batalha avulsa entre dois personagens específicos
        System.out.println("=== Batalha Avulsa ===");
        grupoA.batalhar(arthus, draven);
        System.out.println("-----------------------------");

        // Usando a Arena para batalhar os dois grupos inteiros, em pares
        Arena arena = new Arena();
        arena.batalharGrupos(grupoA, grupoB);
    }
}
