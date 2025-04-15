public class Aluno {
    private String nome ;
    private int idade;
    private float peso ; 
    private float altura;
    
public float calculaImc(){
    float quadrado =(float) Math.pow(altura,2);
    float Imc = peso / quadrado ;  
    return Imc ;
}
public boolean maiorDeIdade(){
    if(idade >= 18 ){
        return true ;
    }
    return false ;
}

public void setNome(String nome ){
    this.nome =  nome ;
 }

public void setIdade(int idade ){
    this.idade = idade ;
}

public void setAltura(float altura ){
    this.altura =  altura ;
}

public void setPeso(float peso){
    this.peso =  peso ;
}
 
public String getNome(){
    return nome ;
}

public int getIdade(){
    return idade ;
}

public float getPeso(){
    return peso ;
}

public float getAltura(){
    return altura ;
}

}
