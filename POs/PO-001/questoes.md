Questão 1:


Uma classe em Java é um modelo para a criação de objetos, enquanto um objeto é uma instância de uma classe.
Em C++ e Java, as classes são definidas de maneira semelhante, e os objetos são criados a partir dessas classes.


// Exemplos JAVA

public class Carro {

    String marca; // Propriedade

    void acelerar() {} // Método

}

 

// Objeto

Carro meuCarro = new Carro();

meuCarro.marca = "Toyota";

meuCarro.acelerar();

 

// Classe

public class Animal {

    String nome; // Propriedade

    void fazerBarulho() {} // Método

}

 

// Objeto

Animal meuAnimal = new Animal();

meuAnimal.nome = "Rex";

meuAnimal.fazerBarulho();

 

// Classe

public class Computador {

    String marca; // Propriedade

    void ligar() { System.out.println("Computador ligado."); } // Método

}



// Exemplos C++

class Carro {

    public:

        string marca; // Propriedade

        void acelerar() {} // Método

};

 

// Objeto

Carro meuCarro;

meuCarro.marca = "Toyota";

meuCarro.acelerar();

 

// Classe

class Carro {

    public:

        string marca; // Propriedade

        void acelerar() {} // Método

};

 

// Objeto

Carro meuCarro;

meuCarro.marca = "Toyota";

meuCarro.acelerar();

 

class Computador {

    public:

        string marca; // Propriedade

        void ligar() { cout << "Computador ligado." << endl; } // Método

};










Questão 2:



Em Java, você declara uma variável especificando o tipo de dado e o nome da variável. 
Por exemplo, int numero; declara uma variável chamada numero do tipo int. 
Os tipos de dados primitivos mais comuns em Java são byte, short, int, long, float, double,
boolean e char. Em C++, a declaração de variáveis é semelhante. Por exemplo, int numero;
também declara uma variável chamada numero do tipo int. Os tipos de dados primitivos mais 
comuns em C++ são bool, char, int, float e double.




Questão 3:
A herança em Java permite a criação de novas classes a partir de outras existentes. 
Em Java, usamos a palavra extends para criar subclasses. Em C++, usamos o símbolo : para indicar herança.

 

 // Exemplo JAVA

class Veiculo {

  protected String marca = "Ford"; 

}

 

class Carro extends Veiculo {

  private String modelo = "Mustang"; 

}




 // Exemplo C++

class Veiculo {

  protected:

    string marca = "Ford"; // Variável de Veiculo

};

class Carro : public Veiculo {

  private:

    string modelo = "Mustang";

}




Questão 4:

Em Java, quando declaramos uma variável de um tipo de objeto (como String, Integer, ou qualquer classe que você crie), 
estamos na verdade criando uma referência para esse objeto. 
Essa referência é semelhante a um ponteiro em C++, mas com uma diferença fundamental: você não pode manipular diretamente a
referência como faria com um ponteiro em C++. Em Java, a referência é abstraída e gerenciada pelo ambiente de execução Java (JRE).  
Em C++, quando declaramos uma variável, estamos alocando memória para essa variável e o nome da variável é essencialmente um ponteiro
para essa memória.Em resumo, Java abstrai muitos dos detalhes de baixo nível do gerenciamento de memória para simplificar o
desenvolvimento e evitar erros comuns em C++, enquanto C++ oferece controle mais direto sobre a memória, o que pode ser útil em certos 
casos, mas também requer um cuidado maior para evitar erros.