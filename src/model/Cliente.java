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
 
    public Cliente(int id, String nome, String dataNas, String cpf, String sexo, String end, String telefone){
        setId(id);
        setNome(nome);
        setDataNascimento(dataNas);
        setCpf(cpf);
        setSexo(sexo);
        setEnd(end);
        setTelefone(telefone);
    }
    

    public String toString(){
        return "|====| CLIENTE |====|" + "\nID: " + getId() + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nCPF: " + getCpf() +
                "\nData de nascimento: " + getDataNascimento() + "\nTelefone: " + getTelefone() + "\nEndereço: " +
                getEnd();
    }
}
