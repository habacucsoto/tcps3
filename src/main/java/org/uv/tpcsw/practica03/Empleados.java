/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.tpcsw.practica03;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author tony
 */
public class Empleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
        cargarDepartamentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        bttGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JComboBox<>();
        bttModificar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        bttBuscarID = new javax.swing.JButton();
        bttBuscarTodos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaa = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        jLabel1.setFont(new java.awt.Font("Inter", 3, 24)); // NOI18N
        jLabel1.setText("Empleados");

        jLabel2.setText("Clave");

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        jLabel5.setText("Telefono");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        bttGuardar.setText("Guardar");
        bttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Departamento");

        txtDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        bttModificar.setText("Modificar");
        bttModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarActionPerformed(evt);
            }
        });

        bttEliminar.setText("Eliminar");
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        bttBuscarID.setText("Buscar_id");
        bttBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarIDActionPerformed(evt);
            }
        });

        bttBuscarTodos.setText("Buscar todos");
        bttBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarTodosActionPerformed(evt);
            }
        });

        txtAreaa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(txtAreaa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtNombre)
                                    .addComponent(txtClave))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bttModificar)
                                    .addComponent(bttGuardar)
                                    .addComponent(bttEliminar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarTodos)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bttBuscarID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttGuardar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bttModificar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(bttBuscarID)
                        .addGap(28, 28, 28)
                        .addComponent(bttBuscarTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed
 private void cargarDepartamentos() {
     
     txtDepartamento.removeAllItems();
     txtDepartamento.addItem("");
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            List<Departamento> departamentos = session.createQuery("from Departamento", Departamento.class).list();

            txtDepartamento.removeAllItems();

            for (Departamento depto : departamentos) {
                txtDepartamento.addItem(depto.getClave() + " - " + depto.getNombre());
            }

            session.close(); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar departamentos: " + e.getMessage());
        }
        txtDepartamento.setSelectedIndex(0);
    }
    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed

          try {
        Empleado empleado = new Empleado();
        
        empleado.setClave(Long.parseLong(txtClave.getText())); 
        empleado.setNombre(txtNombre.getText());
        empleado.setDireccion(txtDireccion.getText());
        empleado.setTelefono(txtTelefono.getText());
        
        String seleccionDepartamento = (String) txtDepartamento.getSelectedItem();
        
        if (seleccionDepartamento != null) {
            String claveDeptoStr = seleccionDepartamento.split(" - ")[0];
            long claveDepto = Long.parseLong(claveDeptoStr);
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            Departamento departamento = session.get(Departamento.class, claveDepto);
            
            if (departamento != null) {
                empleado.setDepto(departamento);
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            session.close();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un departamento.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(empleado); 
        transaction.commit(); 
        session.close(); 

        JOptionPane.showMessageDialog(this, "Empleado guardado con éxito.");
        
        txtClave.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtDepartamento.setSelectedIndex(0); 

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar empleado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed

        
        
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void bttModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarActionPerformed
        try {
        long claveEmpleado = Long.parseLong(txtClave.getText()); 
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Empleado empleado = session.get(Empleado.class, claveEmpleado); 

        if (empleado != null) {
            empleado.setNombre(txtNombre.getText());
            empleado.setDireccion(txtDireccion.getText());
            empleado.setTelefono(txtTelefono.getText());

            String seleccionDepartamento = (String) txtDepartamento.getSelectedItem();
            
            if (seleccionDepartamento != null) {
                String claveDeptoStr = seleccionDepartamento.split(" - ")[0];
                long claveDepto = Long.parseLong(claveDeptoStr);
                
                Departamento departamento = session.get(Departamento.class, claveDepto);
                
                if (departamento != null) {
                    empleado.setDepto(departamento);
                } else {
                    JOptionPane.showMessageDialog(this, "Departamento no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un departamento.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Transaction transaction = session.beginTransaction();
            session.update(empleado); 
            transaction.commit(); 

            JOptionPane.showMessageDialog(this, "Empleado modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un empleado con la clave proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        session.close(); 

        txtClave.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtDepartamento.setSelectedIndex(-1); 

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al modificar empleado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_bttModificarActionPerformed

    
    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed
        
        try {
        long claveEmpleado = Long.parseLong(txtClave.getText()); 
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Empleado empleado = session.get(Empleado.class, claveEmpleado); 

        if (empleado != null) {
            Transaction transaction = session.beginTransaction();
            session.delete(empleado); 
            transaction.commit(); 

            JOptionPane.showMessageDialog(this, "Empleado eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un empleado con la clave proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        session.close(); 

        txtClave.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtDepartamento.setSelectedIndex(-1); 

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar empleado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bttEliminarActionPerformed

    private void bttBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarIDActionPerformed
       try {
        long claveEmpleado = Long.parseLong(txtClave.getText()); 
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Empleado empleado = session.get(Empleado.class, claveEmpleado);

        String[] columnNames = {"Clave", "Nombre", "Dirección", "Teléfono", "Departamento"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        if (empleado != null) {
            Object[] rowData = {
                empleado.getClave(), 
                empleado.getNombre(), 
                empleado.getDireccion(), 
                empleado.getTelefono(), 
                empleado.getDepto() != null ? empleado.getDepto().getNombre() : "No asignado"
            };
            model.addRow(rowData);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un empleado con la clave proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        txtAreaa.setModel(model);

        session.close(); 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar empleado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_bttBuscarIDActionPerformed

    private void bttBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarTodosActionPerformed
        
         try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Empleado> empleados = session.createQuery("from Empleado", Empleado.class).list(); // Obtener todos los empleados

        String[] columnNames = {"Clave", "Nombre", "Dirección", "Teléfono", "Departamento"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Empleado empleado : empleados) {
            Object[] rowData = {
                empleado.getClave(), 
                empleado.getNombre(), 
                empleado.getDireccion(), 
                empleado.getTelefono(), 
                empleado.getDepto() != null ? empleado.getDepto().getNombre() : "No asignado"
            };
            model.addRow(rowData);
        }

        txtAreaa.setModel(model);

        session.close(); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al mostrar empleados: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
       
    }//GEN-LAST:event_bttBuscarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttBuscarID;
    private javax.swing.JButton bttBuscarTodos;
    private javax.swing.JButton bttEliminar;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JButton bttModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable txtAreaa;
    private javax.swing.JTextField txtClave;
    private javax.swing.JComboBox<String> txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
