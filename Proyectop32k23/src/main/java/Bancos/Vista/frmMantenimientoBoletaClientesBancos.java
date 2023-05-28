/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bancos.Vista;


import Bancos.Controlador.clsBoletaClientesBancos;
import Bancos.Controlador.clsBancoExterno;
//import Bancos.Controlador.clsClientes;
import Bancos.Controlador.clsConceptosBancos;
import Bancos.Controlador.clsTipoMovimientoBancos;
import Bancos.Controlador.clsCuentasBancos;
import Bancos.Controlador.clsTipoMoneda;
import Seguridad.Controlador.clsBitacora;
import Seguridad.Controlador.clsUsuarioConectado;
import java.awt.Component;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class frmMantenimientoBoletaClientesBancos extends javax.swing.JInternalFrame {
    int codigoAplicacion= 5005;

    public void llenadoCodigoBanco() {
       clsBancoExterno banco = new clsBancoExterno();
        List<clsBancoExterno> listaBancos = banco.getListadoBancosExternos();
        cbNombreBanco.setAlignmentX(Component.CENTER_ALIGNMENT);
        cbNombreBanco.addItem("Seleccionar...");
        for (int i = 0; i < listaBancos.size(); i++) {
            clsBancoExterno bancoExterno = listaBancos.get(i);
            String item = bancoExterno.getCodigoBanco()+ " - "+bancoExterno.getNombreBanco();
            cbNombreBanco.addItem(item);
        }
    }
        
     /* public void llenadoDeComboNombreCliente() {
        clsClientes cliente = new clsClientes();
        List<clsClientes> listaClientes = cliente.getListadoClientes();
        cbNombreCliente.setAlignmentX(Component.CENTER_ALIGNMENT);
        cbNombreCliente.addItem("Seleccionar...");
        for (int i = 0; i < listaClientes.size(); i++) {
            clsClientes clientenombre = listaClientes.get(i);
            String item = clientenombre.getTipModId() + " - " + clientenombre.getNombreCliente();
            cbNombreCliente.addItem(item);
        }*/
     
    public void llenadoConcepto() {
       clsConceptosBancos concepto = new clsConceptosBancos();
        List<clsConceptosBancos> listaConcepto = concepto.getListadoConceptos();
        cbConcepto.setAlignmentX(Component.CENTER_ALIGNMENT);
        cbConcepto.addItem("Seleccionar...");
        for (int i = 0; i < listaConcepto.size(); i++) {
            clsConceptosBancos conceptosBancos = listaConcepto.get(i);
            String item = conceptosBancos.getIdConcepto()+ " - "+conceptosBancos.getNombreConcepto();
            cbConcepto.addItem(item);
        }
    }
    
    public void llenadoTipoMovimiento() {
       clsTipoMovimientoBancos movimiento = new clsTipoMovimientoBancos();
        List<clsTipoMovimientoBancos> listaMovimiento = movimiento.getListadoTipoMovimiento();
        cbCodigoMov.setAlignmentX(Component.CENTER_ALIGNMENT);
        cbCodigoMov.addItem("Seleccionar...");
        for (int i = 0; i < listaMovimiento.size(); i++) {
            clsTipoMovimientoBancos movimientosBancos = listaMovimiento.get(i);
            String item = movimientosBancos.getTipoMovimientoId()+ " - "+movimientosBancos.getNombreMovimiento();
            cbCodigoMov.addItem(item);
        }
    }
    
    public void llenadoCuentas() {
       clsCuentasBancos cuentas = new clsCuentasBancos();
        List<clsCuentasBancos> listaCuentas = cuentas.getListadoCuentas();
        cbIdCuenta.setAlignmentX(Component.CENTER_ALIGNMENT);
        cbIdCuenta.addItem("Seleccionar...");
        for (int i = 0; i < listaCuentas.size(); i++) {
            cbIdCuenta.addItem(String.valueOf(listaCuentas.get(i).getIdCuenta()));
        } 
    }
     
    public void llenadoDeCombos() {
        clsTipoMoneda moneda = new clsTipoMoneda();
        List<clsTipoMoneda> listaTipoMonedas = moneda.getListadoMonedas();
        cbTipoMoneda.setAlignmentX(Component.CENTER_ALIGNMENT);
        cbTipoMoneda.addItem("Seleccionar...");
        for (int i = 0; i < listaTipoMonedas.size(); i++) {
            clsTipoMoneda tipoMoneda = listaTipoMonedas.get(i);
            String item = tipoMoneda.getTipModId() + " - " + tipoMoneda.getTipMondAbreviacion();
            cbTipoMoneda.addItem(item);
        }
    }
     

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Movimiento");
        modelo.addColumn("Estatus Movimiento");
       

        clsTipoMovimientoBancos movimiento = new clsTipoMovimientoBancos();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsTipoMovimientoBancos> listadoTipoMovimientos = movimiento.getListadoTipoMovimiento();
     
        tablaMovimientos.setModel(modelo);
        String[] dato = new String[3];
        for (int i = 0; i < listadoTipoMovimientos.size(); i++) {
            dato[0] = Integer.toString(listadoTipoMovimientos.get(i).getTipoMovimientoId());
            dato[1] = listadoTipoMovimientos.get(i).getNombreMovimiento();
            dato[2] = listadoTipoMovimientos.get(i).getEstatusMovimiento();
            modelo.addRow(dato);
        }       
    }

    public frmMantenimientoBoletaClientesBancos() {
        initComponents();
        llenadoDeTablas();
        llenadoCodigoBanco();
        llenadoConcepto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        tipoEstatus = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        lb = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbNombreCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbConcepto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbNombreBanco = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbIdCuenta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbTipoMoneda = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbCodigoMov = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Tipo Movimiento");
        setVisible(true);

        tablaMovimientos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Vendedor", "ID Empleado", "Correo", "Telefono", "Direccion", "Porcentaje", "Comision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMovimientos);

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("Id");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancos/Vista/registrar.jpg"))); // NOI18N
        btnRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancos/Vista/modificar.jpg"))); // NOI18N
        btnModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancos/Vista/eliminar.jpg"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bancos/Vista/refrescar.jpg"))); // NOI18N
        btnActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setText("ID a buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setText("No. Documento");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Fecha Emisión");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Nombre Cliente");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbNombreCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Valor");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Concepto");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbConcepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Banco");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbNombreBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Cuenta");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbIdCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Moneda");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbTipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbConcepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoMoneda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cbNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbIdCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel8.setText("Código");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbCodigoMov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Cargo");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipoEstatus.add(jRadioButton1);
        jRadioButton1.setText("Cargo");

        tipoEstatus.add(jRadioButton2);
        jRadioButton2.setText("Abono");

        jLabel10.setText("Valor");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCodigoMov, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton2)
                .addGap(48, 48, 48)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbCodigoMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 769, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21)))
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int registrosBorrados=0;
        clsTipoMovimientoBancos movimiento= new clsTipoMovimientoBancos();
        movimiento.setTipoMovimientoId(Integer.parseInt(txtbuscado.getText()));
        registrosBorrados=movimiento.setBorrarTipoMovimiento(movimiento);

        JOptionPane.showMessageDialog(null, "Registro Borrado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        llenadoDeTablas();
        int resultadoBitacora =0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "DEL");
        limpiarTextos();
    }//GEN-LAST:event_btnEliminarActionPerformed
        int contador=0; 
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        clsTipoMovimientoBancos movimiento = new clsTipoMovimientoBancos();
        
        if(rbHabilitado.isSelected()){
            movimiento.setEstatusMovimiento("T");
        }
        
        else if(rbDeshabilitado.isSelected()){
            movimiento.setEstatusMovimiento("F");
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estatus.");
            return;
        }
        
        movimiento.setTipoMovimientoId(Integer.parseInt(txtTipoMovimiento.getText()));
        movimiento.setNombreMovimiento(txtNombre.getText());   
        movimiento.setIngresarTipoMovimiento(movimiento);
        JOptionPane.showMessageDialog(null, "Registro Ingresado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
        llenadoDeTablas();
        limpiarTextos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        clsTipoMovimientoBancos movimiento = new clsTipoMovimientoBancos();
        //usuario.setNombreUsuario(txtbuscado.getText());        
        movimiento.setTipoMovimientoId(Integer.parseInt(txtbuscado.getText()));        
        movimiento = movimiento.getBuscarInformacionTipoMovimientoPorId(movimiento);
        System.out.println("Movimiento retornado:" + movimiento);        
        txtNombre.setText(movimiento.getNombreMovimiento());
        
        rbHabilitado.setSelected(movimiento.getEstatusMovimiento().equals("T"));
        rbDeshabilitado.setSelected(movimiento.getEstatusMovimiento().equals("F"));
        
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "QRY");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         // TODO add your handling code here:
        clsTipoMovimientoBancos movimiento = new clsTipoMovimientoBancos();
        movimiento.setTipoMovimientoId(Integer.parseInt(txtbuscado.getText()));
        movimiento.setNombreMovimiento(txtNombre.getText());
        //movimiento.setEstatusMovimiento(txtEstatus.getText());
        //movimiento.setModificarTipoMovimiento(movimiento);
        

        int contador = 0;
            String estatusMovimiento = rbHabilitado.isSelected() ? "T" : (rbDeshabilitado.isSelected() ? "F" : "");
            if (!estatusMovimiento.isEmpty()) {
                contador++;
                movimiento.setEstatusMovimiento(estatusMovimiento);
            }
            if (contador == 1) {
                // Los dos botones de cada ButtonGroup están seleccionados
                 movimiento.setModificarTipoMovimiento(movimiento);
                JOptionPane.showMessageDialog(null, "Registro Modificado\n", 
                    "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
                int resultadoBitacora=0;
                clsBitacora bitacoraRegistro = new clsBitacora();
                resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
                llenadoDeTablas();
                limpiarTextos();
            } else {
                // No se cumple la condición de selección de dos botones
                JOptionPane.showMessageDialog(null, "Debe seleccionar un estatus.");
            }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTextos();
        habilitarBotones();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public void limpiarTextos()
    {
        txtbuscado.setText("");
        tipoEstatus.clearSelection();
        cbConcepto.setSelectedIndex(0);
            
    }
    public void habilitarBotones()
    {
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    public void desHabilitarBotones()
    {
        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\ayudas\\ProcesoMayor.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ayudas\\ProcesoMayor.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no Fue encontrada");
            }
            System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        llenadoDeTablas();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbCodigoMov;
    private javax.swing.JComboBox<String> cbConcepto;
    private javax.swing.JComboBox<String> cbIdCuenta;
    private javax.swing.JComboBox<String> cbNombreBanco;
    private javax.swing.JComboBox<String> cbNombreCliente;
    private javax.swing.JComboBox<String> cbTipoMoneda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.ButtonGroup tipoEstatus;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
