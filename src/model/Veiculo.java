package model;

public class Veiculo {

    private String cor;
    private Modelo modelo;
    private double valor;
    private String placa;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(){}

    public Veiculo(String cor, double valor, String placa, Modelo modelo){
        setCor(cor);
        setModelo(modelo);
        setPlaca(placa);
        setValor(valor);
    }

    public String toString(){
        return "\n» VEÍCULO «" +
                "\n  »»Cor: " + getCor() + 
                "\n  »»Placa: " + getPlaca() + 
                "\n  »»Valor: R$" + Math.round(getValor()) + ",00" + 
                 getModelo();
    }
}
