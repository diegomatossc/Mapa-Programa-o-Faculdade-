package contas;

public abstract class Conta { 
    protected int agencia;
    protected int numero;
    protected int digito;
    protected double saldo;
    
    public void saque(double valor){
        if(valor <= saldo){ 
            this.setSaldo(saldo - valor);
        } else { 
            System.out.println("Saldo insuficiente para realizar o saque.");
            System.out.println("Seu saldo é:"+this.getSaldo());
            System.out.println("Valor solicitado de:"+valor);
        }
    }
    public void deposito(double valor){
        this.setSaldo(saldo + valor); 
    }
    public void transferencia(double valor, Conta conta){
        if(valor <= saldo){ 
            this.setSaldo(saldo - valor); 
            conta.setSaldo(conta.getSaldo() + valor); 
        } else { 
            System.out.println("Saldo insuficiente para realizar a trasferência.");
            System.out.println("Seu saldo é:"+this.getSaldo());
            System.out.println("Valor solicitado de:"+valor);
        }
    }
    
    public void saldo(){
        System.out.println(this.toString());
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) { 
        this.agencia = agencia;
    }
    public int getNumero() { 
        return numero;
    }
    public void setNumero(int numero) { 
        this.numero = numero;
    }
    public int getDigito() { 
        return digito;
    }
    public void setDigito(int digito) { 
        this.digito = digito;
    }
    public double getSaldo() { 
        return saldo;
    }
    public void setSaldo(double saldo) { 
        this.saldo = saldo;
    }
    @Override
    public String toString() { 
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", digito=" + digito + ", saldo=" + saldo + '}';
    }
    
}
