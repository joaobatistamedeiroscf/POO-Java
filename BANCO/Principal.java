package BANCO;

public class Principal {
   public Principal() {
   }

   public static void main(String[] args ) {
      System.out.println("Inicio:");
      Cliente c1 = new Cliente();
      c1.setNumeroDaConta(1237);
      c1.setNome("João");
      c1.setSaldo(500.0);
      System.out.println("Cliente" + c1.getNome());
      System.out.println("Saldo inicial:" + c1.getSaldo());
      c1.Depositar(150.0);
      c1.Saque(200.0);
      System.out.println("Saldo final:" + c1.getSaldo());
   }
}
