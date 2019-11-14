package model;

public class Vendedor extends Funcionario {

    private double porcentagemComissao;

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public Vendedor(int matricula, String nome, String dataNas, String cpf, String sexo, String end, String telefone){
        setMatricula(matricula);
        setNome(nome);
        setDataNascimento(dataNas);
        setCpf(cpf);
        setSexo(sexo);
        setEnd(end);
        setTelefone(telefone);
    }

    public Vendedor(){}
    
    public String toString(){
        return "|====| VENDEDOR |====|" + "\nMatrícula: " + getMatricula() + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nCPF: " + getCpf() +
                "\nData de nascimento: " + getDataNascimento() + "\nTelefone: " + getTelefone() + "\nEndereço: " +
                getEnd() + "";
    }
}
