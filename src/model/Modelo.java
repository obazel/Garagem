package model;

public class Modelo {

    private Marca marca;
    private String nomeModelo;
    private int ano;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nome) {
        this.nomeModelo = nome;
    }
    
    public Modelo(){}

    public Modelo(int ano, String nomeModelo, Marca marca){
        setAno(ano);
        setMarca(marca);
        setNomeModelo(nomeModelo);
    }
    
    public String toString(){
        return "\n» MODELO «" +
                "\n  »» " + getNomeModelo() +
                "\n  »»Ano: " + getAno() +
                getMarca().toString();
                
    }
}
