
/**
 * Escreva a descrição da classe ContaPoupanca aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ContaPoupanca extends Conta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    public ContaPoupanca(int numero, int agencia, double saldo) {
        super (numero, agencia, saldo);
        
    }
    
    public boolean sacar(double valor){
        if(getSaldo()>=valor){
        setSaldo(getSaldo() - valor);
        return true;
        }
        else{
            return false;
        }
          
    }
}
