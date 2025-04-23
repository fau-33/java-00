/**
   * Exercícios 1: Criando uma classe celular
   * Crie uma classe celular que tenha as seguintes propriedades: marca, modelo e bateria
   * Implemente os métodos para ligar e desligar o celular,
   * e outro método que simule o consumo de bateria quando o celular está sendo usado
   * Crie a classe principal para instanciar dois objetos celulares e simular o uso deles
   * 
   * */

public class Celular {
  
  private String marca;
  private String modelo;
  private double bateria;
  private boolean ligado;

  // Construtor para inicializar as propriedades
  public Celular(String marca, String modelo, double bateria) {
    this.marca = marca;
    this.modelo = modelo;
    if(bateria > 100) {
      this.bateria = 100;
    }else if(bateria < 0) {
      this.bateria = 0;
    }else {
      this.bateria = bateria;
    }
    this.ligado = false;
  }

  // Getters e Setters
  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public double getBateria() {
    return bateria;
  }

  public void setBateria(double bateria) {
    if(bateria > 100) {
      this.bateria = 100;
    }else if(bateria < 0) {
      this.bateria = 0;
    }else {
      this.bateria = bateria;
    }
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public boolean isLigado() {
    return ligado;
  }
  // Método para ligar o celular
  public void ligar() {
    if(!ligado) {
      if(bateria > 0) {
        ligado = true;
        System.out.println("Ligando o celular...");
      }else {
        System.out.println("Bateria insuficiente para ligar o celular.");
      }
    }else {
      System.out.println("O celular ja esta ligado.");
    }
  }
  // Método para desligar o celular
  public void desligar() {
    if(ligado) {
      ligado = false;
      System.out.println("Desligando o celular...");
    }else {
      System.out.println("O celular ja esta desligado.");
    }
  }

  public void usar() {
    if (ligado) { // Só pode usar se o celular estiver ligado
        if (bateria > 0) {
            System.out.println("Usando o celular...");
            bateria -= 5; // Simula o consumo de bateria (5% por uso)
            if (bateria < 0) { // Garante que a bateria não fique negativa
                bateria = 0;
            }
            System.out.println("Bateria restante: " + bateria + "%");
        } else {
            System.out.println("Bateria esgotada. Desligando o celular...");
            desligar();
        }
    } else {
        System.out.println("O celular está desligado. Não é possível usá-lo.");
    }
}
}

