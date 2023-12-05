import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class RedeSocial {

    class Usuario {
        private static int proximoId = 1; // Variável estática para gerar IDs únicos
        private int id;
        private String nome;
        private String email;
        private String senha;
        private List<Usuario> amigos; // Adicionando a lista de amigos

        public Usuario(String nome, String email, String senha) {
            this.id = proximoId++;
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.amigos = new ArrayList<>();
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getSenha() {
            return senha;
        }

        public List<Usuario> getAmigos() {
            return amigos;
        }

        public void criarAmizade(Usuario amigo) {
            amigos.add(amigo);
            amigo.amigos.add(this);
        }

        public void destruirAmizade(Usuario amigo) {
            amigos.remove(amigo);
            amigo.amigos.remove(this);
        }
    }

    class ListaUsuarios {
        private List<Usuario> usuarios;

        public ListaUsuarios() {
            this.usuarios = new ArrayList<>();
        }

        public void criarUsuario() { // Modified method to prompt for user information
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do novo usuário: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o email do novo usuário: ");
            String email = scanner.nextLine();

            System.out.print("Digite a senha do novo usuário: ");
            String senha = scanner.nextLine();

            Usuario novoUsuario = new Usuario(nome, email, senha);
            usuarios.add(novoUsuario);
            System.out.println("Novo usuário criado com sucesso!");
        }

        public void removerUsuario(Usuario usuario) {
            usuarios.remove(usuario);
        }

        public boolean contemUsuario(Usuario usuario) {
            return usuarios.contains(usuario);
        }

        public List<Usuario> getUsuarios() {
            return usuarios;
        }
    }

    class Amizade {
        private ListaUsuarios listaUsuarios;

        public Amizade(ListaUsuarios listaUsuarios) {
            this.listaUsuarios = listaUsuarios;
        }

        public void criarAmizade(Usuario usuario1, Usuario usuario2) {
            if (!listaUsuarios.contemUsuario(usuario1) || !listaUsuarios.contemUsuario(usuario2)) {
                System.out.println("Usuários não encontrados na lista.");
                return;
            }

            usuario1.criarAmizade(usuario2);
            System.out.println("Amizade criada entre " + usuario1.getNome() + " (ID: " + usuario1.getId() + ") e " + usuario2.getNome() + " (ID: " + usuario2.getId() + ")");
        }

        public void destruirAmizade(Usuario usuario1, Usuario usuario2) {
            if (!listaUsuarios.contemUsuario(usuario1) || !listaUsuarios.contemUsuario(usuario2)) {
                System.out.println("Usuários não encontrados na lista.");
                return;
            }

            usuario1.destruirAmizade(usuario2);
            System.out.println("Amizade destruída entre " + usuario1.getNome() + " (ID: " + usuario1.getId() + ") e " + usuario2.getNome() + " (ID: " + usuario2.getId() + ")");
        }
    }
    public static void main(String[] args) {

        ListaUsuarios listaUsuarios = new ListaUsuarios();

        listaUsuarios.criarUsuario(); // Calling the modified method to create a user
        listaUsuarios.criarUsuario();

        Amizade amizade = new Amizade(listaUsuarios);

        // Example of how to use the friendship relationship
        Usuario usuario1 = listaUsuarios.getUsuarios().get(0);
        Usuario usuario2 = listaUsuarios.getUsuarios().get(1);

        amizade.criarAmizade(usuario1, usuario2);

        // Exemplo de como usar a relação de amizade
        System.out.println("Usuários na amizade: " + usuario1.getNome() + " (ID: " + usuario1.getId() + ") e " + usuario2.getNome() + " (ID: " + usuario2.getId() + ")");

        amizade.destruirAmizade(usuario1, usuario2);
    }
}
