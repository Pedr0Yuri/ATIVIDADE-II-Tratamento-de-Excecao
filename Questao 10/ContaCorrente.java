//10. Construa uma classe chamada “ContaCorrente” , com os atributos “limite” que armazena a quantidade atual disponível do limite da conta que o usuário possui , o atributo “saldo” que é o valor que realmente é pertencente ao usuário, e o atributo “valorLimite” que consiste no valor máximo que o banco lhe fornece como valor de limite, todos float. Construa os métodos public void, sacar(float valor), depositar(float valor), e setValorLimite(float valor) . Na construção dos três métodos faça com que eles lancem exceptions relacionados aos argumentos, por exemplo, sacar, depositar ou setar um valor negativo para esses eventos. Lance também uma exception no caso de tentar sacar um valor maior que o possível. Nós métodos lancem a exception “IllegalArgumentException()” (Java)com o comando adequado, passe o motivo da exception(uma String) em seu construtor

public class ContaCorrente {
  private float limite;
  private float saldo;
  private float valorLimite;

  public ContaCorrente(float limite, float saldo, float valorLimite){
    this.limite = limite;
    this.saldo = saldo;
    this.valorLimite = valorLimite;
  }
  public void sacar(float valor) {
    if (valor < 0) {
      throw new IllegalArgumentException("Valor de saque inválido: " + valor);
    }
    if (valor > limite) {
      throw new IllegalArgumentException("Saldo insuficiente para o saque: " + valor);
    }
    saldo -= valor;
    limite -= valor; }


  public void depositar(float valor){
    if (valor < 0) {
      throw new IllegalArgumentException("Valor de depósito inválido: " + valor);
    }
    saldo += valor;
    limite += valor;
  }

  public void setValorLimite(float valor){
    if (valor < 0) {
      throw new IllegalArgumentException("Valor de limite inválido: " + valor);
    }
    valorLimite = valor;
    limite = valor;
  }

public float getLimite() {
        return limite;
    }
    public float getSaldo() {
        return saldo;
    }
    public float getValorLimite() {
        return valorLimite;
    }

}