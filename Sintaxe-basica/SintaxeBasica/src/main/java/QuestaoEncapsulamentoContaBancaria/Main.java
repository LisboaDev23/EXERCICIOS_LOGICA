package QuestaoEncapsulamentoContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaGabriel = new ContaBancaria("Gabriel Lisboa");
        contaGabriel.depositar(1000D);
        Double dinheiroEspecie = contaGabriel.sacar(82D);
        System.out.println("Você tem sacado " + dinheiroEspecie);
    }
}
