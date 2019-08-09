package contas;

public class ContaPoupanca extends Conta{
    
    
     public ContaPoupanca(){    
    }
    
    public ContaPoupanca(int agencia, int numero, int digito, double saldo){
        super.setAgencia(agencia);
        super.setNumero(numero);
        super.setDigito(digito);
        super.setSaldo(saldo);
    }
    
    public ContaPoupanca(ContaCorrente novaConta){
        this(novaConta.getAgencia(), novaConta.getNumero(), novaConta.getDigito(), novaConta.getSaldo());
    }
    
    public void rendimento(double perc){
        super.setSaldo((perc*saldo)+saldo);
    }
}
