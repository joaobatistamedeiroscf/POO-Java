package BANCO;

public class Cliente {
   private int numeroConta;
   private String nome;
   private double saldo;

   public Cliente() {
   }

   public void Depositar(double valor) {
      this.saldo += valor;
      System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
   }

   public void Saque(double valor) {
      if (valor <= this.saldo) {
         this.saldo -= valor;
         System.out.println("Saque de R$ " + valor + " realiazado com sucesso!");
      } else {
         System.out.println("Saldo insuficiente para saque");
      }

   }

   public void setNumeroDaConta(int numeroConta) {
      this.numeroConta = numeroConta;
   }

   public void setNome(String nome ) {
      this.nome = nome ;
   }

   public void setSaldo(double saldo ) {
      this.saldo = saldo;
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
