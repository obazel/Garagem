package util;

import model.Cliente;
import model.Gerente;
import model.Veiculo;
import model.Vendedor;

public class CompraCliente extends Transacao {

    //Neste caso, o cliente está comprando um carro na Garagem.

    private Cliente clienteComprador;
    private Veiculo veiculoVendido;
    private Gerente gerente;
    private Vendedor vendedor;

    public CompraCliente(Cliente clienteComprador, Veiculo veiculoVendido, Vendedor vendedor, Gerente gerente, int id){
        setId(id);
        setCliente(clienteComprador);
        setGerente(gerente);
        setVendedor(vendedor);
        setVeiculo(veiculoVendido);
    }

    public double calculaValorTransacao(){
        return veiculoVendido.getValor();
    }
}
