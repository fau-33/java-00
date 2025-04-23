public class Livro {
  private String titulo;
  private String autor;
  private double preco;

  // Fallback
  public Livro(){
    this.titulo = "Titulo teste";
    this.autor = "Autor teste";
    this.preco = 29.90;
  }
  // Overload
  public Livro(String titulo, String autor, double preco){
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  public void exibirInfo(){
    System.out.println("Livro: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Preco: " + this.preco);
  }
}
