package model;

public abstract class Funcionario extends Pessoa {

    //Crianco a classe Funcionário, podemos diferenciar em Gerente e Vendedor, nada muito complicado.

    private double salario;
    private int matricula;
    private int numeroDeVendas;

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
