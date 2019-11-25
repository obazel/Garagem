/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Gerente;
import model.Marca;
import model.Modelo;
import model.Veiculo;
import model.Vendedor;
import util.Cadastramento;
import util.CompraGaragem;
import util.Venda;

/**
 *
 * @author Matheus Henrick
 */
public class PaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicial
     */
    public PaginaInicial() {
        initComponents();
        setTitle("SISTEMA - CONCESSIONÁRIA");
        setLocationRelativeTo(null);
        setIcon();
        
        //Carregando Banco de Dados dos Clientes para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoClientes.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaCliente(new Cliente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], Integer.parseInt(linhaSeparada[6]), Integer.parseInt(linhaSeparada[7]), Integer.parseInt(linhaSeparada[8])));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaCliente(new Cliente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], Integer.parseInt(linhaSeparada[6]), Integer.parseInt(linhaSeparada[7]), Integer.parseInt(linhaSeparada[8])));

                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        //Carregando Banco de Dados dos Veiculos para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoVeiculos.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaVeiculo(Cadastramento.adicionaVeiculo(new Veiculo(linhaSeparada[0], Double.parseDouble(linhaSeparada[1]), linhaSeparada[2], new Modelo(Integer.parseInt(linhaSeparada[3]), linhaSeparada[4], new Marca(linhaSeparada[5])))));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaVeiculo(Cadastramento.adicionaVeiculo(new Veiculo(linhaSeparada[0], Double.parseDouble(linhaSeparada[1]), linhaSeparada[2], new Modelo(Integer.parseInt(linhaSeparada[3]), linhaSeparada[4], new Marca(linhaSeparada[5])))));

                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        //Carregando Banco de Dados dos Gerentes para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoGerentes.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaGerente(new Gerente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], Integer.parseInt(linhaSeparada[6]), Integer.parseInt(linhaSeparada[7]), Integer.parseInt(linhaSeparada[8])));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaGerente(new Gerente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], Integer.parseInt(linhaSeparada[6]), Integer.parseInt(linhaSeparada[7]), Integer.parseInt(linhaSeparada[8])));

                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        //Carregando Banco de Dados dos Vendedores para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoVendedores.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaVendedor(new Vendedor(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], Integer.parseInt(linhaSeparada[6]), Integer.parseInt(linhaSeparada[7]), Integer.parseInt(linhaSeparada[8])));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaVendedor(new Vendedor(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], Integer.parseInt(linhaSeparada[6]), Integer.parseInt(linhaSeparada[7]), Integer.parseInt(linhaSeparada[8])));

                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        //Carregando Banco de Dados das Vendas para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoVendas.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaVenda(new Venda(Cadastramento.procuraCliente(linhaSeparada[0]), Cadastramento.procuraVeiculo(linhaSeparada[1]), Cadastramento.procuraVendedorNome(linhaSeparada[2]), Integer.parseInt(linhaSeparada[3]), Integer.parseInt(linhaSeparada[4]), Integer.parseInt(linhaSeparada[5])));
            Cadastramento.adicionaVeiculosVendidos(Cadastramento.procuraVeiculo(linhaSeparada[1]));
            Cadastramento.removeVeiculoDisponivel(Cadastramento.procuraVeiculo(linhaSeparada[1]));
            
             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaVenda(new Venda(Cadastramento.procuraCliente(linhaSeparada[0]), Cadastramento.procuraVeiculo(linhaSeparada[1]), Cadastramento.procuraVendedorNome(linhaSeparada[2]), Integer.parseInt(linhaSeparada[3]), Integer.parseInt(linhaSeparada[4]), Integer.parseInt(linhaSeparada[5])));
                    Cadastramento.adicionaVeiculosVendidos(Cadastramento.procuraVeiculo(linhaSeparada[1]));
                    Cadastramento.removeVeiculoDisponivel(Cadastramento.procuraVeiculo(linhaSeparada[1]));
                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        //Carregando Banco de Dados das Compras para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoCompras.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaCompraGaragem(new CompraGaragem(Cadastramento.procuraCliente(linhaSeparada[0]), Cadastramento.procuraVeiculo(linhaSeparada[1]), Integer.parseInt(linhaSeparada[2]), Integer.parseInt(linhaSeparada[3]), Integer.parseInt(linhaSeparada[4])));
            Cadastramento.adicionaVeiculoDisponivel(Cadastramento.procuraVeiculo(linhaSeparada[1]));
            
             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaCompraGaragem(new CompraGaragem(Cadastramento.procuraCliente(linhaSeparada[0]), Cadastramento.procuraVeiculo(linhaSeparada[1]), Integer.parseInt(linhaSeparada[2]), Integer.parseInt(linhaSeparada[3]), Integer.parseInt(linhaSeparada[4])));
                    Cadastramento.adicionaVeiculoDisponivel(Cadastramento.procuraVeiculo(linhaSeparada[1]));
                        
                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        caixaLogin.addItem("ADMIN");
        caixaLogin.addItem("FUNCIONÁRIO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caixaLogin = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inserirSenha = new javax.swing.JPasswordField();
        botaoEntrar1 = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("USUÁRIO");

        jLabel5.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("SENHA");

        inserirSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inserirSenhaKeyPressed(evt);
            }
        });

        botaoEntrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/programicon.png"))); // NOI18N
        botaoEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrar1ActionPerformed(evt);
            }
        });

        botaoEntrar.setBackground(new java.awt.Color(153, 0, 0));
        botaoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrar.setText("ENTRAR");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logoGaragem.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inserirSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(caixaLogin, javax.swing.GroupLayout.Alignment.LEADING, 0, 290, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(caixaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inserirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        
        String senha = new String(inserirSenha.getPassword());
        
        if(caixaLogin.getSelectedItem().toString().equalsIgnoreCase("admin")){
            if(senha.equalsIgnoreCase("admin")){
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
                MenuAdmin m = new MenuAdmin();
                m.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Revise a senha ou login.");
            }
        }
        
        
        if(caixaLogin.getSelectedItem().toString().equalsIgnoreCase("funcionário")){
            if(senha.equalsIgnoreCase("123")){
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
                MenuFuncionario n = new MenuFuncionario();
                n.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Revise a senha ou login.");
            }
        }
        

    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void inserirSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inserirSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String senha = new String(inserirSenha.getPassword());

            if(caixaLogin.getSelectedItem().toString().equalsIgnoreCase("admin")){
                if(senha.equalsIgnoreCase("admin")){
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
                    MenuAdmin m = new MenuAdmin();
                    m.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Revise a senha ou login.");
                }
            }


            if(caixaLogin.getSelectedItem().toString().equalsIgnoreCase("funcionário")){
                if(senha.equalsIgnoreCase("123")){
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso.");
                    MenuFuncionario n = new MenuFuncionario();
                    n.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Revise a senha ou login.");
                }
            }
        }
    }//GEN-LAST:event_inserirSenhaKeyPressed

    private void botaoEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrar1ActionPerformed
        ModuloExibicaoCliente m = new ModuloExibicaoCliente();
        m.setVisible(true);
    }//GEN-LAST:event_botaoEntrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("programicon.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoEntrar1;
    private javax.swing.JComboBox<String> caixaLogin;
    private javax.swing.JPasswordField inserirSenha;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
