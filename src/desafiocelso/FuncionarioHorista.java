package desafiocelso;

public class FuncionarioHorista extends Funcionario{
    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(String nome, int id, double salarioPorHora, int horasTrabalhadas) {
        super(nome, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    

    @Override
    public double getPagamento() {
        return salarioPorHora * horasTrabalhadas;
    }
}
