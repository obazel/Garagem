package util;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Venda extends Transacao {

    //Neste caso, o cliente está comprando um carro na Garagem.

    public List<Venda> vendas = new ArrayList<>();

    public List<Veiculo> veiculosVendidos = new ArrayList<>();

    public Venda(){}

    public Venda(Cliente clienteComprador, Veiculo veiculoVendido, Vendedor vendedor, int id, int mes){
        setId(id);
        setCliente(clienteComprador);
        setVendedor(vendedor);
        setVeiculo(veiculoVendido);
        setMes(mes);

        vendas.add(this);
        veiculosVendidos.add(veiculoVendido);
    }

    public double verificaValorVendasPorMesPorFuncionarioVendedor(Funcionario funcionario, int mes){

        double valorVendasAcumulado = 0;

        for(Venda venda : vendas){
            if(mes == venda.getMes()){
                if(funcionario.equals(venda.getVendedor())){
                    valorVendasAcumulado += venda.getVeiculo().getValor();
                }
            }
        }
        return valorVendasAcumulado;
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
        return "|====| VENDA |====|" + "\nID: " + getId() +"\nCliente: " + getCliente().getNome() + "\nVeículo: " + getVeiculo().toString()  +
                "Vendedor: " + getVendedor().toString() + "\nMês: " + getMes();
    }

}
