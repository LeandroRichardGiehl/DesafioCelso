package desafiocelso;

public class Funcionario {
    private String nome;
    private int id;

    public Funcionario() {
    }

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPagamento() {
        return 0.0;
    }
}

