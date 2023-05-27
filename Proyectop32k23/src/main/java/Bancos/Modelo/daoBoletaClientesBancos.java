/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bancos.Modelo;


import Bancos.Controlador.clsBoletaClientesBancos;
import Seguridad.Modelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author cdavi
 */
public class daoBoletaClientesBancos {
    private static final String SQL_SELECT = "SELECT bolId, bolCodigo, bolFechaEmision, concid, concNombre, cueNumero, concEfecto, perTipoId, concEstatus, clNombre, clId, clNit FROM tbl_boletaClientesBancos";
    private static final String SQL_INSERT = "INSERT INTO tbl_boletaClientesBancos(bolId, bolCodigo, bolFechaEmision, concid, concNombre, cueNumero, concEfecto, perTipoId, concEstatus, clNombre, clId, clNit) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_boletaClientesBancos SET bolCodigo=?, bolFechaEmision=?, concid=?, concNombre=?, cueNumero=?, concEfecto=?, perTipoId=?, concEstatus=?, clNombre=?, clId=?, clNit=? WHERE bolId = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_boletaClientesBancos WHERE bolId=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT bolId, bolFechaEmision, concid, concNombre, cueNumero, concEfecto, perTipoId, concEstatus, clNombre, clId, clNit FROM tbl_boletaClientesBancos WHERE bolCodigo = ?";
    private static final String SQL_SELECT_ID = "SELECT bolId, bolCodigo, bolFechaEmision, concid, concNombre, cueNumero, concEfecto, perTipoId, concEstatus, clNombre, clId, clNit FROM tbl_boletaClientesBancos WHERE bolId = ?";    

