/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Hecho por: Karla Sofia Góomez Tobar 9959-21-1896
package Bancos.Modelo;

import Bancos.Controlador.clsComprobanteProveedoresBancos;
import Seguridad.Modelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoComprobanteProveedoresBancos {

    private static final String SQL_SELECT = "SELECT comId, conFechaEmision, tipMovid, cueId, concId, codBanco , movDetId, idproveedor    FROM tbl_comprobanteProveedoresBancos";
    private static final String SQL_INSERT = "INSERT INTO tbl_comprobanteProveedoresBancos(conFechaEmision, tipMovid, cueId, concId, codBanco , movDetId, idproveedor ) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_comprobanteProveedoresBancos SET conFechaEmision=?, tipMovid=?, cueId=?, concId=?, codBanco=?, movDetId=?, idproveedor=? WHERE comId = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_comprobanteProveedoresBancos WHERE comId=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT comId, conFechaEmision, tipMovid, cueId, concId, codBanco , movDetId, idproveedor  FROM tbl_comprobanteProveedoresBancos WHERE conFechaEmision = ?";
    private static final String SQL_SELECT_ID = "SELECT comId, conFechaEmision, tipMovid, cueId, concId, codBanco , movDetId, idproveedor   FROM tbl_comprobanteProveedoresBancos WHERE tipModId = ?";     



   public List<clsComprobanteProveedoresBancos> consultaComprobanteProveedores() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsComprobanteProveedoresBancos> ComprobanteProveedor = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("comId");
                String fechaE = rs.getString("conFechaEmision");
                int tipoMovId = rs.getInt("tipMovid");
                int cuentaId = rs.getInt("cueId");
                int conceptoId = rs.getInt("concId");
                int bancoId = rs.getInt("codBanco");
                int movDId = rs.getInt("movDetId");
                int idproveedor  = rs.getInt("idproveedor ");
                clsComprobanteProveedoresBancos ComprobanteProv = new clsComprobanteProveedoresBancos();
                ComprobanteProv.setComId(id);
                ComprobanteProv.setConFechaEmision(fechaE);
                ComprobanteProv.setTipMovid(tipoMovId);
                ComprobanteProv.setCueId(cuentaId);
                ComprobanteProv.setConcId(conceptoId);
                ComprobanteProv.setCodBanco(bancoId);
                ComprobanteProv.setMovDetId(movDId);
                ComprobanteProv.setidproveedor (idproveedor );
                ComprobanteProveedor.add(ComprobanteProv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return ComprobanteProveedor;
    }


     public int ingresaComprobanteProveedores (clsComprobanteProveedoresBancos comprobante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, comprobante.getConFechaEmision());
            stmt.setInt(2, comprobante.getTipMovid());
            stmt.setInt(3, comprobante.getCueId());
            stmt.setInt(4, comprobante.getConcId());
            stmt.setInt(5, comprobante.getCodBanco());
            stmt.setInt(6, comprobante.getMovDetId());
            stmt.setInt(7, comprobante.getidproveedor ());
            
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

    public int actualizaComprobanteProveedores (clsComprobanteProveedoresBancos comprobante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, comprobante.getConFechaEmision());
            stmt.setInt(2, comprobante.getTipMovid());
            stmt.setInt(3, comprobante.getCueId());
            stmt.setInt(4, comprobante.getConcId());
            stmt.setInt(5, comprobante.getCodBanco());
            stmt.setInt(6, comprobante.getMovDetId());
            stmt.setInt(7, comprobante.getidproveedor());
            
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

    public int borrarComprobanteProveedores(clsComprobanteProveedoresBancos comprobante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, comprobante.getComId());
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
    public clsComprobanteProveedoresBancos consultaComprobanteProveedoresPorNombre(clsComprobanteProveedoresBancos comprobante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + comprobante);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, comprobante.comprobante());            
            stmt.setString(1, comprobante.getConFechaEmision());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("comId");
                String fechaE = rs.getString("conFechaEmision");
                int tipoMovId = rs.getInt("tipMovid");
                int cuentaId = rs.getInt("cueId");
                int conceptoId = rs.getInt("concId");
                int bancoId = rs.getInt("codBanco");
                int movDId = rs.getInt("movDetId");
                int idproveedor  = rs.getInt("idproveedor ");
                //comprobante = new comprobante();
                comprobante.setComId(id);
                comprobante.setConFechaEmision(fechaE);
                comprobante.setTipMovid(tipoMovId);
                comprobante.setCueId(cuentaId);
                comprobante.setConcId(conceptoId);
                comprobante.setCodBanco(bancoId);
                comprobante.setMovDetId(movDId);
                comprobante.setidproveedor (idproveedor );
                System.out.println(" registro consultado: " + comprobante);                
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
        return comprobante;
    }
       public clsComprobanteProveedoresBancos consultaComprobanteProveedoresPorId(clsComprobanteProveedoresBancos comprobante) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + comprobante);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, comprobante.getComId());            
            //stmt.setString(1, comprobante.getTipMondNombre());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("comId");
                String fechaE = rs.getString("conFechaEmision");
                int tipoMovId = rs.getInt("tipMovid");
                int cuentaId = rs.getInt("cueId");
                int conceptoId = rs.getInt("concId");
                int bancoId = rs.getInt("codBanco");
                int movDId = rs.getInt("movDetId");
                int idproveedor  = rs.getInt("idproveedor ");
                //comprobante = new comprobante();
                comprobante.setComId(id);
                comprobante.setConFechaEmision(fechaE);
                comprobante.setTipMovid(tipoMovId);
                comprobante.setCueId(cuentaId);
                comprobante.setConcId(conceptoId);
                comprobante.setCodBanco(bancoId);
                comprobante.setMovDetId(movDId);
                comprobante.setidproveedor (idproveedor );
                System.out.println(" registro consultado: " + comprobante);                
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
        return comprobante;
    }    
}
