package model;

public class Vendedor extends Funcionario {

    private double valorVendido; //Obtido pela soma das vendas do próprio vendedor.

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public Vendedor(int matricula){
        setMatricula(matricula);
    }

    public void calculaSalario(){

        //Se o volume de vendas atingir um certo patamar, o vendedor ganha comissão, caso contrario, o salário é tabelado.

        if(getValorVendido() > 50000){
            setSalario(getNumeroDeVendas() * (0.50 * getValorVendido()));
        }else{
            setSalario(2000);
        }
    }
}
