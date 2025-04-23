public class POO {
  public static void main(String[] args) {
    // 2 - Instanciar a classe
    Carro fusca = new Carro();

    fusca.marca = "Volkswagen";
    fusca.modelo = "Fusca";
    fusca.ano = 1969;

    fusca.acelerar();
    fusca.info();

    Carro gol = new Carro();

    gol.marca = "Volkswagen";
    gol.modelo = "Gol";
    gol.ano = 2010;

    gol.acelerar();
    gol.info();

    // 3 - Métodos
    fusca.ligarMotor();
    fusca.aumentarVelocidade(10);
    fusca.aumentarVelocidade(20);
    fusca.aumentarVelocidade(50);

    System.out.println(fusca.motorLigado);

    // 4 - Criando propriedades
    Pessoa joao = new Pessoa();

    joao.setNome("João");

    System.out.println("Meu nome é " + joao.getNome());

    joao.setIdade(20);
    System.out.println("Eu tenho " + joao.getIdade() + " anos");

    // 5 - Setters e Getters
    ContaBancaria contaDaAna = new ContaBancaria();

    contaDaAna.setTitular("Ana");


    contaDaAna.setSaldo(1000);

    contaDaAna.exibirInfo();

    System.out.println(contaDaAna.getTitular());
    System.out.println(contaDaAna.getSaldo());

    // 6 - Lógica em get e set
    Produto camisa = new Produto();

    camisa.setNome("Camisa regata");

    System.out.println(camisa.getNome());

    camisa.setPreco(29.99999999999);

    System.out.println(camisa.getPreco());

    // 7 - Método dentro de metodo
    System.out.println(camisa.exibirInfo());

    camisa.aplicarDesconto(10);
    camisa.aplicarDesconto(0);

    // 8 - Construtores
    Livro meuLivro = new Livro("O Senhor dos Aneis", "JRR Tolkien", 49.90);

    meuLivro.exibirInfo();

    Livro outroLivro = new Livro();

    outroLivro.exibirInfo();

  }
}
