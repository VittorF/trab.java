import java.util.Scanner;

class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void exibirPerfil() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}

public class SGJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um jogador
        System.out.println("Criar novo perfil de jogador.");
        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacao = scanner.nextInt();
        System.out.print("Digite o nível inicial do jogador: ");
        int nivel = scanner.nextInt();
        Jogador jogador = new Jogador(nome, pontuacao, nivel);


        System.out.println("\nPerfil do jogador:");
        jogador.exibirPerfil();

        
        System.out.println("\nAtualizar pontuação e nível do jogador.");
        System.out.print("Digite a nova pontuação do jogador: ");
        pontuacao = scanner.nextInt();
        jogador.setPontuacao(pontuacao);
        System.out.print("Digite o novo nível do jogador: ");
        nivel = scanner.nextInt();
        jogador.setNivel(nivel);

        
        System.out.println("\nPerfil atualizado do jogador:");
        jogador.exibirPerfil();

        scanner.close();
    }
}
