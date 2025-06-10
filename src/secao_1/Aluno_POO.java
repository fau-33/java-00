public class Aluno_POO {
  public static void main(String[] args) {
    // Instanciação de dois objetos Aluno
    try {
      // Criando dois objetos da classe Aluno
      Aluno aluno1 = new Aluno("João Silva", "2023001", 85.5);
      Aluno aluno2 = new Aluno("Maria Oliveira", "2023002", 92.0);

      // Exibindo as informações dos alunos
      System.out.println("Informações do Aluno 1:");
      aluno1.exibirInfo();

      System.out.println("\nInformações do Aluno 2:");
      aluno2.exibirInfo();
    } catch (IllegalArgumentException e) {
      System.out.println("Erro ao criar aluno: " + e.getMessage());
    }

  }
}
