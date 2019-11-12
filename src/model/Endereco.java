package model;

public class Endereco {

    //Criando a classe Endereço - podemos trocar para a funconalidade dos Correios.

    private int cep;
    private int numero;
    private String logradouro;
    private String tipo;

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Endereco(){}

    public Endereco(int cep, int numero, String logradouro, String tipo){
        setCep(cep);
        setLogradouro(logradouro);
        setNumero(numero);
        setTipo(tipo);
    }
}
