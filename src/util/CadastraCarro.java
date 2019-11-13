package util;

import model.Veiculo;

public class CadastraCarro extends Transacao{
    public void cadastro(Veiculo v){
        veiculosDisponiveis.add(v);
    }
}
