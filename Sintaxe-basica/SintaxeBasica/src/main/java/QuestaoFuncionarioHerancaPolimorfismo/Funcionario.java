package QuestaoFuncionarioHerancaPolimorfismo;

public class Funcionario {
    //Crie uma classe Funcionario com os atributos nome e salario.
    //Crie uma classe Gerente que herda Funcionario e adiciona o atributo departamento.
    //Crie um método exibirDados() em ambas as classes e use polimorfismo para exibir
    // informações de funcionários e gerentes.

    private String nome;
    private Double salario;
    Funcionario (String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void exibirDados(){
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Salário " + getSalario());
    }
}
