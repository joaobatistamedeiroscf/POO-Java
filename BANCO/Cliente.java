package BANCO;

public class Cliente {
   private int numeroConta;
   private String nome;
   private double saldo;

   public Cliente() {
   }

   public void Depositar(double var1) {
      this.saldo += var1;
      System.out.println("Depósito de R$ " + var1 + " realizado com sucesso!");
   }

   public void Saque(double var1) {
      if (var1 <= this.saldo) {
         this.saldo -= var1;
         System.out.println("Saque de R$ " + var1 + " realiazado com sucesso!");
      } else {
         System.out.println("Saldo insuficiente para saque");
      }

   }

   public void setNumeroDaConta(int var1) {
      this.numeroConta = var1;
   }

   public void setNome(String var1) {
      this.nome = var1;
   }

   public void setSaldo(double var1) {
      this.saldo = var1;
   }

   public int getNumeroDaConta() {
      return this.numeroConta;
   }

   public String getNome() {
      return this.nome;
   }

   public double getSaldo() {
      return this.saldo;
   }
}
