package QuestaoFuncionarioHerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabriel Lisboa", 1848D);
        funcionario.exibirDados();

        Gerente gerente = new Gerente("Iasmim Bessa", 3500D, "Silvestres");
        gerente.exibirDados();
    }
}
