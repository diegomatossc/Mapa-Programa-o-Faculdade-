package contas;

public class ContaCorrente extends Conta{
    
    private double limite; 
    
    public ContaCorrente(){
    }
    public ContaCorrente(int agencia, int numero, int digito, double saldo, double limite){
        super.setAgencia(agencia);
        super.setNumero(numero);
        super.setDigito(digito);
        super.setSaldo(saldo);
        this.setLimite(limite);
    }
    
    public ContaCorrente(ContaCorrente novaConta){
        this(novaConta.getAgencia(), novaConta.getNumero(), novaConta.getDigito(), novaConta.getSaldo(), novaConta.getLimite());
    }
    
    
    @Override
    public void saque(double valor){
        if(valor <= limite){ 
            super.saque(valor); 
        } else { 
            System.out.println("Valor ultrapassa o limite para saque.");
            System.out.println("O limite para saque é:"+limite);
            System.out.println("Valor solicitado de:"+valor);
        }
    }
   
    @Override
    public void transferencia(double valor, Conta conta){
        if(valor <= limite){  
            super.transferencia(valor, conta); 
        } else {
            System.out.println("O Valor ultrapassa o limite para Transferência.");
            System.out.println("O limite para transferência é:"+limite);
            System.out.println("O Valor solicitado de:"+valor);
        }
    }

    public double getLimite() {
        return limite;
    }

    public final void setLimite(double limite) { 
        this.limite = limite;
    }
    
}
