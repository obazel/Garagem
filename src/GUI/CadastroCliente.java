/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Toolkit;
import model.Cliente;
import util.Cadastramento;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Henrick
 */
public class CadastroCliente extends javax.swing.JFrame{

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        
        initComponents();
        setTitle("SISTEMA - CONCESSIONÁRIA");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIcon();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoesSexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelCadastraCliente = new javax.swing.JPanel();
        inserirNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inserirID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        selecionaDia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        selecionaMes = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        selecionaAno = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        inserirEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selecionaMasc = new javax.swing.JRadioButton();
        selecionaFem = new javax.swing.JRadioButton();
        inserirTelefone = new javax.swing.JFormattedTextField();
        inserirCPF = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelCadastraCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastraCliente.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CADASTRO DE CLIENTE");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("CPF");

        jLabel6.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("ID");

        jLabel3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Data de Nascimento");

        botaoCadastrar.setBackground(new java.awt.Color(153, 0, 0));
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicarBotaoCadastrar(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Dia");

        selecionaDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel12.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Mês");

        selecionaMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" }));

        jLabel13.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Ano");

        selecionaAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919" }));

        jLabel9.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Endereço");

        jLabel7.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Telefone");

        jLabel8.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Sexo");

        botoesSexo.add(selecionaMasc);
        selecionaMasc.setText("Masculino");

        botoesSexo.add(selecionaFem);
        selecionaFem.setText("Feminino");

        try {
            inserirTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inserirCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inserirCPF.setMinimumSize(new java.awt.Dimension(7, 21));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logoGaragem.jpeg"))); // NOI18N

        javax.swing.GroupLayout painelCadastraClienteLayout = new javax.swing.GroupLayout(painelCadastraCliente);
        painelCadastraCliente.setLayout(painelCadastraClienteLayout);
        painelCadastraClienteLayout.setHorizontalGroup(
            painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inserirTelefone)
                            .addComponent(inserirEndereco)
                            .addComponent(inserirID)
                            .addComponent(inserirNome)
                            .addComponent(inserirCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                                .addGroup(painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecionaMasc)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecionaFem))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecionaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecionaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecionaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastraClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addComponent(jLabel14)
        );
        painelCadastraClienteLayout.setVerticalGroup(
            painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastraClienteLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaMasc)
                    .addComponent(selecionaFem)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastraCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("programicon.png")));
    }
    
    private void clicarBotaoCadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicarBotaoCadastrar

        if(selecionaMasc.isSelected()){
            Cadastramento.adicionaCliente(new Cliente(Integer.parseInt(inserirID.getText()), inserirNome.getText(), inserirCPF.getText(), "Masculino", inserirEndereco.getText(), inserirTelefone.getText(), Integer.parseInt(selecionaDia.getSelectedItem().toString()), (selecionaMes.getSelectedIndex() + 1), Integer.parseInt(selecionaAno.getSelectedItem().toString())));
            
            //Gravando cliente no banco de dados
            try {
                FileWriter arquivo = new FileWriter("BancoClientes.txt", true);
                PrintWriter gravar = new PrintWriter(arquivo);
                
                gravar.printf(inserirID.getText() + ";" +  inserirNome.getText() + ";" +  inserirCPF.getText() + ";" +  "Masculino" + ";" +  inserirEndereco.getText() + ";" + inserirTelefone.getText() + ";" + selecionaDia.getSelectedItem().toString() + ";" + (selecionaMes.getSelectedIndex()+1) + ";" + selecionaAno.getSelectedItem().toString() + "%n");
                
                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "ERRO");
            }
            
        }
        dispose();
        if(selecionaFem.isSelected()){
            Cadastramento.adicionaCliente(new Cliente(Integer.parseInt(inserirID.getText()), inserirNome.getText(), inserirCPF.getText(), "Feminino", inserirEndereco.getText(), inserirTelefone.getText(), Integer.parseInt(selecionaDia.getSelectedItem().toString()), (selecionaMes.getSelectedIndex() + 1), Integer.parseInt(selecionaAno.getSelectedItem().toString())));
            
            try {
                FileWriter arquivo = new FileWriter("BancoClientes.txt", true);
                PrintWriter gravar = new PrintWriter(arquivo);
                
                gravar.printf(inserirID.getText() + ";" +  inserirNome.getText() + ";" +  inserirCPF.getText() + ";" +  "Feminino" + ";" +  inserirEndereco.getText() + ";" + inserirTelefone.getText() + ";" + selecionaDia.getSelectedItem().toString() + ";" + (selecionaMes.getSelectedIndex()+1) + ";" + selecionaAno.getSelectedItem().toString() + "%n");
                
                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "ERRO");
            }
        } 
             
        dispose();
    }//GEN-LAST:event_clicarBotaoCadastrar

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.ButtonGroup botoesSexo;
    private javax.swing.JFormattedTextField inserirCPF;
    private javax.swing.JTextField inserirEndereco;
    private javax.swing.JTextField inserirID;
    private javax.swing.JTextField inserirNome;
    private javax.swing.JFormattedTextField inserirTelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painelCadastraCliente;
    private javax.swing.JComboBox<String> selecionaAno;
    private javax.swing.JComboBox<String> selecionaDia;
    private javax.swing.JRadioButton selecionaFem;
    private javax.swing.JRadioButton selecionaMasc;
    private javax.swing.JComboBox<String> selecionaMes;
    // End of variables declaration//GEN-END:variables
}
