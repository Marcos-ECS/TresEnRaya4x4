/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatroenraya;

/**
 *
 * @author Marcos Canul
 */
public class ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form ventana1
     */
    

    public ventana1() {        
        initComponents();
        JugadorUnoVictorias.setEditable(false);
        JugadorDosVictorias.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Uno = new javax.swing.JButton();
        Dos = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Cuatro = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Siete = new javax.swing.JButton();
        Ocho = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        Diez = new javax.swing.JButton();
        Once = new javax.swing.JButton();
        Doce = new javax.swing.JButton();
        Trece = new javax.swing.JButton();
        Catorce = new javax.swing.JButton();
        Quince = new javax.swing.JButton();
        Dieciseis = new javax.swing.JButton();
        ContadorTurnos = new javax.swing.JLabel();
        JugadorUnoVictorias = new javax.swing.JTextField();
        JugadorDosVictorias = new javax.swing.JTextField();
        ReiniciaM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.GridLayout(5, 4, 10, 10));

        Uno.setText("  ");
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });
        getContentPane().add(Uno);

        Dos.setText("  ");
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });
        getContentPane().add(Dos);

        Tres.setText("  ");
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });
        getContentPane().add(Tres);

        Cuatro.setText("  ");
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });
        getContentPane().add(Cuatro);

        Cinco.setText("  ");
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });
        getContentPane().add(Cinco);

        Seis.setText("  ");
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });
        getContentPane().add(Seis);

        Siete.setText("  ");
        Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteActionPerformed(evt);
            }
        });
        getContentPane().add(Siete);

        Ocho.setText("  ");
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });
        getContentPane().add(Ocho);

        Nueve.setText("  ");
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });
        getContentPane().add(Nueve);

        Diez.setText("  ");
        Diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiezActionPerformed(evt);
            }
        });
        getContentPane().add(Diez);

        Once.setText("  ");
        Once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnceActionPerformed(evt);
            }
        });
        getContentPane().add(Once);

        Doce.setText("  ");
        Doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoceActionPerformed(evt);
            }
        });
        getContentPane().add(Doce);

        Trece.setText("  ");
        Trece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreceActionPerformed(evt);
            }
        });
        getContentPane().add(Trece);

        Catorce.setText("  ");
        Catorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatorceActionPerformed(evt);
            }
        });
        getContentPane().add(Catorce);

        Quince.setText("  ");
        Quince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuinceActionPerformed(evt);
            }
        });
        getContentPane().add(Quince);

        Dieciseis.setText("  ");
        Dieciseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DieciseisActionPerformed(evt);
            }
        });
        getContentPane().add(Dieciseis);

        ContadorTurnos.setText("Turno: Jugador X");
        ContadorTurnos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ContadorTurnosInputMethodTextChanged(evt);
            }
        });
        getContentPane().add(ContadorTurnos);

        JugadorUnoVictorias.setText("Jugador X:");
        JugadorUnoVictorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorUnoVictoriasActionPerformed(evt);
            }
        });
        getContentPane().add(JugadorUnoVictorias);

        JugadorDosVictorias.setText("Jugador O:");
        JugadorDosVictorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorDosVictoriasActionPerformed(evt);
            }
        });
        getContentPane().add(JugadorDosVictorias);

        ReiniciaM.setText("Reinicia Marcador");
        ReiniciaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciaMActionPerformed(evt);
            }
        });
        getContentPane().add(ReiniciaM);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_UnoActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DosActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TresActionPerformed

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CuatroActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CincoActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SeisActionPerformed

    private void SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_SieteActionPerformed

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OchoActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_NueveActionPerformed

    private void DiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiezActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DiezActionPerformed

    private void OnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnceActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_OnceActionPerformed

    private void DoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoceActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_DoceActionPerformed

    private void TreceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreceActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_TreceActionPerformed

    private void CatorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatorceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CatorceActionPerformed

    private void QuinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuinceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_QuinceActionPerformed

    private void DieciseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DieciseisActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DieciseisActionPerformed

    private void ContadorTurnosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ContadorTurnosInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ContadorTurnosInputMethodTextChanged

    private void JugadorUnoVictoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorUnoVictoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugadorUnoVictoriasActionPerformed

    private void ReiniciaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciaMActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ReiniciaMActionPerformed

    private void JugadorDosVictoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorDosVictoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugadorDosVictoriasActionPerformed

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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Catorce;
    public javax.swing.JButton Cinco;
    public javax.swing.JLabel ContadorTurnos;
    public javax.swing.JButton Cuatro;
    public javax.swing.JButton Dieciseis;
    public javax.swing.JButton Diez;
    public javax.swing.JButton Doce;
    public javax.swing.JButton Dos;
    public javax.swing.JTextField JugadorDosVictorias;
    public javax.swing.JTextField JugadorUnoVictorias;
    public javax.swing.JButton Nueve;
    public javax.swing.JButton Ocho;
    public javax.swing.JButton Once;
    public javax.swing.JButton Quince;
    public javax.swing.JButton ReiniciaM;
    public javax.swing.JButton Seis;
    public javax.swing.JButton Siete;
    public javax.swing.JButton Trece;
    public javax.swing.JButton Tres;
    public javax.swing.JButton Uno;
    // End of variables declaration//GEN-END:variables
}