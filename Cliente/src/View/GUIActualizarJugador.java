/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Futbolista;
import Model.IServicios;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class GUIActualizarJugador extends javax.swing.JFrame implements IVentanas{

  private IServicios sj;
     private GUIPrincipal p;
     private String cedula;
     
   public GUIActualizarJugador(IServicios s) {
        initComponents();
        sj = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtPosicion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDorsal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Jugador");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);

        txtEstatura.setEnabled(false);

        txtPosicion.setEnabled(false);

        jLabel6.setText("Dorsal");

        jLabel3.setText("Estatura");

        btnAgregar.setText("Actualizar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel1.setText("Cedula");

        jLabel4.setText("Posicion");

        txtDorsal.setEnabled(false);

        jLabel5.setText("Fecha de Nacimiento");

        txtPeso.setEnabled(false);

        jLabel7.setText("Peso");

        jXDatePicker1.setEnabled(false);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem2.setText("Acerca de ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPeso)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(txtDorsal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAgregar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(this, "Desarrollado por:"+"\n"+"Juan Pablo rodriguez"+"\n"+"William Bueno");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
          cedula = txtCedula.getText();
          if(cedula.isEmpty()){
              JOptionPane.showMessageDialog(this, "Por favor ingrese una cedula");
              return;
          }
          Futbolista f = sj.buscar(cedula);
          if(f == null){
              System.out.println("No se halló al Futbolista");
              txtDorsal.setText("");
              txtEstatura.setText("");
              jXDatePicker1.setDate(null);
              txtPosicion.setText("");
              txtNombre.setText("");
              txtPeso.setText("");
              return;
          }
          txtDorsal.setText(f.getDorsal()+"");
          txtDorsal.setEnabled(true);
          txtEstatura.setText(f.getEstatura()+"");
          txtEstatura.setEnabled(true);
          jXDatePicker1.setDate(f.getFechaNacimiento());
          jXDatePicker1.setEnabled(true);
          txtPosicion.setText(f.getPosicion());
          txtPosicion.setEnabled(true);
          txtNombre.setText(f.getNombre());
          txtNombre.setEnabled(true);
          txtPeso.setText(f.getPeso()+"");
          txtPeso.setEnabled(true);
          btnAgregar.setEnabled(true);
      } catch (RemoteException ex) {
          Logger.getLogger(GUIActualizarJugador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String posicion = txtPosicion.getText();
        if(cedula.isEmpty() || nombre.isEmpty() || posicion.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos");
            return;
        }try{
            double estatura = Double.parseDouble(txtEstatura.getText());
            double peso = Double.parseDouble(txtPeso.getText());
            int dorsal = Integer.parseInt(txtDorsal.getText());
            java.util.Date fechaNacimiento = jXDatePicker1.getDate();
            java.sql.Date fechaSQL = new java.sql.Date(fechaNacimiento.getTime());
            sj.actualizar(new Futbolista(cedula, nombre, estatura, posicion, fechaSQL, dorsal, peso));
        btnAgregar.setEnabled(false);
        txtPeso.setEnabled(false);
        txtDorsal.setEnabled(false);
        txtEstatura.setEnabled(false);
        jXDatePicker1.setEnabled(false);
        txtPosicion.setEnabled(false);
        txtNombre.setEnabled(false);
        cedula="";
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos de manera correcta");
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDorsal;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ActualizarJugador() {
        if(txtCedula.getText().isEmpty()) return;
        this.jButton1ActionPerformed(null);
    }
}
