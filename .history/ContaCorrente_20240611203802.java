
public class ContaCorrente extends Conta {
  
  private static int SEQUENCIAL = 1;
  
  public ContaCorrente() {
    super.agencia = ConAGENCIA_PADRAO;
    super.numero = SEQUENCIAL++;


  }
}
