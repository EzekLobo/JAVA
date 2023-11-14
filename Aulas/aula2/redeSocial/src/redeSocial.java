
import java.util.Scanner;

public class redeSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Digite o nome do usuário: ");
        user.setName(scanner.nextLine());
        System.out.print("Digite a idade do usuário: ");
        user.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Digite o endereço do usuário: ");
        user.setAddress(scanner.nextLine());
        System.out.print("Digite a profissão do usuário: ");
        user.setProfession(scanner.nextLine());
        System.out.println("Usuário criado com sucesso!");
        System.out.println("Nome: " + user.getName());
        System.out.println("Idade: " + user.getAge());
        System.out.println("Endereço: " + user.getAddress());
        System.out.println("Profissão: " + user.getProfession());
        System.out.println("Digite algumas postagens:");
        String postagem = scanner.nextLine();
        user.adicionaPostagem(postagem);
        scanner.close();
    }
}

class User {
    private String name;
    private int age;
    private String address;
    private String profession;
    private String[] postagens = new String[10];
    private int numPostagens = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void adicionaPostagem(String postagem) {
        if (numPostagens < 10) {
            postagens[numPostagens] = postagem;
            numPostagens++;
        } else {
            System.out.println("Não é possível adicionar mais postagens.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getProfession() {
        return profession;
    }

    public String[] getPostagens() {
        return postagens;
    }

    public int getNumPostagens() {
        return numPostagens;
    }
}
