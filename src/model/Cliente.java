package model;

public class Cliente extends Pessoa {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(){}
    
    public Cliente(String cpf){ setCpf(cpf); }
 
    public Cliente(int id, String nome, String cpf, String sexo, String end, String telefone, int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
        
        String dataNas = getDia() + "/" + getMes() + "/" + getAno();
        
        setId(id);
        setNome(nome);
        setDataNascimento(dataNas);
        setCpf(cpf);
        setSexo(sexo);
        setEnd(end);
        setTelefone(telefone);
    }
    

    public String toString(){
        return "\n» CLIENTE «" +
                "\n  »» ID: " + getId() + 
                "\n  »» Nome: " + getNome() + 
                "\n  »» Sexo: " + getSexo() + 
                "\n  »» CPF: " + getCpf() +
                "\n  »» Data de nascimento: " + getDataNascimento() + 
                "\n  »» Telefone: " + getTelefone() + 
                "\n  »» Endereço: " + getEnd() + "\n";
    }
}
