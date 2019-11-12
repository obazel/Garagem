package model;

public class Gerente extends Funcionario {

    private double valorVendido; //Obtido pela soma das vendas de todos os vendedores.

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public Gerente(int matricula){
        setMatricula(matricula);
    }

    public void calculaSalario(){

        //Se o volume de vendas atingir um certo patamar, o gerente ganha comissão, caso contrario, o salário é tabelado.

        if(getValorVendido() > 150000){
            setSalario(getNumeroDeVendas() * (0.50 * getValorVendido()));
        }else{
            setSalario(2000);
        }
    }
}
