public class ContaBancaria {
  private String titular;
  private double saldo;

  // Getter e Setter para titular
  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    // Correção: verifica se o titular é nulo OU vazio
    if (titular == null || titular.trim().isEmpty()) {
      System.out.println("Nome inválido");
    } else {
      this.titular = titular;
    }
  }

  // Getter e Setter para saldo
  public String getSaldo() {
    return "R$ " + saldo;
  }

  public void setSaldo(double saldo) {
    if (saldo >= 0) {
      this.saldo = saldo;
    } else {
      System.out.println("O valor precisa ser positivo!");
    }
  }

  // Método para exibir informações
  public void exibirInfo() {
    System.out.println("Titular: " + this.titular);
    System.out.println("Saldo: " + this.saldo);
  }
}
