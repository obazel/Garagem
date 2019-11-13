package util;

import model.Cliente;
import model.Funcionario;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Transacao {

    //Lista de veículos disponíveis para venda.
    protected List<Veiculo> veiculosDisponiveis = new ArrayList<>();

    //Todas as transações devem conter os seguintes elementos.
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Funcionario vendedor;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void adicionaVeiculo(Veiculo v){
        this.veiculosDisponiveis.add(v);
    }

    public void mostraVeiculos(){
        for(Veiculo v : veiculosDisponiveis){
            System.out.println(v.toString());
        }
    }

    public void removeVeiculo(Veiculo v){
        this.veiculosDisponiveis.remove(v);
    }
}
