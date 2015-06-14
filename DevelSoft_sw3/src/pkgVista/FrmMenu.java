/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import pkgControlador.Auto;
import pkgControlador.Control;

/**
 *
 * @author Marcela
 */
public class FrmMenu extends javax.swing.JFrame {

    Control controlRec;
    LinkedList<String> servicios;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        controlRec = new Control();

        checkFrenos.setLabel("Revisión de frenos");
        checkaceite.setLabel("Cambio de aceite");
        checkalineacion.setLabel("Alineación");
        checkbalanceo.setLabel("Balanceo");

        checkmotor.setLabel("Reparación de motor");
        checkelectrico.setLabel("Revusión y reparación del sistema eléctrico");
    }

    public String getComboAreas() {
        return cmbAreas.getToolTipText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbAreas = new javax.swing.JComboBox();
        txtplaca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtcolor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkFrenos = new java.awt.Checkbox();
        checkaceite = new java.awt.Checkbox();
        checkalineacion = new java.awt.Checkbox();
        checkbalanceo = new java.awt.Checkbox();
        checkmotor = new java.awt.Checkbox();
        checkelectrico = new java.awt.Checkbox();
        lblServiciosGeneral = new javax.swing.JLabel();
        lblServicosEspecializada = new javax.swing.JLabel();
        btnguardar = new javax.swing.JToggleButton();
        lblContenedorInfo = new javax.swing.JLabel();
        lblPintura = new javax.swing.JLabel();
        lblfrenos = new javax.swing.JLabel();
        lblaceite = new javax.swing.JLabel();
        lblalineacion = new javax.swing.JLabel();
        lblbalanceo = new javax.swing.JLabel();
        lblAreaGeneral = new javax.swing.JLabel();
        lblAreapintura = new javax.swing.JLabel();
        lblmotor = new javax.swing.JLabel();
        lblelectrico = new javax.swing.JLabel();
        lblAreaEspecializada = new javax.swing.JLabel();
        lblcaja = new javax.swing.JLabel();
        lblsalida = new javax.swing.JLabel();
        lblRecaudoysalida = new javax.swing.JLabel();
        lblContenedorTaller = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenu_programa = new javax.swing.JMenu();
        item_salir = new javax.swing.JMenuItem();
        jmenuatender = new javax.swing.JMenu();
        item_pintura = new javax.swing.JMenuItem();
        item_general = new javax.swing.JMenuItem();
        item_especializada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        cmbAreas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Areas taller", "Pintura", "Mecanica General", "Mecanica Especializada" }));
        cmbAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAreasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAreas);
        cmbAreas.setBounds(10, 240, 170, 20);

        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        getContentPane().add(txtplaca);
        txtplaca.setBounds(70, 150, 110, 20);
        getContentPane().add(txtmodelo);
        txtmodelo.setBounds(70, 180, 110, 20);

        txtcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorActionPerformed(evt);
            }
        });
        getContentPane().add(txtcolor);
        txtcolor.setBounds(70, 210, 110, 20);

        jLabel1.setText("Placa:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 150, 29, 14);

        jLabel2.setText("Modelo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 38, 14);

        jLabel3.setText("Color:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 210, 29, 14);

        jLabel4.setText("                      Servicios  Area escogida");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 360, 300, 20);

        checkFrenos.setLabel("checkbox1");
        getContentPane().add(checkFrenos);
        checkFrenos.setBounds(20, 430, 84, 20);

        checkaceite.setLabel("checkbox2");
        getContentPane().add(checkaceite);
        checkaceite.setBounds(20, 450, 84, 20);

        checkalineacion.setLabel("checkbox3");
        getContentPane().add(checkalineacion);
        checkalineacion.setBounds(20, 470, 84, 20);

        checkbalanceo.setLabel("checkbox4");
        getContentPane().add(checkbalanceo);
        checkbalanceo.setBounds(20, 490, 84, 20);

        checkmotor.setLabel("checkbox1");
        getContentPane().add(checkmotor);
        checkmotor.setBounds(210, 430, 84, 20);

        checkelectrico.setLabel("checkbox3");
        getContentPane().add(checkelectrico);
        checkelectrico.setBounds(210, 450, 84, 20);

        lblServiciosGeneral.setText("Mecanica General");
        lblServiciosGeneral.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblServiciosGeneral);
        lblServiciosGeneral.setBounds(20, 400, 180, 150);

        lblServicosEspecializada.setText("Mecanica Especializada");
        lblServicosEspecializada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblServicosEspecializada);
        lblServicosEspecializada.setBounds(210, 400, 150, 150);

        btnguardar.setText("Guardar Cliente");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(20, 560, 107, 23);

        lblContenedorInfo.setText("Informacion Servicio y Automovil");
        lblContenedorInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblContenedorInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 3, true));
        getContentPane().add(lblContenedorInfo);
        lblContenedorInfo.setBounds(0, 110, 490, 500);

        lblPintura.setText("Pintura");
        lblPintura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        lblPintura.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblPintura);
        lblPintura.setBounds(540, 180, 50, 90);

        lblfrenos.setText("Servicio Revisión de frenos");
        lblfrenos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblfrenos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        getContentPane().add(lblfrenos);
        lblfrenos.setBounds(690, 160, 120, 60);

        lblaceite.setText("Servicio Cambio de aceite");
        lblaceite.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblaceite.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 3, true));
        getContentPane().add(lblaceite);
        lblaceite.setBounds(690, 250, 120, 60);

        lblalineacion.setText("Servicio Alineacion");
        lblalineacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblalineacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));
        getContentPane().add(lblalineacion);
        lblalineacion.setBounds(870, 160, 120, 60);

        lblbalanceo.setText("Servicio Balanceo");
        lblbalanceo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblbalanceo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 3, true));
        getContentPane().add(lblbalanceo);
        lblbalanceo.setBounds(870, 250, 120, 60);

        lblAreaGeneral.setText("Area de Mecanica General");
        lblAreaGeneral.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAreaGeneral.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblAreaGeneral);
        lblAreaGeneral.setBounds(670, 140, 340, 210);

        lblAreapintura.setText("Area Pintura");
        lblAreapintura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAreapintura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblAreapintura);
        lblAreapintura.setBounds(520, 140, 110, 210);

        lblmotor.setText("Servicio Reparacion de motor");
        lblmotor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblmotor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        getContentPane().add(lblmotor);
        lblmotor.setBounds(1060, 160, 250, 70);

        lblelectrico.setText("Servicio Revisión y reparacion del sistema eléctrico");
        lblelectrico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblelectrico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        getContentPane().add(lblelectrico);
        lblelectrico.setBounds(1060, 250, 250, 70);

        lblAreaEspecializada.setText("Area Mecanica Especializada");
        lblAreaEspecializada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAreaEspecializada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblAreaEspecializada);
        lblAreaEspecializada.setBounds(1040, 140, 280, 210);

        lblcaja.setText("Caja");
        lblcaja.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 3, true));
        getContentPane().add(lblcaja);
        lblcaja.setBounds(780, 430, 90, 110);

        lblsalida.setText("Salida Taller");
        lblsalida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        getContentPane().add(lblsalida);
        lblsalida.setBounds(1200, 430, 100, 110);

        lblRecaudoysalida.setText("Recaudo                                                                                                                                                                  Salida Automovil");
        lblRecaudoysalida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblRecaudoysalida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(lblRecaudoysalida);
        lblRecaudoysalida.setBounds(530, 420, 790, 130);

        lblContenedorTaller.setText("Taller de mecanica y pintura ");
        lblContenedorTaller.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblContenedorTaller.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 3, true));
        getContentPane().add(lblContenedorTaller);
        lblContenedorTaller.setBounds(500, 110, 840, 500);

        jmenu_programa.setText("Programa");

        item_salir.setText("Cerrar");
        jmenu_programa.add(item_salir);

        jMenuBar1.add(jmenu_programa);

        jmenuatender.setText("Animar");

        item_pintura.setText("Pintura");
        jmenuatender.add(item_pintura);

        item_general.setText("Mecanica General");
        jmenuatender.add(item_general);

        item_especializada.setText("Mecanica Especializada");
        item_especializada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_especializadaActionPerformed(evt);
            }
        });
        jmenuatender.add(item_especializada);

        jMenuBar1.add(jmenuatender);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolorActionPerformed

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        int area = cmbAreas.getSelectedIndex();
        if (area == 2) {

            if (checkFrenos.getState()) {
                servicios.add(checkFrenos.getLabel().toString());
            }
            if (checkaceite.getState()) {
                servicios.add(checkaceite.getLabel().toString());
            }
            if (checkbalanceo.getState()) {
                servicios.add(checkbalanceo.getLabel().toString());
            }
            if (checkalineacion.getState()) {
                servicios.add(checkalineacion.getLabel().toString());
            }

        }
        if (area == 3) {
            if (checkmotor.getState()) {
                servicios.add(checkmotor.getLabel().toString());
            }
            if (checkelectrico.getState()) {
                servicios.add(checkelectrico.getLabel().toString());
            }
        }

        controlRec.recepcionAutos(txtplaca.getText(), txtmodelo.getText(), txtcolor.getText(), servicios, area);
        JOptionPane.showMessageDialog(this, "Se registro correctamente el auto en el area de " + cmbAreas.getSelectedItem());
    }//GEN-LAST:event_btnguardarActionPerformed

    private void cmbAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAreasActionPerformed

        if (cmbAreas.getSelectedIndex() == 0) {
            
            JOptionPane.showMessageDialog(this, "Aviso: Debe escojer un area valida");
            
        } else if (cmbAreas.getSelectedIndex() == 1) {
            
            checkFrenos.setEnabled(false);
            checkaceite.setEnabled(false);
            checkalineacion.setEnabled(false);
            checkbalanceo.setEnabled(false);
            checkmotor.setEnabled(false);
            checkelectrico.setEnabled(false);
            
        } else if (cmbAreas.getSelectedIndex() == 2) {
            
            checkFrenos.setEnabled(true);
            checkaceite.setEnabled(true);
            checkalineacion.setEnabled(true);
            checkbalanceo.setEnabled(true);
            checkmotor.setEnabled(false);
            checkelectrico.setEnabled(false);
            
        } else if (cmbAreas.getSelectedIndex() == 3) {
            checkmotor.setEnabled(true);
            checkelectrico.setEnabled(true);
            checkFrenos.setEnabled(false);
            checkaceite.setEnabled(false);
            checkalineacion.setEnabled(false);
            checkbalanceo.setEnabled(false);
        }
    }//GEN-LAST:event_cmbAreasActionPerformed

    private void item_especializadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_especializadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_especializadaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnguardar;
    private java.awt.Checkbox checkFrenos;
    private java.awt.Checkbox checkaceite;
    private java.awt.Checkbox checkalineacion;
    private java.awt.Checkbox checkbalanceo;
    private java.awt.Checkbox checkelectrico;
    private java.awt.Checkbox checkmotor;
    private javax.swing.JComboBox cmbAreas;
    private javax.swing.JMenuItem item_especializada;
    private javax.swing.JMenuItem item_general;
    private javax.swing.JMenuItem item_pintura;
    private javax.swing.JMenuItem item_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmenu_programa;
    private javax.swing.JMenu jmenuatender;
    private javax.swing.JLabel lblAreaEspecializada;
    private javax.swing.JLabel lblAreaGeneral;
    private javax.swing.JLabel lblAreapintura;
    private javax.swing.JLabel lblContenedorInfo;
    private javax.swing.JLabel lblContenedorTaller;
    private javax.swing.JLabel lblPintura;
    private javax.swing.JLabel lblRecaudoysalida;
    private javax.swing.JLabel lblServiciosGeneral;
    private javax.swing.JLabel lblServicosEspecializada;
    private javax.swing.JLabel lblaceite;
    private javax.swing.JLabel lblalineacion;
    private javax.swing.JLabel lblbalanceo;
    private javax.swing.JLabel lblcaja;
    private javax.swing.JLabel lblelectrico;
    private javax.swing.JLabel lblfrenos;
    private javax.swing.JLabel lblmotor;
    private javax.swing.JLabel lblsalida;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}
