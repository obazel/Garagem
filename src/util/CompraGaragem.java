package util;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class CompraGaragem extends Transacao{

    public List<Veiculo> veiculosComprados = new ArrayList<>();

    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public CompraGaragem(){}

    //Nesta classe ocorre a transação de compra por parte da Garagem de um carro de terceiros.
    public CompraGaragem(Cliente clienteVendedor, Veiculo veiculoComprado, Funcionario vendedor, int id, int mes){
        setId(id);
        setCliente(clienteVendedor);
        setVendedor(vendedor);
        setVeiculo(veiculoComprado);
        setMes(mes);

        veiculosDisponiveis.add(veiculoComprado);
        this.veiculosComprados.add(veiculoComprado);
    }

    public String toString(){
        return "|====| COMPRA |====|" + "\nID: " + getId() +"\nCliente: " + getCliente().getNome() + "\n" + getVeiculo().toString()  +
                "\n" + getVendedor().toString() + "\nMês: " + getMes();
    }
}
