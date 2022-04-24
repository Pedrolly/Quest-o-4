package br.inatel.questão4.S201;

public class Televisão {
  private int num;
  private String nome;
  private int volume = 0;
  private String canal;
  private int num3;
  private int num2;

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getNum3() {
    return num3;
  }

  public void setNum3(int num3) {
    this.num3 = num3;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getCanal() {
    return canal;
  }

  public void setCanal(String canal) {
    this.canal=canal;
  }

  public void aumenta(int num) {
    volume = volume + num;
  }

  public void diminua(int num) {
    volume = volume - num;
  }
  public void imprime(){
    System.out.println("Valor do volume " + volume);
    System.out.println("Você está no canal:  "+canal);
    System.out.println("O modelo da TV é: " + nome);
  }

}

