/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bancos.Controlador;
import java.util.List;
import Bancos.Modelo.daoBoletaClientesBancos;
/**
 *
 * @author visitante
 */
 /*Creado por Alyson Rodríguez 9959-21-829 */

public class clsBoletaClientesBancos {
    private int IdBoleta;
    private int CodigoBoleta;
    private String FechaEmisionBoleta;
    private int IdConcepto;
    private String nombreConcepto;
    private int NumeroCuenta;
    private String efectoConcepto;   
    private int IdTipoPersonaBancos;
    private String estatusConcepto;
    private String nombreCliente;
    private int IdCliente;
    private String NitCliente;

    public clsBoletaClientesBancos() {
    }

    public clsBoletaClientesBancos(int IdBoleta) {
        this.IdBoleta = IdBoleta;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta, String efectoConcepto) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
        this.efectoConcepto = efectoConcepto;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta, String efectoConcepto, int IdTipoPersonaBancos) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
        this.efectoConcepto = efectoConcepto;
        this.IdTipoPersonaBancos = IdTipoPersonaBancos;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta, String efectoConcepto, int IdTipoPersonaBancos, String estatusConcepto) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
        this.efectoConcepto = efectoConcepto;
        this.IdTipoPersonaBancos = IdTipoPersonaBancos;
        this.estatusConcepto = estatusConcepto;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta, String efectoConcepto, int IdTipoPersonaBancos, String estatusConcepto, String nombreCliente) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
        this.efectoConcepto = efectoConcepto;
        this.IdTipoPersonaBancos = IdTipoPersonaBancos;
        this.estatusConcepto = estatusConcepto;
        this.nombreCliente = nombreCliente;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta, String efectoConcepto, int IdTipoPersonaBancos, String estatusConcepto, String nombreCliente, int IdCliente) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
        this.efectoConcepto = efectoConcepto;
        this.IdTipoPersonaBancos = IdTipoPersonaBancos;
        this.estatusConcepto = estatusConcepto;
        this.nombreCliente = nombreCliente;
        this.IdCliente = IdCliente;
    }

    public clsBoletaClientesBancos(int IdBoleta, int CodigoBoleta, String FechaEmisionBoleta, int IdConcepto, String nombreConcepto, int NumeroCuenta, String efectoConcepto, int IdTipoPersonaBancos, String estatusConcepto, String nombreCliente, int IdCliente, String NitCliente) {
        this.IdBoleta = IdBoleta;
        this.CodigoBoleta = CodigoBoleta;
        this.FechaEmisionBoleta = FechaEmisionBoleta;
        this.IdConcepto = IdConcepto;
        this.nombreConcepto = nombreConcepto;
        this.NumeroCuenta = NumeroCuenta;
        this.efectoConcepto = efectoConcepto;
        this.IdTipoPersonaBancos = IdTipoPersonaBancos;
        this.estatusConcepto = estatusConcepto;
        this.nombreCliente = nombreCliente;
        this.IdCliente = IdCliente;
        this.NitCliente = NitCliente;
    }
    
    

    public int getIdBoleta() {
        return IdBoleta;
    }

    public void setIdBoleta(int IdBoleta) {
        this.IdBoleta = IdBoleta;
    }

    public int getCodigoBoleta() {
        return CodigoBoleta;
    }

    public void setCodigoBoleta(int CodigoBoleta) {
        this.CodigoBoleta = CodigoBoleta;
    }

    public String getFechaEmisionBoleta() {
        return FechaEmisionBoleta;
    }

    public void setFechaEmisionBoleta(String FechaEmisionBoleta) {
        this.FechaEmisionBoleta = FechaEmisionBoleta;
    }

    public int getIdConcepto() {
        return IdConcepto;
    }

    public void setIdConcepto(int IdConcepto) {
        this.IdConcepto = IdConcepto;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getEfectoConcepto() {
        return efectoConcepto;
    }

    public void setEfectoConcepto(String efectoConcepto) {
        this.efectoConcepto = efectoConcepto;
    }

    public int getIdTipoPersonaBancos() {
        return IdTipoPersonaBancos;
    }

    public void setIdTipoPersonaBancos(int IdTipoPersonaBancos) {
        this.IdTipoPersonaBancos = IdTipoPersonaBancos;
    }

    public String getEstatusConcepto() {
        return estatusConcepto;
    }

    public void setEstatusConcepto(String estatusConcepto) {
        this.estatusConcepto = estatusConcepto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNitCliente() {
        return NitCliente;
    }

    public void setNitCliente(String NitCliente) {
        this.NitCliente = NitCliente;
    }

    @Override
    public String toString() {
        return "clsBoletaClientesBancos{" + "IdBoleta=" + IdBoleta + ", CodigoBoleta=" + CodigoBoleta + ", FechaEmisionBoleta=" + FechaEmisionBoleta + ", IdConcepto=" + IdConcepto + ", nombreConcepto=" + nombreConcepto + ", NumeroCuenta=" + NumeroCuenta + ", efectoConcepto=" + efectoConcepto + ", IdTipoPersonaBancos=" + IdTipoPersonaBancos + ", estatusConcepto=" + estatusConcepto +
                ", nombreCliente=" + nombreCliente + ", IdCliente=" + IdCliente + ", NitCliente=" + NitCliente +'}';
    }
    //Metodos de acceso a la capa controlador
    public clsBoletaClientesBancos getBuscarInformacionBoletaPorCodigo(clsBoletaClientesBancos boleta)
    {
        daoBoletaClientesBancos daoboletaClientesBancos = new daoBoletaClientesBancos();
        return daoboletaClientesBancos.consultaBoletaPorCodigo(boleta);
    }
    public clsBoletaClientesBancos getBuscarInformacionBoletaPorId(clsBoletaClientesBancos boleta)
    {
        daoBoletaClientesBancos daoboletaClientesBancos = new daoBoletaClientesBancos();
        return daoboletaClientesBancos.consultaBoletaPorId(boleta);
    }    
    public List<clsBoletaClientesBancos> getListadoBoletas()
    {
        daoBoletaClientesBancos daoboletaClientesBancos = new daoBoletaClientesBancos();
        List<clsBoletaClientesBancos> listadoBoletas = daoboletaClientesBancos.consultaBoleta();
        return listadoBoletas;
    }
    public int setBorrarBoleta(clsBoletaClientesBancos boleta)
    {
        daoBoletaClientesBancos daoboletaClientesBancos = new daoBoletaClientesBancos();
        return daoboletaClientesBancos.borrarBoleta(boleta);
    }          
    public int setIngresarTipoBoleta(clsBoletaClientesBancos boleta)
    {
        daoBoletaClientesBancos daoboletaClientesBancos = new daoBoletaClientesBancos();
        return daoboletaClientesBancos.ingresaBoleta(boleta);
    }              
    public int setModificarBoleta(clsBoletaClientesBancos boleta)
    {
        daoBoletaClientesBancos daoboletaClientesBancos = new daoBoletaClientesBancos();
        return daoboletaClientesBancos.actualizaBoleta(boleta);
    }              
}
