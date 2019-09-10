
public abstract class Conta
{
  
    private int numero;
    private int agencia;
    private double saldo;
    
   
    public Conta(int numero, int agencia, double saldo){
       super();
       this.numero = numero;
       this.agencia = agencia;
       this.saldo = saldo;
    }
       
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public abstract boolean sacar (double valor);   
    
    public void transferir(Conta recebedor,double valor){
        if(this.sacar(valor)) {
          recebedor.depositar(valor);
        }
        else {System.out.println("Saldo Indisponivel !");}
    }
    
    public double getSaldo(){return this.saldo;}
    public void setSaldo(double saldo){this.saldo = saldo;}
    
    public int getNumero(){return this.numero;}
    //public setNumero(int numero){this.numero = numero;}
    
    public int getAgencia(){return this.agencia;}
    //public setAgencia(int agencia){this.agencia = agencia;}
    
    public String toString(){
        return("Número = "+ numero +"agência = "+ agencia +"saldo = "+ saldo);
    }
    
}