    public List<clsBoletaClientesBancos> consultaBoleta() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsBoletaClientesBancos> boletas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_boleta = rs.getInt("bolId");
                int codigo_boleta = rs.getInt("bolCodigo");
                String fecha_emision = rs.getString("bolFechaEmision");
                int id_concepto = rs.getInt("concid");
                String nombre_concepto = rs.getString("concNombre");
                int numero_cuenta = rs.getInt("cueNumero");
                String efecto_concepto = rs.getString("concEfecto");
                int id_tipoPersona = rs.getInt("perTipoId");
                String estatus_concepto = rs.getString("concEstatus");
                String nombre_cliente = rs.getString("clNombre");
                int id_cliente = rs.getInt("clId");
                String nit_cliente = rs.getString("clNit");
                clsBoletaClientesBancos boleta = new clsBoletaClientesBancos();
                boleta.setIdBoleta(id_boleta);
                boleta.setCodigoBoleta(codigo_boleta);
                boleta.setFechaEmisionBoleta(fecha_emision);
                boleta.setIdConcepto(id_concepto);
                boleta.setNombreConcepto(nombre_concepto);
                boleta.setNumeroCuenta(numero_cuenta);
                boleta.setEfectoConcepto(efecto_concepto);
                boleta.setIdTipoPersonaBancos(id_tipoPersona);
                boleta.setEstatusConcepto(estatus_concepto);
                boleta.setNombreCliente(nombre_cliente);
                boleta.setIdCliente(id_cliente);
                boleta.setNitCliente(nit_cliente);
                boletas.add(boleta);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return boletas;
    }

    public int ingresaBoleta(clsBoletaClientesBancos boleta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, boleta.getIdBoleta());
            stmt.setInt(2, boleta.getCodigoBoleta());
            stmt.setString(3, boleta.getFechaEmisionBoleta());
            stmt.setInt(4, boleta.getIdConcepto());
            stmt.setString(5, boleta.getNombreConcepto());
            stmt.setInt(6, boleta.getNumeroCuenta());
            stmt.setString(7, boleta.getEfectoConcepto());
            stmt.setInt(8, boleta.getIdTipoPersonaBancos());
            stmt.setString(9, boleta.getEstatusConcepto());
            stmt.setString(10, boleta.getNombreCliente());
            stmt.setInt(11, boleta.getIdCliente());
            stmt.setString(12, boleta.getNitCliente());
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

    public int actualizaBoleta(clsBoletaClientesBancos boleta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, boleta.getCodigoBoleta());
            stmt.setString(2, boleta.getFechaEmisionBoleta());
            stmt.setInt(3, boleta.getIdConcepto());
            stmt.setString(4, boleta.getNombreConcepto());
            stmt.setInt(5, boleta.getNumeroCuenta());
            stmt.setString(6, boleta.getEfectoConcepto());
            stmt.setInt(7, boleta.getIdTipoPersonaBancos());
            stmt.setString(8, boleta.getEstatusConcepto());
            stmt.setString(9, boleta.getNombreCliente());
            stmt.setInt(10, boleta.getIdCliente());
            stmt.setString(11, boleta.getNitCliente());
            stmt.setInt(12, boleta.getIdBoleta());

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

    public int borrarBoleta(clsBoletaClientesBancos boleta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, boleta.getIdBoleta());
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

    public clsBoletaClientesBancos consultaBoletaPorCodigo(clsBoletaClientesBancos boleta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + boleta);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, modulo.getIdModulo());            
            stmt.setInt(1, boleta.getCodigoBoleta());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_boleta = rs.getInt("bolId");
                int codigo_boleta = rs.getInt("bolCodigo");
                String fecha_emision = rs.getString("bolFechaEmision");
                int id_concepto = rs.getInt("concid");
                String nombre_concepto = rs.getString("concNombre");
                int numero_cuenta = rs.getInt("cueNumero");
                String efecto_concepto = rs.getString("concEfecto");
                int id_tipoPersona = rs.getInt("perTipoId");
                String estatus_concepto = rs.getString("concEstatus");
                String nombre_cliente = rs.getString("clNombre");
                int id_cliente = rs.getInt("clId");
                String nit_cliente = rs.getString("clNit");
                //boleta = new clsModulo();
                boleta.setIdBoleta(id_boleta);
                boleta.setCodigoBoleta(codigo_boleta);
                boleta.setFechaEmisionBoleta(fecha_emision);
                boleta.setIdConcepto(id_concepto);
                boleta.setNombreConcepto(nombre_concepto);
                boleta.setNumeroCuenta(numero_cuenta);
                boleta.setEfectoConcepto(efecto_concepto);
                boleta.setIdTipoPersonaBancos(id_tipoPersona);
                boleta.setEstatusConcepto(estatus_concepto);
                boleta.setNombreCliente(nombre_cliente);
                boleta.setIdCliente(id_cliente);
                boleta.setNitCliente(nit_cliente);
                System.out.println(" registro consultado: " + boleta);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return movimiento;  // Si se utiliza un ArrayList
        return boleta;
    }
    public clsBoletaClientesBancos consultaBoletaPorId(clsBoletaClientesBancos boleta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + boleta);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, boleta.getIdBoleta());            
            //stmt.setString(1, modulo.getNombreModulo());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_boleta = rs.getInt("bolId");
                int codigo_boleta = rs.getInt("bolCodigo");
                String fecha_emision = rs.getString("bolFechaEmision");
                int id_concepto = rs.getInt("concid");
                String nombre_concepto = rs.getString("concNombre");
                int numero_cuenta = rs.getInt("cueNumero");
                String efecto_concepto = rs.getString("concEfecto");
                int id_tipoPersona = rs.getInt("perTipoId");
                String estatus_concepto = rs.getString("concEstatus");
                String nombre_cliente = rs.getString("clNombre");
                int id_cliente = rs.getInt("clId");
                String nit_cliente = rs.getString("clNit");

                //modulo = new clsModulo();
                boleta.setIdBoleta(id_boleta);
                boleta.setCodigoBoleta(codigo_boleta);
                boleta.setFechaEmisionBoleta(fecha_emision);
                boleta.setIdConcepto(id_concepto);
                boleta.setNombreConcepto(nombre_concepto);
                boleta.setNumeroCuenta(numero_cuenta);
                boleta.setEfectoConcepto(efecto_concepto);
                boleta.setIdTipoPersonaBancos(id_tipoPersona);
                boleta.setEstatusConcepto(estatus_concepto);
                boleta.setNombreCliente(nombre_cliente);
                boleta.setIdCliente(id_cliente);
                boleta.setNitCliente(nit_cliente);
                System.out.println(" registro consultado: " + boleta);                
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
        return boleta;
    }    
}
