/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Sojinha Kawaii
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
    }
    Calculator c = new Calculator();
    // instancia a classe calculator com nome 'c'
    // eu renomeei todos os botoes e nomes de campo do meu jeito
    // mude os nomes ao seu gosto dps
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoY = new javax.swing.JTextField();
        campoX = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        campoZ = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/profile_picture_by_kmiluanime-d70o07i.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoYActionPerformed(evt);
            }
        });
        getContentPane().add(campoY, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 59, -1));

        campoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoXActionPerformed(evt);
            }
        });
        getContentPane().add(campoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, -1));

        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtrair, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 41, -1));

        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 41, -1));

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 41, -1));

        campoZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoZActionPerformed(evt);
            }
        });
        getContentPane().add(campoZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 70, -1));

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        double x, y;//cria uma variavel local de x e y
        //pega os valores do campo de texto e insere na variavel
        x = Double.valueOf(campoX.getText()); 
        y = Double.valueOf(campoY.getText());
        // .valueOf() é pq o campo usa string, entao aq ele converte para 
        // float/double
        c.Soma(x, y);
        // executa o metodo/função
        campoZ.setText(String.valueOf(c.z));
        // coloca no campo resultado o valor de 'z' retornado
        // aq usa o String.valueOf pois é um double/float, entao assim ele 
        // converte para string
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        double x, y;//cria uma variavel local de x e y
        //pega os valores do campo de texto e insere na variavel
        x = Double.valueOf(campoX.getText()); 
        y = Double.valueOf(campoY.getText());
        // .valueOf() é pq o campo usa string, entao aq ele converte para 
        // float/double
        c.Subtracao(x, y); // é só repetir td e mudar o nome do metodo ^^
        // executa o metodo/função
        campoZ.setText(String.valueOf(c.z));
        // coloca no campo resultado o valor de 'z' retornado
        // aq usa o String.valueOf pois é um double/float, entao assim ele 
        // converte para string
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        double x, y;//cria uma variavel local de x e y
        //pega os valores do campo de texto e insere na variavel
        x = Double.valueOf(campoX.getText()); 
        y = Double.valueOf(campoY.getText());
        // .valueOf() é pq o campo usa string, entao aq ele converte para 
        // float/double
        c.Multiplicacao(x, y);
        // executa o metodo/função
        campoZ.setText(String.valueOf(c.z));
        // coloca no campo resultado o valor de 'z' retornado
        // aq usa o String.valueOf pois é um double/float, entao assim ele 
        // converte para string
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        double x, y;//cria uma variavel local de x e y
        //pega os valores do campo de texto e insere na variavel
        x = Double.valueOf(campoX.getText()); 
        y = Double.valueOf(campoY.getText());
        // .valueOf() é pq o campo usa string, entao aq ele converte para 
        // float/double
        c.Divisao(x, y);
        // executa o metodo/função
        campoZ.setText(String.valueOf(c.z));
        // coloca no campo resultado o valor de 'z' retornado
        // aq usa o String.valueOf pois é um double/float, entao assim ele 
        // converte para string
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void campoYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoYActionPerformed

    private void campoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoXActionPerformed

    private void campoZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoZActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    campoX.setText("");
    campoZ.setText("");
    campoY.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JTextField campoX;
    private javax.swing.JTextField campoY;
    private javax.swing.JTextField campoZ;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
