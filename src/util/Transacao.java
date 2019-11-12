package util;

import model.Cliente;
import model.Veiculo;
import model.Vendedor;


import java.util.ArrayList;
import java.util.List;

public abstract class Transacao {
    //Lista de veículos disponíveis para venda.
    public List<Veiculo> veiculosDisponiveis = new ArrayList<>();

    //Todas as transações devem conter os seguintes elementos.
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Vendedor vendedor;
    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

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

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
