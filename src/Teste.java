import model.*;
import util.CadastraCarro;
import util.CompraGaragem;
import util.Venda;

public class Teste {
    public static void main(String[] args){

        Endereco e = new Endereco();
        Funcionario v1 = new Vendedor(001, "Carlos", "10/01/1987", 54434567, "Masculino",e, "62992999556" );
        Funcionario g1 = new Gerente(001, "João", "23/03/1982", 2138727635, "Masculino",e, "62987564559");
        Cliente c1 = new Cliente(0001, "Maria", "11/12/1990", 4357586, "Feminino",e, "629768569767");
        Marca m1 = new Marca("Volkswagem");
        Modelo m = new Modelo(2018, m1,"Gol");

        CadastraCarro c = new CadastraCarro();

        //Criando e adicionando carro á lista de carros disponíveis:
        Veiculo carro1 = new Veiculo("Azul", m, 55000, "NLA-1195");
        c.cadastro(carro1);
        Veiculo carro2 = new Veiculo("Branco", m, 32000, "NJU-9829");
        c.cadastro(carro2);

        CompraGaragem c23 = new CompraGaragem();
        System.out.println("VEÍCULOS DISPONÍVEIS----------------");
        c23.mostraVeiculosDisponíveis();

        Venda v = new Venda();

        //Criando uma transação de venda:
        Venda venda1 = new Venda(c1, carro1, v1, 22, 2);
        //Autorizando a transação acima
        v.realizaVenda(venda1, true);

        //Calculando salário do gerente, por mes.
        v.calculaSalario(g1,2);
        System.out.println(g1.getSalario());

        //Calculando salário do vendedor, por mes.
        v.calculaSalario(g1,2);
        System.out.println(g1.getSalario());

        //Criando uma transação de compra:
        CompraGaragem compra1 = new CompraGaragem(c1, carro2, v1, 23,3);
        System.out.println(compra1.toString());

        System.out.println("VEÍCULOS DISPONÍVEIS----------------");
        compra1.mostraVeiculosDisponíveis();



    }
}
