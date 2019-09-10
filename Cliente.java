
public class Cliente{
   
     private String nome;
     private String cpf;
     private Conta conta;
     private Seguro seguro;
     
    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }
    
    public void setSeguro(Seguro seguro){
        this.seguro = seguro;
    }
    
    public String getNome(){
        return nome;
    }    
    public String getCpf(){
        return cpf;
    }  
    public Conta getConta(){
        return conta;
    }  
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
   
}
