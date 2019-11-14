/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GUI.*;
import model.*;
import util.Cadastramento;

/**
 *
 * @author Matheus Henrick
 */
public class Teste {
    public static void main(String[] args){
        Cliente c = new Cliente();
        
        c.setNome("Matheus Henrick");
        c.setSexo("Masculino");
        c.setDataNascimento("08/02/1999");
        c.setCpf("043.545.571-00");
        c.setId(1);
        c.setTelefone("(62) 9 9299-9449 ");
        c.setEnd("Avenida Maria Pestana, QD 77 LT 7 - Jardim Balneário M. Ponte");
        
        Marca marca = new Marca();
        
        marca.setNome("Volkswagem");
        
        Modelo modelo = new Modelo();
        
        modelo.setMarca(marca);
        modelo.setNomeModelo("Gol");
        modelo.setAno(2008);
        
        Veiculo v = new Veiculo();
        
        v.setPlaca("NLA-1194");
        v.setCor("Vermelho");
        v.setValor(12500);
        v.setModelo(modelo);
        
        Vendedor vendedor = new Vendedor();
        
        vendedor.setMatricula(1);
        vendedor.setCpf("001.532.173-27");
        vendedor.setDataNascimento("10/11/1981");
        vendedor.setNome("Lorena Larissa");
        vendedor.setSexo("Feminino");
        vendedor.setEnd("Rua B, Quadra 16 - Monções, Goiânia, GO.");
        vendedor.setTelefone("(62) 9 9188-2936");
        
        Cadastramento.adicionaCliente(c);
        Cadastramento.adicionaVeiculo(v);
        Cadastramento.adicionaMarca(marca);
        Cadastramento.adicionaModelo(modelo);
        Cadastramento.adicionaVendedor(vendedor);
        
        
        //Main de verdade
        Menu m = new Menu();
        m.setVisible(true);
        

    }
    
}
