/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Conexion_BD.Conexion;
import Interface.ConexionesPaciente;
import clases.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class IngresoPacientes implements ConexionesPaciente{
    PreparedStatement prepare; //pts
    Conexion conexionpa = new Conexion();
    ResultSet res;//rs

    @Override
    public boolean InsertarPaciente(Paciente pacientes) {
        String sql = "insert into pacientes (cedulap, apellidop, nombrep, fnacimientop, telefonop, direccionp, alergiap, ocupacionp, edadp, tiposangrep, generop, estado_civilp, nivel_estudio, discapacidadp)"+"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            prepare = conexionpa.Conexion().prepareStatement(sql);
            prepare.setString(1, pacientes.getCedula());
            prepare.setString(2, pacientes.getApellido());
            prepare.setString(3, pacientes.getNombre());
            prepare.setString(4, pacientes.getFecha_nacimiento());
            prepare.setString(5, pacientes.getTelefono());
            prepare.setString(6, pacientes.getDireccion());
            prepare.setString(7, pacientes.getAlergias());
            prepare.setString(8, pacientes.getOcupacion());
            prepare.setInt(9, pacientes.getEdad());
            prepare.setString(10, pacientes.getTipo_sangre());
            prepare.setString(11, pacientes.getGenero());
            prepare.setString(12, pacientes.getEstado_civil());
            prepare.setString(13, pacientes.getNivel_estudio());
            prepare.setString(14, pacientes.getDiscapacidad());
            prepare.executeUpdate();
            return true;
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error al insertar el articulo "+e.getMessage());
        }finally{
            conexionpa.Desconectar();
        }
        return false;
    }

    @Override
    public List<Paciente> listarDatos() {
         List<Paciente> listarPacientes = new ArrayList<>();
        /*String sql = "SELECT d.*, c.nombre as nombrecategoria FROM articulos a\n" +
                    "JOIN categorias c ON a.idcategoria = c.idcategoria";*/
        String sql ="SELECT * FROM pacientes";
        try {
            prepare = conexionpa.Conexion().prepareStatement(sql);
            res = prepare.executeQuery();
            
            while (res.next()) {                
                Paciente paci = new Paciente();        
                paci.setCedula(res.getString("cedulap"));
                paci.setApellido(res.getString("apellidop"));
                paci.setNombre(res.getString("nombrep"));
                paci.setFecha_nacimiento(res.getString("fnacimientop"));
                paci.setTelefono(res.getString("telefonop"));
                paci.setDireccion(res.getString("direccionp"));
                paci.setAlergias(res.getString("alergiap"));
                paci.setOcupacion(res.getString("ocupacionp"));
                paci.setEdad(res.getInt("edadp"));
                paci.setTipo_sangre(res.getString("tiposangrep"));
                paci.setGenero(res.getString("generop"));
                paci.setEstado_civil(res.getString("estado_civilp"));
                paci.setNivel_estudio(res.getString("nivel_estudio"));
                paci.setDiscapacidad(res.getString("discapacidadp"));
                listarPacientes.add(paci); 
            }
            res.close();
            prepare.close();
            
        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer los datos "+e.getMessage());
        }finally{
            conexionpa.Desconectar();
        }
        return listarPacientes;
    }
    
}
