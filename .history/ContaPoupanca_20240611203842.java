
public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 1;
  
  public ContaCorrente() {
    super.agencia = Conta.AGENCIA_PADRAO;
    super.numero = SEQUENCIAL++;
  }
}

}