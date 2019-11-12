package util;

import model.Funcionario;
import model.Gerente;
import model.Vendedor;

public class CalculaSalario {

    Venda v = new Venda();

    public void calculaSalario(Funcionario funcionario, int mes){
        if(funcionario instanceof Vendedor){

            ((Vendedor) funcionario).setPorcentagemComissao(0.01);

            if(v.verificaValorVendasPorMesPorFuncionarioVendedor(funcionario,mes) >= 50000){
                funcionario.setSalario(v.verificaValorVendasPorMesPorFuncionarioVendedor(funcionario,mes) * ((Vendedor) funcionario).getPorcentagemComissao());
            }else{
                funcionario.setSalario(2500);
            }
        }
        if(funcionario instanceof Gerente){

            ((Gerente) funcionario).setPorcentagemComissao(0.02);

            if(v.verificaValorVendasMensal(mes) >= 150000){
                funcionario.setSalario(v.verificaValorVendasMensal(mes) * ((Gerente) funcionario).getPorcentagemComissao());
            }else{
                funcionario.setSalario(5000);
            }
        }
    }

}
