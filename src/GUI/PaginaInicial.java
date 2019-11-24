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
        setTitle("GARAGEM");
        setLocationRelativeTo(null);
        setIcon();
        
        //Carregando Banco de Dados dos Clientes para o programa
        try {
            
            FileReader arquivo = new FileReader("BancoClientes.txt");
            BufferedReader lerArq = new BufferedReader(arquivo);

            String linha = lerArq.readLine(); 
            String linhaSeparada[] = linha.split(";");
            Cadastramento.adicionaCliente(new Cliente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], linhaSeparada[6]));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaCliente(new Cliente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], linhaSeparada[6]));

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
            Cadastramento.adicionaVeiculoDisponivel(Cadastramento.adicionaVeiculo(new Veiculo(linhaSeparada[0], Double.parseDouble(linhaSeparada[1]), linhaSeparada[2], new Modelo(Integer.parseInt(linhaSeparada[3]), linhaSeparada[4], new Marca(linhaSeparada[5])))));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaVeiculoDisponivel(Cadastramento.adicionaVeiculo(new Veiculo(linhaSeparada[0], Double.parseDouble(linhaSeparada[1]), linhaSeparada[2], new Modelo(Integer.parseInt(linhaSeparada[3]), linhaSeparada[4], new Marca(linhaSeparada[5])))));

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
            Cadastramento.adicionaGerente(new Gerente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], linhaSeparada[6]));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaGerente(new Gerente(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], linhaSeparada[6]));

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
            Cadastramento.adicionaVendedor(new Vendedor(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], linhaSeparada[6]));

             while (linha != null) {
                linha = lerArq.readLine(); 

                if(linha != null){

                    linhaSeparada = linha.split(";");
                    Cadastramento.adicionaVendedor(new Vendedor(Integer.parseInt(linhaSeparada[0]), linhaSeparada[1], linhaSeparada[2], linhaSeparada[3], linhaSeparada[4], linhaSeparada[5], linhaSeparada[6]));

                }
              }
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de carregamento de dados.");
        }
        
        caixaLogin.addItem("Admin");
        caixaLogin.addItem("Funcionário");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inserirSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        caixaLogin = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GARAGEM");

        jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        inserirSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inserirSenhaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setText("Login");

        jLabel5.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel5.setText("Senha");

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaLogin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inserirSenha)
                    .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(inserirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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
    private javax.swing.JComboBox<String> caixaLogin;
    private javax.swing.JPasswordField inserirSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
