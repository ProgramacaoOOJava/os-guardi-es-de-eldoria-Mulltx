import java.util.ArrayList;

// Classe extra: gerencia múltiplas batalhas entre os membros de dois grupos distintos
public class Arena {

    // Confronta os membros de dois grupos, em pares, na ordem em que aparecem nas listas.
    // Reaproveita o método batalhar() já existente na classe Grupo, evitando lógica repetida.
    public void batalharGrupos(Grupo g1, Grupo g2) {
        ArrayList<Personagem> membrosG1 = g1.getMembros();
        ArrayList<Personagem> membrosG2 = g2.getMembros();

        // O número de confrontos é limitado pelo menor grupo, para evitar índices inválidos
        int totalBatalhas = Math.min(membrosG1.size(), membrosG2.size());

        System.out.println("=== Batalhas entre " + g1.getNomeGrupo() + " e " + g2.getNomeGrupo() + " ===");

        for (int i = 0; i < totalBatalhas; i++) {
            System.out.println("Batalha " + (i + 1) + ":");
            // Reutiliza o método batalhar() da classe Grupo em vez de duplicar a lógica
            g1.batalhar(membrosG1.get(i), membrosG2.get(i));
            System.out.println("-----------------------------");
        }
    }
}
