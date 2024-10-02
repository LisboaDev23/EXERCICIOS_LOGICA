package QuestaoEncapsulamentoContaBancaria;

public class ContaBancaria {

    private Double saldo;
    private String titular;
    ContaBancaria (String titular){
        this.titular = titular;
        this.saldo = 0D;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double sacar(Double valorSaque){
        if (valorSaque > getSaldo()){
            System.out.println("Valor do saque maior do que o saldo disponível, tente com outro valor!");
        } else if (valorSaque <= 0) {
            System.out.println("Valor do saque deve ser maior que 0!");
        } else {
            setSaldo(getSaldo() - valorSaque);
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo dísponivel após o saque: " + getSaldo());
        }
        return getSaldo();
    }

    public void depositar (Double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Deposite um valor válido maior que 0!");
        } else {
            setSaldo(getSaldo() + valorDeposito);
            System.out.println("Valor depositado com sucesso!");
            System.out.println("Saldo disponível após depósito: " + getSaldo());
        }
    }
}
