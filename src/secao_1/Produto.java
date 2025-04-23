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
}
