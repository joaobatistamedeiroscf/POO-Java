package BANCO;

public class Principal {
   public Principal() {
   }

   public static void main(String[] var0) {
      System.out.println("Inicio:");
      Cliente var1 = new Cliente();
      var1.setNumeroDaConta(1237);
      var1.setNome("João");
      var1.setSaldo(500.0);
      System.out.println("Cliente" + var1.getNome());
      System.out.println("Saldo inicial:" + var1.getSaldo());
      var1.Depositar(150.0);
      var1.Saque(200.0);
      System.out.println("Saldo final:" + var1.getSaldo());
   }
}
