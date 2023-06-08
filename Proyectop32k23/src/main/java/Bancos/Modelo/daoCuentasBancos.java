/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Hecho por: Alyson Vannesa Rodríguez Quezada 9959-21-829
package Bancos.Modelo;

import Bancos.Controlador.clsCuentasBancos;
import Seguridad.Modelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoCuentasBancos {

    private static final String SQL_SELECT = "SELECT cueId, cueSaldo, perId, cueTipoId, cueestatus, tipModId, codBanco FROM tbl_cuentasBancos";
    private static final String SQL_INSERT = "INSERT INTO tbl_cuentasBancos(cueId, cueSaldo, perId, cueTipoId, cueestatus, tipModId, codBanco) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_cuentasBancos SET cueSaldo=?, perId=?, cueTipoId=?, cueestatus=?, tipModId=?, codBanco=? WHERE cueId = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_cuentasBancos WHERE cueId=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT cueId, cueSaldo, perId, cueTipoId, cueestatus, tipModId, codBanco FROM tbl_cuentasBancos WHERE perId = ?";
    private static final String SQL_SELECT_ID = "SELECT cueId, cueSaldo, perId, cueTipoId, cueestatus, tipModId, codBanco FROM tbl_cuentasBancos WHERE cueId = ?";
     

    public List<clsCuentasBancos> consultaCuenta() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsCuentasBancos> cuentas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("cueId");
                double saldo = rs.getDouble("cueSaldo");
                int persona = rs.getInt("perId");
                int tipoC = rs.getInt("cueTipoId");
		String estatus = rs.getString("cueEstatus");
                int tipoMoneda = rs.getInt("tipModId");
                int codigoBanco = rs.getInt("codBanco");
                clsCuentasBancos cuenta = new clsCuentasBancos();
                cuenta.setIdCuenta(id);    
                cuenta.setSaldoCuenta(saldo);
                cuenta.setIdPersona(persona);
                cuenta.setIdTipoCuenta(tipoC);
                cuenta.setEstatusCuenta(estatus);
                cuenta.setTipModId(tipoMoneda);
                cuenta.setCodBanco(codigoBanco);
                cuentas.add(cuenta);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return cuentas;
    }

    public int ingresaCuenta(clsCuentasBancos cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, cuenta.getIdCuenta());
            stmt.setDouble(2, cuenta.getSaldoCuenta());
            stmt.setInt(3, cuenta.getIdPersona());
            stmt.setInt(4, cuenta.getIdTipoCuenta());
            stmt.setString(5, cuenta.getEstatusCuenta());
            stmt.setInt(6, cuenta.getTipModId());
            stmt.setInt(7, cuenta.getCodBanco());
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizaCuenta(clsCuentasBancos cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setDouble(1, cuenta.getSaldoCuenta());
            stmt.setInt(2, cuenta.getIdPersona());
	    stmt.setInt(3, cuenta.getIdTipoCuenta());
            stmt.setString(4, cuenta.getEstatusCuenta());
            stmt.setInt(5, cuenta.getTipModId());
            stmt.setInt(6, cuenta.getCodBanco());
            stmt.setInt(7, cuenta.getIdCuenta());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int borrarCuenta(clsCuentasBancos cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cuenta.getIdCuenta());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsCuentasBancos consultaPorIdPersona(clsCuentasBancos cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + cuenta);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, usuario.getIdUsuario());            
            stmt.setInt(1, cuenta.getIdPersona());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("cueId");
                double saldo = rs.getDouble("cueSaldo");
                int persona = rs.getInt("perId");
                int tipoC = rs.getInt("cueTipoId");
                String estatus = rs.getString("cueEstatus");
                int tipoMoneda = rs.getInt("tipModId");
                int codigoBanco = rs.getInt("codBanco");
                
                //cuenta = new clsCuentaBancos();
                cuenta.setIdCuenta(id);
                cuenta.setSaldoCuenta(saldo);
                cuenta.setIdPersona(persona);
                cuenta.setIdTipoCuenta(tipoC);
                cuenta.setEstatusCuenta(estatus);
                cuenta.setTipModId(tipoMoneda);
                cuenta.setCodBanco(codigoBanco);
                
                System.out.println(" registro consultado: " + cuenta);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return cuenta;
    }
    public clsCuentasBancos consultaCuentaPorId(clsCuentasBancos cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + cuenta);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, cuenta.getIdCuenta());            
            //stmt.setString(1, usuario.getNombreUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("cueId");
                double saldo = rs.getDouble("cueSaldo");
                int persona = rs.getInt("perId");
                int tipoC = rs.getInt("cueTipoId");
		String estatus = rs.getString("cueestatus");
                int tipoMoneda = rs.getInt("tipModId");
                int codigoBanco = rs.getInt("codBanco");
                //usuario = new clsUsuario();
                cuenta.setIdCuenta(id);
                cuenta.setSaldoCuenta(saldo);
                cuenta.setIdPersona(persona);
                cuenta.setIdTipoCuenta(tipoC);
                cuenta.setEstatusCuenta(estatus);
                cuenta.setTipModId(tipoMoneda);
                cuenta.setCodBanco(codigoBanco);
                System.out.println(" registro consultado: " + cuenta);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return cuenta;
    }    
}
