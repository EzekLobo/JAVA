
import java.util.Vector;

public class Pessoa {
private String nome;
private int cpf;
private int idade;
private Vector<String> familia;

public Pessoa(String nome, String cpf){
	this.nome=nome;
	this.cpf=cpf;
}

public String getNome(){
	return nome;
}
public void exibirInfo(String nome,int idade){
	System.out.println("Nome: "+nome);
	System.out.println("Idade: "+idade);

}
public static void main(String[] args) {
	Vector<String> vetor = new Vector();
	
	vetor.add("Bruno");
	System.out.print("Faz parte da familia"+vetor.get(0));
	exibirInfo();
}
}
