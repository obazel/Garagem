package util;

import model.*;

public class CompraGaragem extends Transacao{

    public CompraGaragem(){}

    //Nesta classe ocorre a transação de compra por parte da Garagem de um carro de terceiros.
    public CompraGaragem(Cliente clienteVendedor, Veiculo veiculoComprado, int id, int mes, int ano){
        setId(id);
        setCliente(clienteVendedor);
        setVeiculo(veiculoComprado);
        setMes(mes);
        setAno(ano);
    }

    public String toString(){
        return "\n» COMPRA REGISTRADA «" +
                "\n  »» ID: " + getId() + 
                "\n  »» Mês: " + getMes() + 
                "\n  »» Ano: " + getAno() +
                getCliente() +
                getVeiculo() +
                getVendedor();
    }
}
