package util;

import model.*;

public class Venda extends Transacao {

    //Neste caso, o cliente está comprando um carro na Garagem.
   
    public Venda(Cliente clienteComprador, Veiculo veiculoVendido, Funcionario vendedor, int id, int dia, int mes, int ano){
        setDia(dia);
        setId(id);
        setCliente(clienteComprador);
        setVendedor(vendedor);
        setVeiculo(veiculoVendido);
        setMes(mes);
        setAno(ano);
    }

    public Venda(){}

    public String toString(){
        return "\n» VENDA REGISTRADA «" +
                "\n  »» ID: " + getId() + 
                "\n  »» Mês: " + getMes() + 
                "\n  »» Ano: " + getAno() +
                getCliente() +
                getVeiculo() +
                getVendedor();
    }

}
