package View;

import java.awt.event.ActionListener;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }

    public String getCbRecheio(){
        return (String) recheio.getSelectedItem();
        
    }
    public String getCbQueijo(){
        return (String) queijo.getSelectedItem();
    }
    public String getCbTamanho(){
        return (String) tamanho.getSelectedItem();
    }
    
    public boolean getChOvo(){
        return ovo.isSelected();
    }
    
    public boolean getChSalada(){
        return salada.isSelected();
    }
    public boolean getChCreamcheese(){
        return creamcheese.isSelected();
    }
    public boolean getChBacon(){
        return bacon.isSelected();
    }
    
    
    
    
    public void addSalvaListener(ActionListener listenForSalvarButton){
        btnRegistrarPedido.addActionListener(listenForSalvarButton);
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegistrarPedido = new javax.swing.JButton();
        txtTamanho = new javax.swing.JLabel();
        txtQueijo = new javax.swing.JLabel();
        txtRecheio = new javax.swing.JLabel();
        recheio = new javax.swing.JComboBox<>();
        queijo = new javax.swing.JComboBox<>();
        tamanho = new javax.swing.JComboBox<>();
        txtAdicionais = new javax.swing.JLabel();
        ovo = new javax.swing.JCheckBox();
        bacon = new javax.swing.JCheckBox();
        creamcheese = new javax.swing.JCheckBox();
        salada = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setText("Lanchonete - Menu de Lanches");

        btnRegistrarPedido.setText("Realizar Pedido");

        txtTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTamanho.setText("Tamanho");

        txtQueijo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQueijo.setText("Queijo");

        txtRecheio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRecheio.setText("Recheio");

        recheio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hamburger", "Peito de Peru", "Peito de Frango" }));

        queijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chedar", "Prato", "Suíço", "Sem Queijo" }));

        tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande" }));

        txtAdicionais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAdicionais.setText("Adicionais");

        ovo.setText("Ovo");

        bacon.setText("Bacon");

        creamcheese.setText("Cream Cheese");

        salada.setText("Salada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQueijo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTamanho)
                            .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecheio)
                            .addComponent(recheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(txtAdicionais)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(ovo)
                                .addGap(46, 46, 46)
                                .addComponent(salada)
                                .addGap(18, 18, 18)
                                .addComponent(creamcheese)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bacon)
                                .addGap(0, 122, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnRegistrarPedido)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(queijo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecheio)
                    .addComponent(txtAdicionais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recheio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ovo)
                        .addComponent(bacon)
                        .addComponent(salada)
                        .addComponent(creamcheese)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(txtQueijo)
                .addGap(18, 18, 18)
                .addComponent(queijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtTamanho)
                .addGap(18, 18, 18)
                .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnRegistrarPedido)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bacon;
    private javax.swing.JButton btnRegistrarPedido;
    private javax.swing.JCheckBox creamcheese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox ovo;
    private javax.swing.JComboBox<String> queijo;
    private javax.swing.JComboBox<String> recheio;
    private javax.swing.JCheckBox salada;
    private javax.swing.JComboBox<String> tamanho;
    private javax.swing.JLabel txtAdicionais;
    private javax.swing.JLabel txtQueijo;
    private javax.swing.JLabel txtRecheio;
    private javax.swing.JLabel txtTamanho;
    // End of variables declaration//GEN-END:variables
}
