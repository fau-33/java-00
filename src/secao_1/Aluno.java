/**
 * Exercícios 2: Classe Aluno com encapsulamento e construtores Crie uma classe Aluno com as
 * propriedades privadas nome, matricula, notaFinal. Adicione um construtor parametrizado para
 * inicializar as propriedades e implemente os setters e getters com validação para garantir que o
 * nome não esteja vazio e a nota Final esteja entre 0 e 100. Na classe principal, crie dois objetos
 * da classe Aluno atribua valores e exiba as informações.
 */
public final class Aluno {
  // Propriedades privadas
  private String nome;
  private String matricula;
  private double notaFinal;

  // Construtor parametrizado
  public Aluno(String nome, String matricula, double notaFinal) {
    setNome(nome);
    this.matricula = matricula;
    setNotaFinal(notaFinal);
  }

  // Getter e Setter para nome com validação
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome == null || nome.trim().isEmpty()) {
      throw new IllegalArgumentException("O nome não pode ser vazio");
    }
    this.nome = nome;
  }

  // Getter e Setter para matrícula (sem validação específica)
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  // Getter e Setter para notaFinal com validação
  public double getNotaFinal() {
    return notaFinal;
  }

  public void setNotaFinal(double notaFinal) {
    if (notaFinal < 0 || notaFinal > 100) {
      throw new IllegalArgumentException("A nota final deve estar entre 0 e 100");
    }
    this.notaFinal = notaFinal;
  }

  // Método para exibir as informações do aluno
  public String exibirInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Nota Final: " + notaFinal);
    return "";
  }


}
