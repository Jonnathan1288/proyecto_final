/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Recepcionista;

import clases.Paciente;
import Comportamientos_recepcionista.IngresoPacientes;
import M_Recepcionista.Menu_Recepcionista;
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
public class Crud_Paciente extends javax.swing.JFrame {

    public static ArrayList<Paciente> Lista_Pacientes = new ArrayList<Paciente>();
    String edadpac = "", discapacidadPac = "", generopac = "";
    Paciente pacient = new Paciente();
    IngresoPacientes ingresopa = new IngresoPacientes();

    public Crud_Paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        verRegistrosPaciente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoGeneroPac = new javax.swing.ButtonGroup();
        GrupoDiscapacidadPac = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TxtNombrePac = new javax.swing.JTextField();
        TxtTelefonoPac = new javax.swing.JTextField();
        TxtDireccionPac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtApellidoPac = new javax.swing.JTextField();
        TxtCedulaPac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboTipoSangrePac = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        SpinerEdadPac = new javax.swing.JSpinner();
        RadioBtnMasculino = new javax.swing.JRadioButton();
        RadioBtnFemenino = new javax.swing.JRadioButton();
        RadioBtnNoDefinido = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtAlergiasPac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ComboEstadocivilPac = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TxtOcupacionPac = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ComboTipoEstudiPac = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        RadioDiscapaNO = new javax.swing.JRadioButton();
        RadioDiscapaSI = new javax.swing.JRadioButton();
        DateFnaciPaci = new com.toedter.calendar.JDateChooser();
        BtnGuardarDoc = new javax.swing.JButton();
        BtnSalirCrudDoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPaciente = new javax.swing.JTable();
        BtnListaPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("RUD DE PACIENTE");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Cedula: ");

        jLabel2.setText("Apellido: ");

        jLabel4.setText("Nombre: ");

        jLabel5.setText("Fecha de nacimiento: ");

        jLabel6.setText("Telefono: ");

        jLabel7.setText("Direccion: ");

        jLabel8.setText("Tipo de sangre: ");

