/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Recepcionista;

import Comportamientos.IngresoRecepcionistas;
import clases.Recepcionista;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Crud_Recepcionista extends javax.swing.JFrame {

    /**
     * Creates new form Crud_Recepcionista
     */
    String edadrecep = "", titulorecep = "", generorecep = "";
    
    Recepcionista recep = new Recepcionista();
    IngresoRecepcionistas acrecep = new IngresoRecepcionistas();
    public Crud_Recepcionista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoGeneroRecep = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TxtNombreRep = new javax.swing.JTextField();
        TxtTelefonoRep = new javax.swing.JTextField();
        TxtDireccionRep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtApellidoRep = new javax.swing.JTextField();
        TxtCedulaRep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboTipoSangreRep = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        SpinerEdadRep = new javax.swing.JSpinner();
        RadioBtnMasculino = new javax.swing.JRadioButton();
        RadioBtnFemenino = new javax.swing.JRadioButton();
        RadioBtnNoDefinido = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtIdRecepcionista = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ComboTituloRep = new javax.swing.JComboBox<>();
        BtnGuardarRep = new javax.swing.JButton();
        BtnVRegistrosRecep = new javax.swing.JButton();
        DateRecepcionista = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRecepcionistas = new javax.swing.JTable();
        BtnSalirCrudDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("CRUD DE RECEPCIONISTA");

        jLabel1.setText("Cedula: ");

        jLabel2.setText("Apellido: ");

        jLabel4.setText("Nombre: ");

        jLabel5.setText("Fecha de nacimiento: ");

        jLabel6.setText("Telefono: ");

        jLabel7.setText("Direccion: ");

        jLabel8.setText("Tipo de sangre: ");

        ComboTipoSangreRep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        ComboTipoSangreRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoSangreRepActionPerformed(evt);
            }
        });

        jLabel9.setText("Edad: ");

        SpinerEdadRep.setModel(new javax.swing.SpinnerNumberModel(30, 30, 70, 1));

        GrupoGeneroRecep.add(RadioBtnMasculino);
        RadioBtnMasculino.setText("Masculino");

        GrupoGeneroRecep.add(RadioBtnFemenino);
        RadioBtnFemenino.setText("Femenino");

        GrupoGeneroRecep.add(RadioBtnNoDefinido);
        RadioBtnNoDefinido.setText("No definido");

        jLabel10.setText("Genero: ");

        jLabel12.setText("Id Recepcionista: ");

        jLabel14.setText("Titulo");

        ComboTituloRep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Alergología", "Anestesiología", "Angiología", "Cardiología", "Endocrinología", "Estomatología", "Gastroenterología", "Genética", "Geriatría", "Hematología", "Hepatología", "Infectología", "Medicina aeroespacial", "Medicina del deporte", "Medicina familiar y comunitaria", "Medicina física y rehabilitación", "Medicina forense", "Medicina intensiva", "Medicina interna", "Medicina preventiva y salud pública", "Medicina del trabajo", "Nefrología", "Neumología", "Neurología", "Nutriología", "Oncología médica", "Oncología radioterápica", "Pediatría", "Psiquiatría", "Reumatología", "Toxicología", " " }));

        BtnGuardarRep.setText("Guardar");
        BtnGuardarRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarRepActionPerformed(evt);
            }
        });

        BtnVRegistrosRecep.setText("Ver registros");
        BtnVRegistrosRecep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVRegistrosRecepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCedulaRep, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(79, 79, 79)
                            .addComponent(TxtApellidoRep, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addComponent(TxtNombreRep, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIdRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(TxtDireccionRep, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(TxtTelefonoRep, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(DateRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboTipoSangreRep, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinerEdadRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboTituloRep, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioBtnMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(RadioBtnFemenino)
                                .addGap(18, 18, 18)
                                .addComponent(RadioBtnNoDefinido))))
                    .addComponent(BtnGuardarRep)
                    .addComponent(BtnVRegistrosRecep))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TxtCedulaRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(SpinerEdadRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ComboTipoSangreRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(RadioBtnMasculino)
                    .addComponent(RadioBtnFemenino)
                    .addComponent(RadioBtnNoDefinido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel14)
                        .addComponent(ComboTituloRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefonoRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(BtnGuardarRep))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDireccionRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVRegistrosRecep))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtIdRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        TablaRecepcionistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Apellido", "Nombre", "Fecha de nacimiento", "Telefono", "Direccion", "ID", "Edad", "Tipo Sangre", "Genero", "Titulo"
            }
        ));
        jScrollPane1.setViewportView(TablaRecepcionistas);

        BtnSalirCrudDoc.setText("Salir");
        BtnSalirCrudDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirCrudDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 622, Short.MAX_VALUE)
                        .addComponent(BtnSalirCrudDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnSalirCrudDoc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTipoSangreRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoSangreRepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoSangreRepActionPerformed

    private void BtnGuardarRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarRepActionPerformed

        if (!(TxtCedulaRep.getText().equals("") || TxtApellidoRep.getText().equals("") || TxtNombreRep.getText().equals("") || TxtTelefonoRep.getText().equals("") || TxtDireccionRep.getText().equals("") || TxtIdRecepcionista.getText().equals("") || ComboTipoSangreRep.getSelectedItem().equals("Seleccione") || GrupoGeneroRecep.isSelected(null) || ComboTituloRep.getSelectedItem().equals("Seleccione"))) {
            genero_recepcionista();
            mostrar_edadRecep();
            registrarRecepcionista();
            limpiar_datosRecepcionistas();
            vertablaRecepcionistas();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor asegúrese que este llenado todos los campos solicitados del recepcionista.");

        }
    }//GEN-LAST:event_BtnGuardarRepActionPerformed

    private void BtnVRegistrosRecepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVRegistrosRecepActionPerformed
        // TODO add your handling code here:
        vertablaRecepcionistas();
    }//GEN-LAST:event_BtnVRegistrosRecepActionPerformed

    private void BtnSalirCrudDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirCrudDocActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas salir del crud de doctor.", "Confirma", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            Menu_Recepcionista mrr = new Menu_Recepcionista();
            mrr.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesión cancelada.");
        }
    }//GEN-LAST:event_BtnSalirCrudDocActionPerformed

    public void registrarRecepcionista() {
        String cedula = TxtCedulaRep.getText();
        String apellido = TxtApellidoRep.getText();
        String nombre = TxtNombreRep.getText();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fnacimiento = formatoFecha.format(DateRecepcionista.getDate());
        String telefono = TxtTelefonoRep.getText();
        String direccion = TxtDireccionRep.getText();
        String id_r = TxtIdRecepcionista.getText();
        int edad = Integer.parseInt(edadrecep);
        String tipo_sangre = ComboTipoSangreRep.getSelectedItem().toString();
        String genero = generorecep;
        String titulo = ComboTituloRep.getSelectedItem().toString();

        if (cedula.isEmpty() || apellido.isEmpty() || nombre.isEmpty() || fnacimiento.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || id_r.isEmpty() || edad <= 0 || tipo_sangre.isEmpty() || genero.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor valide los datos a enviar a la Base de Datos");
        } else {
            Recepcionista recepc = new Recepcionista();
            recepc.setCedula(cedula);
            recepc.setApellido(apellido);
            recepc.setNombre(nombre);
            recepc.setFecha_nacimiento(fnacimiento);
            recepc.setTelefono(telefono);
            recepc.setDireccion(direccion);
            recepc.setId(id_r);
            recepc.setEdad(edad);
            recepc.setTipo_sangre(tipo_sangre);
            recepc.setGenero(genero);
            recepc.setTitulo(titulo);
            if (acrecep.InsertarRecepcionista(recepc)) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito...");
              //  vertablaDoctores();
            }
        }
    }
    public void mostrar_edadRecep() {
        edadrecep = SpinerEdadRep.getValue().toString();
    }
    
    public void genero_recepcionista() {
        GrupoGeneroRecep.add(RadioBtnMasculino);
        GrupoGeneroRecep.add(RadioBtnFemenino);
        GrupoGeneroRecep.add(RadioBtnNoDefinido);
        if (RadioBtnMasculino.isSelected()) {
            generorecep = "Masculino";
        }
        if (RadioBtnFemenino.isSelected()) {
            generorecep = "Femenino";
        }
        if (RadioBtnNoDefinido.isSelected()) {
            generorecep = "No definido";
        }
    }
    
    public void vertablaRecepcionistas() {
        DefaultTableModel modelo = (DefaultTableModel) TablaRecepcionistas.getModel();
        modelo.setRowCount(0);
        List<Recepcionista> listaRecepcionista = acrecep.listarDatos();
        for (Recepcionista dato : listaRecepcionista) {
            Vector recepcio = new Vector();

            recepcio.add(dato.getCedula());
            recepcio.add(dato.getApellido());
            recepcio.add(dato.getNombre());
            recepcio.add(dato.getFecha_nacimiento());
            recepcio.add(dato.getTelefono());
            recepcio.add(dato.getDireccion());
            recepcio.add(dato.getId());
            recepcio.add(dato.getEdad());
            recepcio.add(dato.getTipo_sangre());
            recepcio.add(dato.getGenero());
            recepcio.add(dato.getTitulo());

            modelo.addRow(recepcio);
            TablaRecepcionistas.setModel(modelo);
        }
    }
    
    public void limpiar_datosRecepcionistas() {
        TxtCedulaRep.setText("");
        TxtApellidoRep.setText("");
        TxtNombreRep.setText("");
        TxtTelefonoRep.setText("");
        TxtDireccionRep.setText("");
        TxtIdRecepcionista.setText("");
        ComboTipoSangreRep.setSelectedItem("Seleccione");
        ComboTituloRep.setSelectedItem("Seleccione");
        GrupoGeneroRecep.clearSelection();

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
            java.util.logging.Logger.getLogger(Crud_Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Recepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarRep;
    private javax.swing.JButton BtnSalirCrudDoc;
    private javax.swing.JButton BtnVRegistrosRecep;
    private javax.swing.JComboBox<String> ComboTipoSangreRep;
    private javax.swing.JComboBox<String> ComboTituloRep;
    private com.toedter.calendar.JDateChooser DateRecepcionista;
    private javax.swing.ButtonGroup GrupoGeneroRecep;
    private javax.swing.JRadioButton RadioBtnFemenino;
    private javax.swing.JRadioButton RadioBtnMasculino;
    private javax.swing.JRadioButton RadioBtnNoDefinido;
    private javax.swing.JSpinner SpinerEdadRep;
    private javax.swing.JTable TablaRecepcionistas;
    private javax.swing.JTextField TxtApellidoRep;
    private javax.swing.JTextField TxtCedulaRep;
    private javax.swing.JTextField TxtDireccionRep;
    private javax.swing.JTextField TxtIdRecepcionista;
    private javax.swing.JTextField TxtNombreRep;
    private javax.swing.JTextField TxtTelefonoRep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
