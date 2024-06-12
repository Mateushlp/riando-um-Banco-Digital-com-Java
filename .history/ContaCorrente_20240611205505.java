
public class ContaCorrente extends Conta {

  @Override
  public void imprimirExtrato() {
    System.out.println("===Extrato conta corrente===");
    System.out.println(String.format("Agencia : %d", null));
    System.out.println();
    System.out.println();
  }
}
