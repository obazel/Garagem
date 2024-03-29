/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import util.Cadastramento;

/**
 *
 * @author Matheus Henrick
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        setTitle("SISTEMA - CONCESSIONÁRIA");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIcon();
        
        caixaRelatorio.addItem("Vendas");
        caixaRelatorio.addItem("Compras");
        caixaRelatorio.addItem("Clientes");
        caixaRelatorio.addItem("Gerentes");
        caixaRelatorio.addItem("Vendedores");
        caixaRelatorio.addItem("Lista de Veículos Disponíveis");
        caixaRelatorio.addItem("Lista de Veículos Vendidos");
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
        caixaRelatorio = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        paneMostraRelatorio = new javax.swing.JTextPane();
        botaoGeraRelatório = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RELATÓRIO");

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("SELECIONE UMA OPÇÃO");

        caixaRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaRelatorioKeyPressed(evt);
            }
        });

        paneMostraRelatorio.setEditable(false);
        jScrollPane2.setViewportView(paneMostraRelatorio);

        botaoGeraRelatório.setBackground(new java.awt.Color(153, 0, 0));
        botaoGeraRelatório.setForeground(new java.awt.Color(255, 255, 255));
        botaoGeraRelatório.setText("GERAR");
        botaoGeraRelatório.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoGeraRelatórioMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRÉVIA");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logoGaragem.jpeg"))); // NOI18N

        botaoVoltar.setBackground(new java.awt.Color(153, 0, 0));
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(caixaRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoGeraRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoGeraRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGeraRelatórioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGeraRelatórioMouseClicked
        String s = caixaRelatorio.getSelectedItem().toString();
        if(s.equalsIgnoreCase("compras")){
            
            paneMostraRelatorio.setText(Cadastramento.mostraCompraGaragem());
        }
        if(s.equalsIgnoreCase("vendas")){
            
            paneMostraRelatorio.setText(Cadastramento.mostraVendas());
        }
        if(s.equalsIgnoreCase("vendedores")){
            
            paneMostraRelatorio.setText(Cadastramento.mostraVendedores());
        }
        if(s.equalsIgnoreCase("gerentes")){
            
            paneMostraRelatorio.setText(Cadastramento.mostraGerentes());
        }
        if(s.equalsIgnoreCase("Lista de Veículos Disponíveis")){
           
            paneMostraRelatorio.setText(Cadastramento.mostraVeiculosDisponiveis());
        }
        if(s.equalsIgnoreCase("clientes")){
           
            paneMostraRelatorio.setText(Cadastramento.mostraClientes());

        }
        if(s.equalsIgnoreCase("Lista de Veículos Vendidos")){
           
            paneMostraRelatorio.setText(Cadastramento.mostraVeiculosVendidos());
        }
        
    }//GEN-LAST:event_botaoGeraRelatórioMouseClicked

    private void caixaRelatorioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaRelatorioKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String s = caixaRelatorio.getSelectedItem().toString();
            if(s.equalsIgnoreCase("compras")){

                paneMostraRelatorio.setText(Cadastramento.mostraCompraGaragem());
            }
            if(s.equalsIgnoreCase("vendas")){

                paneMostraRelatorio.setText(Cadastramento.mostraVendas());
            }
            if(s.equalsIgnoreCase("vendedores")){

                paneMostraRelatorio.setText(Cadastramento.mostraVendedores());
            }
            if(s.equalsIgnoreCase("gerentes")){

                paneMostraRelatorio.setText(Cadastramento.mostraGerentes());
            }
            if(s.equalsIgnoreCase("Lista de Veículos Disponíveis")){

                paneMostraRelatorio.setText(Cadastramento.mostraVeiculosDisponiveis());
            }
            if(s.equalsIgnoreCase("clientes")){

                paneMostraRelatorio.setText(Cadastramento.mostraClientes());

            }
            if(s.equalsIgnoreCase("Lista de Veículos Vendidos")){

                paneMostraRelatorio.setText(Cadastramento.mostraVeiculosVendidos());
            }
        }
    }//GEN-LAST:event_caixaRelatorioKeyPressed

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_botaoVoltarMouseClicked

     private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("programicon.png")));
    }
     
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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGeraRelatório;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> caixaRelatorio;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane paneMostraRelatorio;
    // End of variables declaration//GEN-END:variables
}