        ComboTipoSangrePac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-", " " }));
        ComboTipoSangrePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoSangrePacActionPerformed(evt);
            }
        });

        jLabel9.setText("Edad: ");

        SpinerEdadPac.setModel(new javax.swing.SpinnerNumberModel(30, 30, 70, 1));

        GrupoGeneroPac.add(RadioBtnMasculino);
        RadioBtnMasculino.setText("Masculino");

        GrupoGeneroPac.add(RadioBtnFemenino);
        RadioBtnFemenino.setText("Femenino");

        GrupoGeneroPac.add(RadioBtnNoDefinido);
        RadioBtnNoDefinido.setText("No definido");

        jLabel10.setText("Genero: ");

        jLabel12.setText("Alergia: ");

        jLabel14.setText("Estado civil: ");

        ComboEstadocivilPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Soltero/a", "Casado/a", "Unioon Libre", "Divorciado/a", "Viudo/a" }));

        jLabel3.setText(" Ocupación: ");

        jLabel15.setText("Nivel de Estudio:");

        ComboTipoEstudiPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Sin estudios", "Personas analfabetas", "Primarios", "Profesionales", "Secundarios", "Medio-superiores", "Superiores" }));

        jLabel13.setText("Discapacidad: ");

        GrupoDiscapacidadPac.add(RadioDiscapaNO);
        RadioDiscapaNO.setText("NO");

        GrupoDiscapacidadPac.add(RadioDiscapaSI);
        RadioDiscapaSI.setText("SI");

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
                            .addComponent(TxtCedulaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(79, 79, 79)
                            .addComponent(TxtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addComponent(TxtNombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtAlergiasPac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDireccionPac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefonoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(DateFnaciPaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtOcupacionPac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboTipoSangrePac, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinerEdadPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioBtnMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(RadioBtnFemenino)
                        .addGap(18, 18, 18)
                        .addComponent(RadioBtnNoDefinido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioDiscapaSI)
                        .addGap(18, 18, 18)
                        .addComponent(RadioDiscapaNO))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ComboEstadocivilPac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboTipoEstudiPac, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCedulaPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtOcupacionPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(SpinerEdadPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(ComboTipoSangrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10)
                        .addComponent(RadioBtnMasculino)
                        .addComponent(RadioBtnFemenino)
                        .addComponent(RadioBtnNoDefinido))
                    .addComponent(DateFnaciPaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefonoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(ComboEstadocivilPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDireccionPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(ComboTipoEstudiPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtAlergiasPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(RadioDiscapaNO)
                    .addComponent(RadioDiscapaSI))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        BtnGuardarDoc.setText("Guardar");
        BtnGuardarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarDocActionPerformed(evt);
            }
        });

        BtnSalirCrudDoc.setText("Salir");
        BtnSalirCrudDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirCrudDocActionPerformed(evt);
            }
        });

        TablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Apellido", "Nombre", "Fecha de nacimiento", "Telefono", "Direccion", "Alergia", "Ocupación", "Edad", "Tipo sangre", "Genero", "Estado civil", "Nivel Estudio", "Discapacidad"
            }
        ));
        jScrollPane1.setViewportView(TablaPaciente);

        BtnListaPaciente.setText("Lista");
        BtnListaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListaPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 309, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(layout.createSequentialGroup()
                .addGap(637, 637, 637)
                .addComponent(BtnGuardarDoc)
                .addGap(43, 43, 43)
                .addComponent(BtnListaPaciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(556, 556, 556)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalirCrudDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel11))
                    .addComponent(BtnSalirCrudDoc))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarDoc)
                    .addComponent(BtnListaPaciente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTipoSangrePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoSangrePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoSangrePacActionPerformed

    public void registrarPaciente() {

        String cedulap = TxtCedulaPac.getText();
        String apellidop = TxtApellidoPac.getText();
        String nombrep = TxtNombrePac.getText();
        SimpleDateFormat formatoFechap = new SimpleDateFormat("yyyy-MM-dd");
        String fecha_nacidopa = formatoFechap.format(DateFnaciPaci.getDate());
        String telefonop = TxtTelefonoPac.getText();
        String direccionp = TxtDireccionPac.getText();
        String alergiap = TxtAlergiasPac.getText();
        String ocupacionp = TxtOcupacionPac.getText();
        int edadp = Integer.parseInt(edadpac);
        String tiposangrep = ComboTipoSangrePac.getSelectedItem().toString();
        String generop = generopac;
        String estado_civilp = ComboEstadocivilPac.getSelectedItem().toString();
        String nivel_estudio = ComboTipoEstudiPac.getSelectedItem().toString();
        String discapacidadp = discapacidadPac;
        if (cedulap.isEmpty() || apellidop.isEmpty() || nombrep.isEmpty() || fecha_nacidopa.isEmpty() || telefonop.isEmpty() || direccionp.isEmpty() || alergiap.isEmpty() || ocupacionp.isEmpty() || edadp <= 0 || tiposangrep.isEmpty() || generop.isEmpty() || estado_civilp.isEmpty() || nivel_estudio.isEmpty() || discapacidadp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor valide los datos a enviar a la Base de Datos");
        } else {
            Paciente pa = new Paciente();
            pa.setCedula(cedulap);
            pa.setApellido(apellidop);
            pa.setNombre(nombrep);
            pa.setFecha_nacimiento(fecha_nacidopa);
            pa.setTelefono(telefonop);
            pa.setDireccion(direccionp);
            pa.setAlergias(alergiap);
            pa.setOcupacion(ocupacionp);
            pa.setEdad(edadp);
            pa.setTipo_sangre(tiposangrep);
            pa.setGenero(generop);
            pa.setEstado_civil(estado_civilp);
            pa.setNivel_estudio(nivel_estudio);
            pa.setDiscapacidad(discapacidadp);

            if (ingresopa.InsertarPaciente(pa)) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito...");
                // vertablaDoctores();
            }
        }
    }

    public void verRegistrosPaciente() {
        DefaultTableModel modelopa = (DefaultTableModel) TablaPaciente.getModel();
        modelopa.setRowCount(0);
        List<Paciente> listaPacientes = ingresopa.listarDatos();
        for (Paciente paci : listaPacientes) {
            Vector paciente = new Vector();

            paciente.add(paci.getCedula());
            paciente.add(paci.getApellido());
            paciente.add(paci.getNombre());
            paciente.add(paci.getFecha_nacimiento());
            paciente.add(paci.getTelefono());
            paciente.add(paci.getDireccion());
            paciente.add(paci.getAlergias());
            paciente.add(paci.getOcupacion());
            paciente.add(paci.getEdad());
            paciente.add(paci.getTipo_sangre());
            paciente.add(paci.getGenero());
            paciente.add(paci.getEstado_civil());
            paciente.add(paci.getNivel_estudio());
            paciente.add(paci.getDiscapacidad());

            modelopa.addRow(paciente);
            TablaPaciente.setModel(modelopa);
        }

    }
    private void BtnGuardarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarDocActionPerformed

        if (!(TxtCedulaPac.getText().equals("") || TxtApellidoPac.getText().equals("") || TxtNombrePac.getText().equals("") || TxtTelefonoPac.getText().equals("") || TxtDireccionPac.getText().equals("") || TxtAlergiasPac.getText().equals("") || TxtOcupacionPac.getText().equals("") || ComboTipoSangrePac.getSelectedItem().equals("Seleccione") || GrupoGeneroPac.isSelected(null) || ComboEstadocivilPac.getSelectedItem().equals("Seleccione") || ComboTipoEstudiPac.getSelectedItem().equals("Seleccione") || GrupoDiscapacidadPac.isSelected(null))) {

            genero_paciente();
            mostrar_edadPac();
            discapacidad_paciente();
            registrarPaciente();
            verRegistrosPaciente();
            limpiar_datosPaciente();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor asegúrese que este llenado todos los campos solicitados del paciente.");

        }
    }//GEN-LAST:event_BtnGuardarDocActionPerformed

    private void BtnSalirCrudDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirCrudDocActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas salir del crud de paciente.", "Confirma", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            Menu_Recepcionista mrep = new Menu_Recepcionista();
            mrep.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sesión cancelada.");
        }
    }//GEN-LAST:event_BtnSalirCrudDocActionPerformed

    private void BtnListaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListaPacienteActionPerformed
        // TODO add your handling code here:
        verRegistrosPaciente();
    }//GEN-LAST:event_BtnListaPacienteActionPerformed

    public void limpiar_datosPaciente() {
        TxtCedulaPac.setText("");
        TxtApellidoPac.setText("");
        TxtNombrePac.setText("");
        //   TxtFecha_Nacimiento_Pac.setText("");
        TxtTelefonoPac.setText("");
        TxtDireccionPac.setText("");
        TxtAlergiasPac.setText("");
        TxtOcupacionPac.setText("");
        ComboTipoSangrePac.setSelectedItem("Seleccione");
        GrupoGeneroPac.clearSelection();
        ComboEstadocivilPac.setSelectedItem("Seleccione");
        ComboTipoEstudiPac.setSelectedItem("Seleccione");
        GrupoDiscapacidadPac.clearSelection();

    }

    public void mostrar_pacientes() {
        String matrizPac[][] = new String[Lista_Pacientes.size()][14];

        for (int i = 0; i < Lista_Pacientes.size(); i++) {
            matrizPac[i][0] = Lista_Pacientes.get(i).getCedula();
            matrizPac[i][1] = Lista_Pacientes.get(i).getApellido();
            matrizPac[i][2] = Lista_Pacientes.get(i).getNombre();
            matrizPac[i][3] = Lista_Pacientes.get(i).getFecha_nacimiento();
            matrizPac[i][4] = Lista_Pacientes.get(i).getTelefono();
            matrizPac[i][5] = Lista_Pacientes.get(i).getDireccion();
            matrizPac[i][6] = Lista_Pacientes.get(i).getAlergias();
            matrizPac[i][7] = Lista_Pacientes.get(i).getOcupacion();
            matrizPac[i][8] = String.valueOf(Lista_Pacientes.get(i).getEdad());
            matrizPac[i][9] = Lista_Pacientes.get(i).getTipo_sangre();
            matrizPac[i][10] = Lista_Pacientes.get(i).getGenero();
            matrizPac[i][11] = Lista_Pacientes.get(i).getEstado_civil();
            matrizPac[i][12] = Lista_Pacientes.get(i).getNivel_estudio();
            matrizPac[i][13] = Lista_Pacientes.get(i).getDiscapacidad();

        }
        TablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
                matrizPac,
                new String[]{
                    "Cedula", "Apellido", "Nombre", "Fecha de nacimiento", "Telefono", "Direccion", "Alergia", "Ocupación", "Edad", "Tipo sangre", "Genero", "Estado civil", "Nivel Estudio", "Discapacidad"
                }
        ));

    }

    public void genero_paciente() {
        GrupoGeneroPac.add(RadioBtnMasculino);
        GrupoGeneroPac.add(RadioBtnFemenino);
        GrupoGeneroPac.add(RadioBtnNoDefinido);
        if (RadioBtnMasculino.isSelected()) {
            generopac = "Masculino";
        }
        if (RadioBtnFemenino.isSelected()) {
            generopac = "Femenino";
        }
        if (RadioBtnNoDefinido.isSelected()) {
            generopac = "No definido";
        }
    }

    public void discapacidad_paciente() {
        GrupoDiscapacidadPac.add(RadioDiscapaSI);
        GrupoDiscapacidadPac.add(RadioDiscapaNO);
        if (RadioDiscapaSI.isSelected()) {
            discapacidadPac = "SI";
        }
        if (RadioDiscapaNO.isSelected()) {
            discapacidadPac = "NO";
        }
    }

    public void mostrar_edadPac() {
        edadpac = SpinerEdadPac.getValue().toString();
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
            java.util.logging.Logger.getLogger(Crud_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarDoc;
    private javax.swing.JButton BtnListaPaciente;
    private javax.swing.JButton BtnSalirCrudDoc;
    private javax.swing.JComboBox<String> ComboEstadocivilPac;
    private javax.swing.JComboBox<String> ComboTipoEstudiPac;
    private javax.swing.JComboBox<String> ComboTipoSangrePac;
    private com.toedter.calendar.JDateChooser DateFnaciPaci;
    private javax.swing.ButtonGroup GrupoDiscapacidadPac;
    private javax.swing.ButtonGroup GrupoGeneroPac;
    private javax.swing.JRadioButton RadioBtnFemenino;
    private javax.swing.JRadioButton RadioBtnMasculino;
    private javax.swing.JRadioButton RadioBtnNoDefinido;
    private javax.swing.JRadioButton RadioDiscapaNO;
    private javax.swing.JRadioButton RadioDiscapaSI;
    private javax.swing.JSpinner SpinerEdadPac;
    private javax.swing.JTable TablaPaciente;
    private javax.swing.JTextField TxtAlergiasPac;
    private javax.swing.JTextField TxtApellidoPac;
    private javax.swing.JTextField TxtCedulaPac;
    private javax.swing.JTextField TxtDireccionPac;
    private javax.swing.JTextField TxtNombrePac;
    private javax.swing.JTextField TxtOcupacionPac;
    private javax.swing.JTextField TxtTelefonoPac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
