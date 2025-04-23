public class Celular_POO {
  public static void main(String[] args) {
     // Instanciação de dois objetos Celular
     Celular celular1 = new Celular("Samsung", "Galaxy S21", 80);
     Celular celular2 = new Celular("Apple", "iPhone 13", 50);

    System.out.println("testando celular 1:");
    celular1.ligar();
    celular1.usar();
    celular1.usar();
    celular1.usar();
    celular1.desligar();

    System.out.println("testando celular 2:");
    celular2.ligar();
    celular2.usar();
    celular2.usar();
    celular2.desligar();
    celular2.usar();

  }

}
