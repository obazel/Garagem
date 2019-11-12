package util;

import model.Cliente;
import model.Gerente;
import model.Veiculo;
import model.Vendedor;

public class CompraGaragem extends Transacao{

    //Nesta classe ocorre a transação de compra por parte da Garagem de um carro de terceiros.

    public CompraGaragem(Cliente clienteVendedor, Veiculo veiculoComprado, Vendedor vendedor, Gerente gerente, int id){
        setId(id);
        setCliente(clienteVendedor);
        setGerente(gerente);
        setVendedor(vendedor);
        setVeiculo(veiculoComprado);

        //Adicionando valor da transação áo Vendedor.
        vendedor.setValorVendido(veiculoComprado.getValor() + vendedor.getValorVendido());
    }


}
