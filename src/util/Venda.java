package util;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Venda extends Transacao {

    //Neste caso, o cliente está comprando um carro na Garagem.

    private List<Venda> vendas = new ArrayList<>();

    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Venda(Cliente clienteComprador, Veiculo veiculoVendido, Funcionario vendedor, int id, int mes){
        setId(id);
        setCliente(clienteComprador);
        setVendedor(vendedor);
        setVeiculo(veiculoVendido);
        setMes(mes);
    }

    public Venda(){}

    public void calculaSalario(Funcionario funcionario, int mes){

        double valorVendasAcumulado = 0;
        double valorTotal = 0;

        if(funcionario instanceof Vendedor) {

            ((Vendedor) funcionario).setPorcentagemComissao(0.01);

            for (Venda v : vendas) {

                if (mes == v.getMes()) {
                    if (funcionario.equals(v.getVendedor())) {
                        valorVendasAcumulado += v.getVeiculo().getValor();
                    }
                }
            }
            ((Vendedor) funcionario).setPorcentagemComissao(0.01);

            if (valorVendasAcumulado >= 50000) {
                funcionario.setSalario(valorVendasAcumulado * ((Vendedor) funcionario).getPorcentagemComissao());
            } else {
                funcionario.setSalario(2500);
            }
        }

        if(funcionario instanceof Gerente){

            ((Gerente) funcionario).setPorcentagemComissao(0.02);

            for(Venda v : vendas){
                if(mes == v.getMes()){
                    valorTotal += v.getVeiculo().getValor();
                }
            }

            if(valorTotal >= 150000){
                funcionario.setSalario(valorTotal * ((Gerente) funcionario).getPorcentagemComissao());
            }else{
                funcionario.setSalario(5000);
            }
        }
    }

    public double verificaValorVendasMensal(int mes){

        double valorTotal = 0;

        for(Venda venda : vendas){
            if(mes == venda.getMes()){
                valorTotal += venda.getVeiculo().getValor();
            }
        }
        return valorTotal;
    }

    public String toString(){
        return "|====| VENDA |====|" + "\nID: " + getId() +"\nCliente: " + getCliente().getNome() + "\n" + getVeiculo().toString()  +
                "\n " + getVendedor().toString() + "\nMês: " + getMes();
    }

}
