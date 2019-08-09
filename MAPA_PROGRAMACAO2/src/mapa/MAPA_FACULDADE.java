package mapa;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class MAPA_FACULDADE {

    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(1111, 1234, 5, 6000, 2000); 
        ContaCorrente contaCorrente2 = new ContaCorrente(2222, 4321, 0, 10000, 5000); 
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(3333, 5678, 9, 4000); 
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(4444, 9876, 5, 8000); 
        
        
        /* SAQUE CONTA CORRENTE */ 
       contaCorrente1.saque(3000);
       contaCorrente1.transferencia(3000, contaPoupanca1); 
        
       contaCorrente2.saque(2000); 
       contaCorrente2.saldo(); 
       
       
       /* SAQUE CONTA POUPANÇA */ 
       contaPoupanca1.saque(2000); 
       contaPoupanca1.transferencia(3000, contaPoupanca2);
        
       contaPoupanca2.saque(2500); 
       contaPoupanca2.saldo();
       
        
        /* TRANFERÊNCIA CONTA CORRENTE */
        contaCorrente1.transferencia(3800, contaCorrente2); 
        contaCorrente1.saldo(); 
        contaCorrente2.saldo(); 
        
         /* TRANFERÊNCIA CONTA POUPANÇA */
        contaPoupanca1.transferencia(1000, contaPoupanca2); 
        contaPoupanca1.saldo(); 
        contaPoupanca2.saldo(); 
        
        
        
    }
    
}

        