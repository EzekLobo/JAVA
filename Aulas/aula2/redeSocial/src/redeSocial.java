import java.util.Scanner;

public class redeSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Digite o nome do usuário: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("Digite a idade do usuário: ");
        cliente.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o endereço do usuário: ");
        cliente.setEndereco(scanner.nextLine());

        System.out.print("Digite a profissão do usuário: ");
        cliente.setProfissao(scanner.nextLine());

        System.out.println("Usuário criado com sucesso!");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Profissão: " + cliente.getProfissao());

        System.out.println("Digite algumas postagens:");
        String postagem = scanner.nextLine();
        cliente.adicionaPostagem(postagem);

        System.out.println("Digite a pontuação inicial do usuário: ");
        int pontuacaoInicial = scanner.nextInt();
        cliente.setPontuacao(pontuacaoInicial);

        System.out.println("Pontuação inicial: " + cliente.getPontuacao());

        System.out.println("Digite a pontuação a ser adicionada: ");
        int pontuacaoDelta = scanner.nextInt();
        cliente.alteraPontuacao(pontuacaoDelta);

        System.out.println("Pontuação atualizada: " + cliente.getPontuacao());

        scanner.close();
    }
}

class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private String profissao;
    private String[] postagens = new String[10];
    private int numPostagens = 0;
    private int pontuacao = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void adicionaPostagem(String postagem) {
        if (numPostagens < 10) {
            postagens[numPostagens] = postagem;
            numPostagens++;
        } else {
            System.out.println("Não é possível adicionar mais postagens.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public String[] getPostagens() {
        return postagens;
    }

    public int getNumPostagens() {
        return numPostagens;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void alteraPontuacao(int delta) {
        if (pontuacao + delta >= 0) {
            pontuacao += delta;
        } else {
            System.out.println("A pontuação não pode ficar menor que zero.");
        }
    }
}
