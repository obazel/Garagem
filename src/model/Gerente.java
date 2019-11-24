package model;

public class Gerente extends Funcionario {

    private double porcentagemComissao;

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public Gerente(int matricula, String nome, String cpf, String sexo, String end, String telefone, int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
        
        String dataNas = getDia() + "/" + getMes() + "/" + getAno();
        
        setMatricula(matricula);
        setNome(nome);
        setDataNascimento(dataNas);
        setCpf(cpf);
        setSexo(sexo);
        setEnd(end);
        setTelefone(telefone);
    }
    
    public Gerente(){}

    public String toString(){
        return "\n» GERENTE «" +
                "\n  »» Matrícula: " + getMatricula() + 
                "\n  »» Nome: " + getNome() + 
                "\n  »» Sexo: " + getSexo() + 
                "\n  »» CPF: " + getCpf() +
                "\n  »» Data de nascimento: " + getDataNascimento() + 
                "\n  »» Telefone: " + getTelefone() + 
                "\n  »» Endereço: " + getEnd() + "\n";
    }

}
