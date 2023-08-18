package sistemaFolha;

public class Funcionario {
    private String nome;
    private String matricula;
    private Cargo cargo;

    public Funcionario(String nome, String matricula, Cargo cargo){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public Cargo getCargo(){
        return this.cargo;
    }
}
