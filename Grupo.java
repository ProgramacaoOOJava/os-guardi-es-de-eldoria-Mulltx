import java.util.ArrayList;
import java.util.Collections;

// Classe que representa um grupo (equipe) de personagens
public class Grupo {

    private String nomeGrupo;

    // Lista de personagens que compõem o grupo, usando generics corretamente
    private ArrayList<Personagem> membros;

    // Construtor que inicializa o nome do grupo e a lista de membros vazia
    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    // Adiciona um novo personagem à lista de membros do grupo
    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    // Ordena os membros do grupo por nível, usando o Comparable implementado em Personagem
    public void ordenarPorNivel() {
        Collections.sort(membros);
    }

    // Exibe as informações de todos os personagens do grupo
    public void listarPersonagens() {
        System.out.println("=== Grupo: " + nomeGrupo + " ===");
        for (Personagem p : membros) {
            p.exibirStatus();
            System.out.println("-----------------------------");
        }
    }

    // Realiza a batalha entre dois personagens, calculando o poder total de cada um
    // e exibindo o vencedor. Método reaproveitável, usado tanto para batalhas avulsas
    // quanto pela classe Arena ao confrontar grupos inteiros.
    public void batalhar(Personagem a, Personagem b) {
        double poderTotalA = a.calcularPoderTotal();
        double poderTotalB = b.calcularPoderTotal();

        // Define o vencedor comparando o poder total calculado de cada personagem
        Personagem vencedor = (poderTotalA >= poderTotalB) ? a : b;
        double poderVencedor = Math.max(poderTotalA, poderTotalB);

        System.out.println(vencedor.getClasse() + " " + vencedor.getNome()
                + " venceu! Poder total: " + poderVencedor);
    }
}
