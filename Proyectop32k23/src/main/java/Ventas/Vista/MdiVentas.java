/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas.Vista;

import Seguridad.Modelo.Conexion;
import java.awt.Dimension;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author visitante
 */
public class MdiVentas extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiVentas() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiVentas.MAXIMIZED_BOTH);
        this.setTitle("Menu Gestión de Ventas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1MdiVentas = new javax.swing.JMenuItem();
        jMenuItem2MdiVentas = new javax.swing.JMenuItem();
        jMenuItem4MdiVentas = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1MdiVentas = new javax.swing.JCheckBoxMenuItem();
        jMenu1MdiVentas = new javax.swing.JMenu();
        jDesktopPaneVentas = new javax.swing.JDesktopPane();
        mnuGeneralVentas = new javax.swing.JMenuBar();
        mnuArchivoVentas = new javax.swing.JMenu();
        mnuSalirSistemaVentas = new javax.swing.JCheckBoxMenuItem();
        mnuCatalogosVentas = new javax.swing.JMenu();
        mnuCatalogosMantenimientosVentas = new javax.swing.JMenu();
        mantenimientoClientes = new javax.swing.JCheckBoxMenuItem();
        mantenimientoTiendas = new javax.swing.JMenuItem();
        mantenimientoVendedores = new javax.swing.JMenuItem();
        mnuProcesosVentas = new javax.swing.JMenu();
        mnuCotizaciones = new javax.swing.JMenu();
        mnuNuevaCotizacion = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        mnuConsultasVentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuReportesVentas = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnuAyudasVentas = new javax.swing.JMenu();

        jMenuItem1MdiVentas.setText("jMenuItem1");

        jMenuItem2MdiVentas.setText("jMenuItem2");

        jMenuItem4MdiVentas.setText("jMenuItem4");

        jCheckBoxMenuItem1MdiVentas.setSelected(true);
        jCheckBoxMenuItem1MdiVentas.setText("jCheckBoxMenuItem1");

        jMenu1MdiVentas.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneVentasLayout = new javax.swing.GroupLayout(jDesktopPaneVentas);
        jDesktopPaneVentas.setLayout(jDesktopPaneVentasLayout);
        jDesktopPaneVentasLayout.setHorizontalGroup(
            jDesktopPaneVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneVentasLayout.setVerticalGroup(
            jDesktopPaneVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArchivoVentas.setText("Archivo");
        mnuArchivoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoVentasActionPerformed(evt);
            }
        });

        mnuSalirSistemaVentas.setSelected(true);
        mnuSalirSistemaVentas.setText("Salir del Sistema");
        mnuSalirSistemaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSistemaVentasActionPerformed(evt);
            }
        });
        mnuArchivoVentas.add(mnuSalirSistemaVentas);

        mnuGeneralVentas.add(mnuArchivoVentas);

        mnuCatalogosVentas.setText("Catalogos");

        mnuCatalogosMantenimientosVentas.setText("Mantenimientos");
        mnuCatalogosMantenimientosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosVentasActionPerformed(evt);
            }
        });

        mantenimientoClientes.setSelected(true);
        mantenimientoClientes.setText("Mantenimiento Clientes");
        mantenimientoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoClientesActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(mantenimientoClientes);

        mantenimientoTiendas.setText("Mantenimineto tiendas");
        mantenimientoTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoTiendasActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(mantenimientoTiendas);

        mantenimientoVendedores.setText("Mantenimiento Vendedores");
        mantenimientoVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoVendedoresActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(mantenimientoVendedores);

        mnuCatalogosVentas.add(mnuCatalogosMantenimientosVentas);

        mnuGeneralVentas.add(mnuCatalogosVentas);

        mnuProcesosVentas.setText("Procesos");

        mnuCotizaciones.setText("Cotizaciones");

        mnuNuevaCotizacion.setSelected(true);
        mnuNuevaCotizacion.setText("Nueva Cotizacion");
        mnuNuevaCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevaCotizacionActionPerformed(evt);
            }
        });
        mnuCotizaciones.add(mnuNuevaCotizacion);

        mnuProcesosVentas.add(mnuCotizaciones);

        jMenu1.setText("Pedidos");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Nuevo Pedido");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuItem2.setText("Realizar Pedidos desde Cotizaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mnuProcesosVentas.add(jMenu1);

        jMenu2.setText("Facturas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Nueva Factura");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem3);

        mnuProcesosVentas.add(jMenu2);

        mnuGeneralVentas.add(mnuProcesosVentas);

        mnuConsultasVentas.setText("Consultas");
        mnuConsultasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasVentasActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Consulta Cotizaciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuConsultasVentas.add(jMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Consulta Pedidos");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        mnuConsultasVentas.add(jCheckBoxMenuItem2);

        jMenuItem3.setText("Consulta Facturas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuConsultasVentas.add(jMenuItem3);

        mnuGeneralVentas.add(mnuConsultasVentas);

        mnuReportesVentas.setText("Reportes");

        jMenu3.setText("Ventas");

        jMenuItem5.setText("Reporte general");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem4.setText("Reporte Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem6.setText("Reporte Detalles");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Reporte Productos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Reportes Tiendas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Reportes vendedores");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        mnuReportesVentas.add(jMenu3);

        mnuGeneralVentas.add(mnuReportesVentas);

        mnuAyudasVentas.setText("Ayudas");
        mnuGeneralVentas.add(mnuAyudasVentas);

        setJMenuBar(mnuGeneralVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneVentas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneVentas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCatalogosMantenimientosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosVentasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCatalogosMantenimientosVentasActionPerformed

    private void mnuArchivoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoVentasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuArchivoVentasActionPerformed

    private void mnuSalirSistemaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSistemaVentasActionPerformed
        // TODO add your handling code here:
                /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión",            JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }        
    }//GEN-LAST:event_mnuSalirSistemaVentasActionPerformed

    private void mantenimientoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoClientesActionPerformed
        // TODO add your handling code here:
        frmMantenimientoClientes ventana = new frmMantenimientoClientes();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);       
    }//GEN-LAST:event_mantenimientoClientesActionPerformed

    private void mnuConsultasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultasVentasActionPerformed

    private void mantenimientoTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoTiendasActionPerformed
        // TODO add your handling code here:
        frmMantenimientotiendas ventana = new frmMantenimientotiendas();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoTiendasActionPerformed

    private void mantenimientoVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoVendedoresActionPerformed
        // TODO add your handling code here:
        frmMantenimientoVendedores ventana = new frmMantenimientoVendedores();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        
    }//GEN-LAST:event_mantenimientoVendedoresActionPerformed

    private void mnuNuevaCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevaCotizacionActionPerformed
        // TODO add your handling code here:
        frmCotizacion ventana = new frmCotizacion();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mnuNuevaCotizacionActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmPedidos ventana = new frmPedidos();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmConsultaCotizacion ventana = new frmConsultaCotizacion();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmConsultaCotizacion ventana = new frmConsultaCotizacion();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmConsultaPedido ventana = new frmConsultaPedido();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
        frmFacturas ventana = new frmFacturas();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        frmConsultaFacturas ventana = new frmConsultaFacturas();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        //Carlos Hernandez 9959-21-363
        
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/ventas/reportes/rptventasgeneral.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         //Carlos Hernandez 9959-21-363
        
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/ventas/reportes/rptventasclientes.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         //Carlos Hernandez 9959-21-363
        
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/ventas/reportes/rptventasdetalle.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //Carlos Hernandez 9959-21-363
        
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/ventas/reportes/rptventasproducto.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        //Carlos Hernandez 9959-21-363
        
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/ventas/reportes/rptventastiendas.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
         //Carlos Hernandez 9959-21-363
        
        Connection conn = null;        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            conn = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/ventas/reportes/rptventasvendedor.jrxml");
	    print = JasperFillManager.fillReport(report, p, conn);
            JasperViewer view = new JasperViewer(print, false);
	    view.setTitle("Reporte Prueba");
            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1MdiVentas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JDesktopPane jDesktopPaneVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu1MdiVentas;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1MdiVentas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem2MdiVentas;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem4MdiVentas;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JCheckBoxMenuItem mantenimientoClientes;
    private javax.swing.JMenuItem mantenimientoTiendas;
    private javax.swing.JMenuItem mantenimientoVendedores;
    private javax.swing.JMenu mnuArchivoVentas;
    private javax.swing.JMenu mnuAyudasVentas;
    private javax.swing.JMenu mnuCatalogosMantenimientosVentas;
    private javax.swing.JMenu mnuCatalogosVentas;
    private javax.swing.JMenu mnuConsultasVentas;
    private javax.swing.JMenu mnuCotizaciones;
    private javax.swing.JMenuBar mnuGeneralVentas;
    private javax.swing.JCheckBoxMenuItem mnuNuevaCotizacion;
    private javax.swing.JMenu mnuProcesosVentas;
    private javax.swing.JMenu mnuReportesVentas;
    private javax.swing.JCheckBoxMenuItem mnuSalirSistemaVentas;
    // End of variables declaration//GEN-END:variables
}
