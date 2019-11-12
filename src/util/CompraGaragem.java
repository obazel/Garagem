package util;

import model.Cliente;
import model.Gerente;
import model.Veiculo;
import model.Vendedor;

public class CompraGaragem extends Transacao{

    //Nesta classe ocorre a transação de compra por parte da Garagem de um carro de terceiros.

    private Cliente clienteVendedor;
    private Veiculo veiculoComprado;
    private Gerente gerente;
    private Vendedor vendedor;

    public CompraGaragem(Cliente clienteVendedor, Veiculo veiculoComprado, Vendedor vendedor, Gerente gerente, int id){
        setId(id);
        setCliente(clienteVendedor);
        setGerente(gerente);
        setVendedor(vendedor);
        setVeiculo(veiculoComprado);
    }

    public double calculaValorTransacao(){
        return veiculoComprado.getValor();
    }
}
