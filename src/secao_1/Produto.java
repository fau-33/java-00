public class Produto {
  private String nome;
  private double preco;

  public void setNome(String nome) {
    if (nome != null && !nome.isEmpty() && nome.length() > 3) {
      this.nome = nome;
    } else {
      System.out.println("Nome inválido");
    }
  }

  public String getNome() {
    return nome.toUpperCase();
  }

  public void setPreco(double preco) {
    if (preco > 0) {
      this.preco = preco;
    } else {
      System.out.println("Preço inválido");
    }
  }

  public String getPreco() {
    return String.format("%.2f", preco);
  }

  public String exibirInfo() {
    return "Nome: " + getNome() + "\nPreço: " + getPreco();
  }

  public void aplicarDesconto(double porcentagem) {
    if (porcentagem > 0 && porcentagem <= 100) {

      double desconto = calcularDesconto(porcentagem);
      double precoFinal = this.preco -= desconto;
      
      this.setPreco(precoFinal);

      System.out.println("Desconto de " + porcentagem + "% aplicado.");

      System.out.println(this.exibirInfo());

    } else {
      System.out.println("Porcentagem inválido");
    }
  }

  private double calcularDesconto(double desconto) {
    return this.preco * (1 - desconto);
  }
}
