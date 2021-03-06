/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4carlosvelasquez11641405;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imado
 */
public class MenuCliente extends javax.swing.JFrame {

    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
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

        jdImprimirFactura = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taFactura = new javax.swing.JTextArea();
        btGuardarArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCarrito = new javax.swing.JTable();
        cbProducto = new javax.swing.JComboBox<>();
        btAñadirCarrito = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        btFacturar = new javax.swing.JButton();
        btLimpiarCarrito = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Factura");

        taFactura.setColumns(20);
        taFactura.setRows(5);
        jScrollPane3.setViewportView(taFactura);

        btGuardarArchivo.setText("Guardar Factura a Archivo");
        btGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdImprimirFacturaLayout = new javax.swing.GroupLayout(jdImprimirFactura.getContentPane());
        jdImprimirFactura.getContentPane().setLayout(jdImprimirFacturaLayout);
        jdImprimirFacturaLayout.setHorizontalGroup(
            jdImprimirFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdImprimirFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdImprimirFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jdImprimirFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdImprimirFacturaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btGuardarArchivo)))
                .addContainerGap())
        );
        jdImprimirFacturaLayout.setVerticalGroup(
            jdImprimirFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdImprimirFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btGuardarArchivo)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menú de Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Disponibles"));

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoría", "Precio", "Descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrito de Compras"));

        jtCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoría", "Precio", "Descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCarrito);

        cbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductoActionPerformed(evt);
            }
        });

        btAñadirCarrito.setText("Añadir al Carrito");
        btAñadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAñadirCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAñadirCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAñadirCarrito))
                .addContainerGap())
        );

        btCerrarSesion.setText("Cerrar Sesión");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });

        btFacturar.setText("Pagar y Generar Factura");
        btFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFacturarActionPerformed(evt);
            }
        });

        btLimpiarCarrito.setText("Limpiar Carrito y Recargar Productos");
        btLimpiarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarCarritoActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCerrarSesion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpiarCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFacturar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCerrarSesion)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFacturar)
                    .addComponent(btLimpiarCarrito))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProductoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        refrescarTablas();
    }//GEN-LAST:event_formFocusGained

    private void btLimpiarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarCarritoActionPerformed
        while(Main.clienteActual.getProductos().size() > 0){
            Main.clienteActual.getProductos().remove(0);
        }
        
        /*DefaultTableModel m = (DefaultTableModel) jtProductos.getModel();
        jtCarrito.setModel(m);
        
        while (m.getRowCount() > 0){
            m.removeRow(0);
        }
        
        for (Producto p : Main.productos) {
            m.addRow(new Object[]{p.getNombre(), p.getCategoria(), p.getPrecio(), p.getDescuento()});
        }
        
        jtProductos.setModel(m);
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        
        for (Producto p : Main.productos) {
            cbm.addElement(p);
        }
        
        cbProducto.setModel(cbm);*/
        refrescarTablas();
    }//GEN-LAST:event_btLimpiarCarritoActionPerformed

    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        this.dispose();
        Inicio.main(new String[1]);
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btAñadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAñadirCarritoActionPerformed
        Producto p = (Producto) cbProducto.getSelectedItem();
        Main.clienteActual.getProductos().add(p);
        refrescarTablas();
    }//GEN-LAST:event_btAñadirCarritoActionPerformed

    private void btFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFacturarActionPerformed
        if (Main.clienteActual.getProductos().size() > 0) {
            for (Producto p : Main.clienteActual.getProductos()) {
                Main.productos.remove(p);
            }

            Factura f = new Factura(Main.clienteActual);
            taFactura.setText(f.generarFactura());
            Main.ganancias += f.getTotal();
            correr(jdImprimirFactura);
        }else{
            JOptionPane.showMessageDialog(this, "Su carrito está vacío", "Error", 0);
        }
        refrescarTablas();
    }//GEN-LAST:event_btFacturarActionPerformed

    private void btGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarArchivoActionPerformed
        FileWriter fw = null;
        BufferedWriter bw = null;
        File file = null;
        
        try {
            file = new File("./Factura_" + Main.clienteActual.getNombre() + ".txt");

            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);
            
            bw.write(taFactura.getText());
            bw.flush();
            bw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(jdImprimirFactura, "Factura guardada exitosamente");
            jdImprimirFactura.dispose();
            refrescarTablas();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btGuardarArchivoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refrescarTablas();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuCliente w = new MenuCliente();
                w.setLocationRelativeTo(null);
                w.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAñadirCarrito;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btFacturar;
    private javax.swing.JButton btGuardarArchivo;
    private javax.swing.JButton btLimpiarCarrito;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jdImprimirFactura;
    private javax.swing.JTable jtCarrito;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextArea taFactura;
    // End of variables declaration//GEN-END:variables

    private void refrescarTablas() {
        DefaultTableModel m = (DefaultTableModel) jtProductos.getModel();
        DefaultTableModel m2 = (DefaultTableModel) jtCarrito.getModel();
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        
        while (m.getRowCount() > 0){
            m.removeRow(0);
        }
        
        while (m2.getRowCount() > 0){
            m2.removeRow(0);
        }
        
        for (Producto p : Main.productos) {
            if (Main.clienteActual.getProductos().contains(p)) {
                m2.addRow(new Object[]{p.getNombre(), p.getCategoria(), p.getPrecio(), p.getDescuento()});
            }else{
                m.addRow(new Object[]{p.getNombre(), p.getCategoria(), p.getPrecio(), p.getDescuento()});
                cbm.addElement(p);
            }
            
        }
        
        jtProductos.setModel(m);
        jtCarrito.setModel(m2);        
        cbProducto.setModel(cbm);
    }
    
    private void correr(JDialog jd) {
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setModal(true);
        jd.setVisible(true);
    }
}
