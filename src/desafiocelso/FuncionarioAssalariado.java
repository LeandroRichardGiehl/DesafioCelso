package desafiocelso;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioMensal;

    public FuncionarioAssalariado() {
    }

    public FuncionarioAssalariado(String nome, int id, double salarioMensal) {
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double getPagamento() {
        return salarioMensal;
    }
}
