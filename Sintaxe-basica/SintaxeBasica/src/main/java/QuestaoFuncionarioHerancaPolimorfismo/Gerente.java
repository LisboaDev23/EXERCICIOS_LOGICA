package QuestaoFuncionarioHerancaPolimorfismo;

public class Gerente extends Funcionario{

    private String departamento;

    Gerente(String nome, Double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void exibirDados(){
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Salário: "  + getSalario());
        System.out.println("Departamento: " + getDepartamento());
    }
}
