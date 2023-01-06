
package calculaTudo;

import javax.swing.JOptionPane;


public class FormaPlanaQuadrado extends javax.swing.JInternalFrame {

    
    public FormaPlanaQuadrado() {
        initComponents();
        
    }
    
    
     private void Calculo(){
            
        float resultado = Float.parseFloat(txtLado.getText()) * Float.parseFloat(txtLado.getText());
        txtResultado.setText(String.valueOf(resultado)); 
        
    }
     private void Perimetro(){
         float lado = Float.parseFloat(txtLado.getText());
         float perimetro = lado*4;
         txtPerimetro.setText(String.valueOf(perimetro));
     }
     private void Limpar(){
         txtLado.setText("");
         txtResultado.setText("");
         txtPerimetro.setText("");
         
        lblBase.setText("a");
        lblAltura.setText("a");
        lblArea.setText("A");
     }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnLimpar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblAltura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblArea = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBase = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeactivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 520, 20));

        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Lado=");

        txtLado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, 70));
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 170, 80, -1));

        jLabel4.setText("Área=");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAltura.setText("a");
        jPanel3.add(lblAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 60));

        jLabel1.setText("A= a x a");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 50, -1));

        jLabel2.setText("A= a²");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 50, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, 20));

        jPanel1.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArea.setBackground(new java.awt.Color(204, 51, 255));
        lblArea.setForeground(new java.awt.Color(51, 51, 51));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setText("A");
        jPanel1.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Quadrado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 20, -1, -1));

        lblBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBase.setText("a");
        jPanel1.add(lblBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 100, 205, 10));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, 90, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 120));

        jLabel7.setText("Perimetro=");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 30));
        getContentPane().add(txtPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 80, -1));

        setBounds(0, 0, 620, 436);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoKeyReleased
        // TODO add your handling code here:
        lblBase.setText(String.valueOf(txtLado.getText()));
        lblAltura.setText(String.valueOf(txtLado.getText()));
        
        Calculo();
        Perimetro();
        lblArea.setText(String.valueOf(txtResultado.getText()));
        
        

    }//GEN-LAST:event_txtLadoKeyReleased

    private void txtLadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoKeyTyped
       String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
       
        }
    }//GEN-LAST:event_txtLadoKeyTyped

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formFocusLost

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formInternalFrameDeactivated

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBase;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
