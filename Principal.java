public class Principal {
    public static void main(String[] args){
        System.out.println("Inicio:");

        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setIdade(20);
        a1.setPeso(72);
        a1.setAltura(1.78f);


        System.out.println(a1.getNome() + " seu IMC:" + a1.calculaImc());

        if(a1.maiorDeIdade()){
            System.out.println("Maior de idade , sem desconto");
        }else {
            System.out.println("Menor de idade , com desconto");
        }
    }
}
