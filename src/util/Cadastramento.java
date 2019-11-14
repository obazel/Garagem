/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Funcionario;
import model.Gerente;
import model.Marca;
import model.Modelo;
import model.Veiculo;
import model.Vendedor;

/**
 *
 * @author Matheus Henrick
 */
public class Cadastramento {
    
    //Lista de Marcas
    public static ArrayList<Marca> marcas = new ArrayList<Marca>();
    
    public static void adicionaMarca(Marca m){
        marcas.add(m);
    }
    
    public static void mostraMarcas(){
        for(Marca marca : marcas){
            System.out.println(marca.toString());
        }
    }
    
    //Lista de Modelos
    public static List<Modelo> modelos = new ArrayList<Modelo>();
    
    public static void adicionaModelo(Modelo m){
        modelos.add(m);
    }
    
    public static void mostraModelo(){
        for(Modelo modelo : modelos){
            System.out.println(modelo.toString());
        }
    }
    
    //Lista de Clientes
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    
    public static void adicionaCliente(Cliente c){
        clientes.add(c);
    }

    public static void mostraClientes(){
        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
        
    }
    
    public static boolean existeCliente(String cpf){
        boolean opc = false;
        for(Cliente cliente : clientes){
            if(cliente.getCpf().equalsIgnoreCase(cpf)){
                opc = true;
            }
            break;
        }
        return opc;
    }
    
    public static Cliente procuraCliente(String cpf){
        Cliente c = new Cliente();
        for(Cliente cliente : clientes){
            if(cliente.getCpf().equalsIgnoreCase(cpf)){
                c = cliente;
            }
            break;
        }
        return c;
    }
    
    //Lista de vendedores
    public static List<Vendedor> vendedores = new ArrayList<Vendedor>();
    
    public static void adicionaVendedor(Vendedor v){
        vendedores.add(v);
    }

    public static String mostraVendedores(){
        String s = "";
        for(Vendedor vendedor : vendedores){
           s = vendedor.toString();
        }
        return s;
    }
    
    public static boolean existeVendedor(int matricula){
        boolean opc = false;
        for(Vendedor vendedor : vendedores){
            if(vendedor.getMatricula() == matricula){
                opc = true;
            }
            break;
        }
        return opc;
    }
    
    public static Vendedor procuraVendedor(int matricula){
        
        Vendedor v = new Vendedor();
        
        for(Vendedor vendedor : vendedores){
            if(vendedor.getMatricula() == matricula){
                v = vendedor;
            }
            break;
        }
        return v;
    }
    
    public static Vendedor procuraVendedorNome(String matricula){
        
        Vendedor v = new Vendedor();
        
        for(Vendedor vendedor : vendedores){
            if(vendedor.getNome() == matricula){
                v = vendedor;
            }
            break;
        }
        return v;
    }
    
    //Lista de compras da garagem
    public static List<CompraGaragem> compras = new ArrayList<CompraGaragem>();
    
    public static void adicionaCompraGaragem(CompraGaragem v){
        compras.add(v);
    }

    public static String mostraCompraGaragem(){
        String s = "";
        for(CompraGaragem compra : compras){
           s = compra.toString();
        }
        return s;
    }
    
    public static boolean existeCompraGaragem(int id){
        boolean opc = false;
        for(CompraGaragem compra : compras){
            if(compra.getId() == id){
                opc = true;
            }
            break;
        }
        return opc;
    }
    
    public static CompraGaragem procuraCompraGaragem(int id){
        
        CompraGaragem v = new CompraGaragem();
        
        for(CompraGaragem compra : compras){
            if(compra.getId() == id){
                v = compra;
            }
            break;
        }
        return v;
    }
    
    
    //Lista de Veículos
    public static List<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    public static void adicionaVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public static boolean existeVeiculo(String placa){
        boolean opc = false;
        for(Veiculo veiculo : veiculos){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                opc = true;
            }
            break;
        }
        return opc;
    }
    
    public static Veiculo procuraVeiculo(String placa){
        
        Veiculo v = new Veiculo();
        for(Veiculo veiculo : veiculos){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                v = veiculo;
            }
            break;
        }
        return v;
    }
    
    //Lista de Vendas
    private static List<Venda> vendas = new ArrayList<>();
    
    public static void adicionaVenda(Venda v){
        vendas.add(v);
    }
    
    public static String mostraVendas(){
        String s = "";
        for(Venda venda : vendas){
            s = venda.toString();
        }
        return s;
    }
    
    //Calculo de salários
     public static void calculaSalario(Funcionario funcionario, int mes){

        double valorVendasAcumulado = 0;
        double valorTotal = 0;

        if(funcionario instanceof Vendedor) {

            ((Vendedor) funcionario).setPorcentagemComissao(0.01);

            for (Venda v : vendas) {

                if (mes == v.getMes()) {
                    if (funcionario.equals(v.getVendedor())) {
                        valorVendasAcumulado += v.getVeiculo().getValor();
                    }
                }
            }
            ((Vendedor) funcionario).setPorcentagemComissao(0.01);

            if (valorVendasAcumulado >= 50000) {
                funcionario.setSalario(valorVendasAcumulado * ((Vendedor) funcionario).getPorcentagemComissao());
            } else {
                funcionario.setSalario(2500);
            }
        }

        if(funcionario instanceof Gerente){

            ((Gerente) funcionario).setPorcentagemComissao(0.02);

            for(Venda v : vendas){
                if(mes == v.getMes()){
                    valorTotal += v.getVeiculo().getValor();
                }
            }

            if(valorTotal >= 150000){
                funcionario.setSalario(valorTotal * ((Gerente) funcionario).getPorcentagemComissao());
            }else{
                funcionario.setSalario(5000);
            }
        }
    }

    //Calculo de vendas/mes
     public static double verificaValorVendasMensal(int mes){

        double valorTotal = 0;

        for(Venda venda : vendas){
            if(mes == venda.getMes()){
                valorTotal += venda.getVeiculo().getValor();
            }
        }
        return valorTotal;
    }
    
}