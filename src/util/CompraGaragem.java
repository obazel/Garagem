package util;

import model.Cliente;
import model.Gerente;
import model.Veiculo;
import model.Vendedor;

public class CompraGaragem extends Transacao{

    //Nesta classe ocorre a transação de compra por parte da Garagem de um carro de terceiros.
    public CompraGaragem(Cliente clienteVendedor, Veiculo veiculoComprado, Vendedor vendedor, int id){
        setId(id);
        setCliente(clienteVendedor);
        setVendedor(vendedor);
        setVeiculo(veiculoComprado);

        veiculosDisponiveis.add(veiculoComprado);
    }

    public String toString(){
        return "|====| COMPRA |====|" + "\nID: " + getId() +"\nCliente: " + getCliente().getNome() + "\nVeículo: " + getVeiculo().toString()  +
                "Vendedor: " + getVendedor().toString() + "\nMês: " + getMes();
    }
}
