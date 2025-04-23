public class Carro {
  // Atributos e propriedades
  String marca;
  String modelo;
  int ano;

  double velocidadeAtual = 0;
  boolean motorLigado = false;
  
  // Métodos
  void acelerar() {
    System.out.println("Acelerando");
  }

  void info() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
  }

  // 3 - Métodos
  void ligarMotor(){

    if(!motorLigado){
      motorLigado = true;
      System.out.println("Motor ligado");
      
    }else{
      System.out.println("Motor já está ligado");
    }
  }

  void aumentarVelocidade(double incremento){
    if(motorLigado){
      velocidadeAtual += incremento;
      System.out.println("Velocidade atual: " + velocidadeAtual);
    }else{
      System.out.println("Ligue o motor");
  }
  
  }

  
}
