import model.Veiculo;
import model.Vendedor;
import util.CompraGaragem;
import util.Transacao;
import util.Venda;

public class Teste {
    public static void main(String[] args){
        Vendedor v = new Vendedor(123123);
        v.setNome("Marlucio");

        Veiculo veiculo = new Veiculo();
        veiculo.setValor(300);


    }
}
