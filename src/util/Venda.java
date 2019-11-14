package util;

import model.*;

public class Venda extends Transacao {

    //Neste caso, o cliente está comprando um carro na Garagem.
   
    public Venda(Cliente clienteComprador, Veiculo veiculoVendido, Funcionario vendedor, int id, int mes){
        setId(id);
        setCliente(clienteComprador);
        setVendedor(vendedor);
        setVeiculo(veiculoVendido);
        setMes(mes);
    }

    public Venda(){}

    public String toString(){
        return "| Venda |" + "\nID: " + getId() +"\nCliente: " + getCliente().getNome() + "\n" + getVeiculo().toString()  +
                "\n " + "Vendedor: " + getVendedor() + "\nMês: " + getMes();
    }

}
