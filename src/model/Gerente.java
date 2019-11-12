package model;

public class Gerente extends Funcionario {

    private double porcentagemComissao;

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public Gerente(int matricula){
        setMatricula(matricula);
    }

    public String toString(){
        return "|====| GERENTE |====|" + "\nMatrícula: " + getMatricula() + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nCPF: " + getCpf() +
                "Data de nascimento: " + getDataNascimento() + "\nTelefone: " + getTelefone() + "\nEndereço: " +
                getEnd() + "";
    }

}
