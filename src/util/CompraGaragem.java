package util;

import model.*;

public class CompraGaragem extends Transacao{

    public CompraGaragem(){}

    //Nesta classe ocorre a transação de compra por parte da Garagem de um carro de terceiros.
    public CompraGaragem(Cliente clienteVendedor, Veiculo veiculoComprado, Funcionario vendedor, int id, int mes){
        setId(id);
        setCliente(clienteVendedor);
        setVendedor(vendedor);
        setVeiculo(veiculoComprado);
        setMes(mes);
    }

    public String toString(){
        return "\n» COMPRA REGISTRADA «" +
                "\n  »»ID: " + getId() + 
                "\n  »»Mês: " + getMes() + 
                getCliente() +
                getVeiculo() +
                getVendedor();
    }
}
