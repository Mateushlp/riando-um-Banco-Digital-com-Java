
public class ContaCorrente extends Conta {
  
  private static int SEQUENCIAL = 1;
  
  public ContaCorrente() {
    super.agencia = AGENCIA;
    super.numero = SEQUENCIAL++;


  }
}
