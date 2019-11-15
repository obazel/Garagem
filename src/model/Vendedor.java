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
        return "\n» VENDEDOR «" +
                "\n  »»Matrícula: " + getMatricula() + 
                "\n  »»Nome: " + getNome() + 
                "\n  »»Sexo: " + getSexo() + 
                "\n  »»CPF: " + getCpf() +
                "\n  »»Data de nascimento: " + getDataNascimento() + 
                "\n  »»Telefone: " + getTelefone() + 
                "\n  »»Endereço: " + getEnd();
    }
}
