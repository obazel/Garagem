package model;

public class Vendedor extends Funcionario {

    private double porcentagemComissao;

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public Vendedor(int matricula, String nome, String dataNas, double cpf, String sexo, Endereco end, String telefone){
        setMatricula(matricula);
        setNome(nome);
        setDataNascimento(dataNas);
        setCpf(cpf);
        setSexo(sexo);
        setEnd(end);
        setTelefone(telefone);
    }

    public String toString(){
        return "|====| VENDEDOR |====|" + "\nMatrícula: " + getMatricula() + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nCPF: " + getCpf() +
                "Data de nascimento: " + getDataNascimento() + "\nTelefone: " + getTelefone() + "\nEndereço: " +
                getEnd() + "";
    }
}
