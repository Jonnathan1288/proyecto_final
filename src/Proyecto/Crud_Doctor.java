/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Comportamientos.IngresoDoctores;
import Conexion_BD.Conexion;
import M_Recepcionista.Menu_Recepcionista;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Crud_Doctor extends javax.swing.JFrame {

    public static ArrayList<Doctor> Lista_Doctores = new ArrayList<Doctor>();
    String edaddoc = "", consultoriodoc = "", generodoc = "";
    int d = 0;
    Doctor doc = new Doctor();
    IngresoDoctores acc = new IngresoDoctores();

    public Crud_Doctor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoGeneroDoc = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TxtNombreDoc = new javax.swing.JTextField();
        TxtTelefonoDoc = new javax.swing.JTextField();
        TxtDireccionDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtApellidoDoc = new javax.swing.JTextField();
        TxtCedulaDoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboTipoSangreDoc = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        SpinerEdadDoc = new javax.swing.JSpinner();
        RadioBtnMasculino = new javax.swing.JRadioButton();
        RadioBtnFemenino = new javax.swing.JRadioButton();
        RadioBtnNoDefinido = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtCodigoDoc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ComboEspecialidadDoc = new javax.swing.JComboBox<>();
        SpinerConsultorioDoc = new javax.swing.JSpinner();
        BtnGuardarDoc = new javax.swing.JButton();
        BtnVRegistros = new javax.swing.JButton();
        DateDoctorFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDoctores = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        BtnSalirCrudDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Cedula: ");

        jLabel2.setText("Apellido: ");

        jLabel4.setText("Nombre: ");

        jLabel5.setText("Fecha de nacimiento: ");

        jLabel6.setText("Telefono: ");

        jLabel7.setText("Direccion: ");

        jLabel8.setText("Tipo de sangre: ");

        ComboTipoSangreDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        ComboTipoSangreDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoSangreDocActionPerformed(evt);
            }
        });

        jLabel9.setText("Edad: ");

        SpinerEdadDoc.setModel(new javax.swing.SpinnerNumberModel(30, 30, 70, 1));

        GrupoGeneroDoc.add(RadioBtnMasculino);
        RadioBtnMasculino.setText("Masculino");

        GrupoGeneroDoc.add(RadioBtnFemenino);
        RadioBtnFemenino.setText("Femenino");

        GrupoGeneroDoc.add(RadioBtnNoDefinido);
        RadioBtnNoDefinido.setText("No definido");

        jLabel10.setText("Genero: ");

        jLabel12.setText("Codigo Doctor: ");

        jLabel14.setText("Especialidad: ");

        jLabel15.setText("Consultorio: ");

        ComboEspecialidadDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Alergología", "Anestesiología", "Angiología", "Cardiología", "Endocrinología", "Estomatología", "Gastroenterología", "Genética", "Geriatría", "Hematología", "Hepatología", "Infectología", "Medicina aeroespacial", "Medicina del deporte", "Medicina familiar y comunitaria", "Medicina física y rehabilitación", "Medicina forense", "Medicina intensiva", "Medicina interna", "Medicina preventiva y salud pública", "Medicina del trabajo", "Nefrología", "Neumología", "Neurología", "Nutriología", "Oncología médica", "Oncología radioterápica", "Pediatría", "Psiquiatría", "Reumatología", "Toxicología", " " }));

        SpinerConsultorioDoc.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        BtnGuardarDoc.setText("Guardar");
        BtnGuardarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarDocActionPerformed(evt);
            }
        });

        BtnVRegistros.setText("Ver registros");
        BtnVRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVRegistrosActionPerformed(evt);
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
                            .addComponent(TxtCedulaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(79, 79, 79)
                            .addComponent(TxtApellidoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addComponent(TxtNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtCodigoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(TxtDireccionDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(TxtTelefonoDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(DateDoctorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboTipoSangreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SpinerConsultorioDoc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SpinerEdadDoc, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(ComboEspecialidadDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioBtnMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(RadioBtnFemenino)
                                .addGap(18, 18, 18)
                                .addComponent(RadioBtnNoDefinido))))
                    .addComponent(BtnGuardarDoc)
                    .addComponent(BtnVRegistros))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TxtCedulaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(SpinerEdadDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ComboTipoSangreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(ComboEspecialidadDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateDoctorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefonoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(SpinerConsultorioDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDireccionDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardarDoc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtCodigoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVRegistros))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TablaDoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Apellido", "Nombre", "Fecha de nacimiento", "Telefono", "Direccion", "Codigo", "Edad", "Tipo Sangre", "Genero", "Especialidad", "Consultorio"
            }
        ));
        jScrollPane1.setViewportView(TablaDoctores);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("CRUD DE DOCTOR");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 258, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(605, 605, 605)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalirCrudDoc)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BtnSalirCrudDoc)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTipoSangreDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoSangreDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoSangreDocActionPerformed

    public void vertablaDoctores() {
        DefaultTableModel modelo = (DefaultTableModel) TablaDoctores.getModel();
        modelo.setRowCount(0);
        List<Doctor> listaDoctores = acc.listarDatos();
        for (Doctor dato : listaDoctores) {
            Vector v = new Vector();

            v.add(dato.getCedula());
            v.add(dato.getApellido());
            v.add(dato.getNombre());
            v.add(dato.getFecha_nacimiento());
            v.add(dato.getTelefono());
            v.add(dato.getDireccion());
            v.add(dato.getCodigo_doctor());
            v.add(dato.getEdad());
            v.add(dato.getTipo_sangre());
            v.add(dato.getGenero());
            v.add(dato.getEspecialidad());
            v.add(dato.getConsultorio());
            modelo.addRow(v);
            TablaDoctores.setModel(modelo);
        }
    }

    public void registrarDoctor() {
        String cedulado = TxtCedulaDoc.getText();
        String apellidodo = TxtApellidoDoc.getText();
        String nombredo = TxtNombreDoc.getText();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_nacido = formatoFecha.format(DateDoctorFecha.getDate());
        String telfonodo = TxtTelefonoDoc.getText();
        String direcciondo = TxtDireccionDoc.getText();
        String codigodo = TxtCodigoDoc.getText();
        int edado = Integer.parseInt(edaddoc);
        String tiposangredo = ComboTipoSangreDoc.getSelectedItem().toString();
        String generodo = generodoc;
        String especialidado = ComboEspecialidadDoc.getSelectedItem().toString();
        int consultorio = Integer.parseInt(consultoriodoc);

        if (cedulado.isEmpty() || apellidodo.isEmpty() || nombredo.isEmpty() || fecha_nacido.isEmpty() || telfonodo.isEmpty() || direcciondo.isEmpty() || codigodo.isEmpty() || edado <= 0 || tiposangredo.isEmpty() || generodo.isEmpty() || especialidado.isEmpty() || consultorio <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor valide los datos a enviar a la Base de Datos");
        } else {
            Doctor d = new Doctor();
            d.setCedula(cedulado);
            d.setApellido(apellidodo);
            d.setNombre(nombredo);
            d.setFecha_nacimiento(fecha_nacido);
            d.setTelefono(telfonodo);
            d.setDireccion(direcciondo);
            d.setCodigo_doctor(codigodo);
            d.setEdad(edado);
            d.setTipo_sangre(tiposangredo);
            d.setGenero(generodo);
            d.setEspecialidad(especialidado);
            d.setConsultorio(consultorio);
            if (acc.InsertarDoctor(d)) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito...");
                vertablaDoctores();
            }
        }
    }
    private void BtnGuardarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarDocActionPerformed

        if (!(TxtCedulaDoc.getText().equals("") || TxtApellidoDoc.getText().equals("") || TxtNombreDoc.getText().equals("") || TxtTelefonoDoc.getText().equals("") || TxtDireccionDoc.getText().equals("") || TxtCodigoDoc.getText().equals("") || ComboTipoSangreDoc.getSelectedItem().equals("Seleccione") || GrupoGeneroDoc.isSelected(null) || ComboEspecialidadDoc.getSelectedItem().equals("Seleccione"))) {
            genero_doctor();
            mostrar_consultorioDoc();
            mostrar_edadDoc();
            registrarDoctor();
            limpiar_datosDoctor();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor asegúrese que este llenado todos los campos solicitados del doctor.");

        }

    }//GEN-LAST:event_BtnGuardarDocActionPerformed

    private void BtnSalirCrudDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirCrudDocActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas salir del crud de doctor.", "Confirma", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            Menu_Recepcionista mr = new Menu_Recepcionista();
            mr.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesión cancelada.");
        }
    }//GEN-LAST:event_BtnSalirCrudDocActionPerformed

    private void BtnVRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVRegistrosActionPerformed
        // TODO add your handling code here:
        vertablaDoctores();
    }//GEN-LAST:event_BtnVRegistrosActionPerformed

    public void limpiar_datosDoctor() {
        TxtCedulaDoc.setText("");
        TxtApellidoDoc.setText("");
        TxtNombreDoc.setText("");
        // TxtFecha_Nacimiento_Doc.setText("");

        TxtTelefonoDoc.setText("");
        TxtDireccionDoc.setText("");
        TxtCodigoDoc.setText("");
        ComboTipoSangreDoc.setSelectedItem("Seleccione");
        ComboEspecialidadDoc.setSelectedItem("Seleccione");
        GrupoGeneroDoc.clearSelection();
    }

    public void genero_doctor() {
        GrupoGeneroDoc.add(RadioBtnMasculino);
        GrupoGeneroDoc.add(RadioBtnFemenino);
        GrupoGeneroDoc.add(RadioBtnNoDefinido);
        if (RadioBtnMasculino.isSelected()) {
            generodoc = "Masculino";
        }
        if (RadioBtnFemenino.isSelected()) {
            generodoc = "Femenino";
        }
        if (RadioBtnNoDefinido.isSelected()) {
            generodoc = "No definido";
        }
    }

    public void mostrar_edadDoc() {
        edaddoc = SpinerEdadDoc.getValue().toString();
        d = Integer.parseInt(edaddoc);
    }

    public void mostrar_consultorioDoc() {
        consultoriodoc = SpinerConsultorioDoc.getValue().toString();
    }

    public void mostrar_doctores() {
        String matrizDoc[][] = new String[Lista_Doctores.size()][12];

        for (int i = 0; i < Lista_Doctores.size(); i++) {
            matrizDoc[i][0] = Lista_Doctores.get(i).getCedula();
            matrizDoc[i][1] = Lista_Doctores.get(i).getApellido();
            matrizDoc[i][2] = Lista_Doctores.get(i).getNombre();
            matrizDoc[i][3] = Lista_Doctores.get(i).getFecha_nacimiento();
            matrizDoc[i][4] = Lista_Doctores.get(i).getTelefono();
            matrizDoc[i][5] = Lista_Doctores.get(i).getDireccion();
            matrizDoc[i][6] = Lista_Doctores.get(i).getCodigo_doctor();
            //  matrizDoc[i][7] = Lista_Doctores.get(i).getEdad();
            matrizDoc[i][7] = String.valueOf(Lista_Doctores.get(i).getEdad());
            matrizDoc[i][8] = Lista_Doctores.get(i).getTipo_sangre();
            matrizDoc[i][9] = Lista_Doctores.get(i).getGenero();
            matrizDoc[i][10] = Lista_Doctores.get(i).getEspecialidad();
            matrizDoc[i][11] = String.valueOf(Lista_Doctores.get(i).getConsultorio());

        }
        TablaDoctores.setModel(new javax.swing.table.DefaultTableModel(
                matrizDoc,
                new String[]{
                    "Cedula", "Apellido", "Nombre", "Fecha de nacimiento", "Telefono", "Direccion", "Codigo", "Edad", "Tipo Sangre", "Genero", "Especialidad", "Consultorio"
                }
        ));
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
            java.util.logging.Logger.getLogger(Crud_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarDoc;
    private javax.swing.JButton BtnSalirCrudDoc;
    private javax.swing.JButton BtnVRegistros;
    private javax.swing.JComboBox<String> ComboEspecialidadDoc;
    private javax.swing.JComboBox<String> ComboTipoSangreDoc;
    private com.toedter.calendar.JDateChooser DateDoctorFecha;
    private javax.swing.ButtonGroup GrupoGeneroDoc;
    private javax.swing.JRadioButton RadioBtnFemenino;
    private javax.swing.JRadioButton RadioBtnMasculino;
    private javax.swing.JRadioButton RadioBtnNoDefinido;
    private javax.swing.JSpinner SpinerConsultorioDoc;
    private javax.swing.JSpinner SpinerEdadDoc;
    private javax.swing.JTable TablaDoctores;
    private javax.swing.JTextField TxtApellidoDoc;
    private javax.swing.JTextField TxtCedulaDoc;
    private javax.swing.JTextField TxtCodigoDoc;
    private javax.swing.JTextField TxtDireccionDoc;
    private javax.swing.JTextField TxtNombreDoc;
    private javax.swing.JTextField TxtTelefonoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
