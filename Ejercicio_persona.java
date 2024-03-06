package matriz;

import javax.swing.JOptionPane;
public class Ejercicio_persona extends javax.swing.JFrame {
    public Ejercicio_persona() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTF_nombre = new javax.swing.JTextField();
        JTF_cedula = new javax.swing.JTextField();
        JTF_estatura = new javax.swing.JTextField();
        JTF_edad = new javax.swing.JTextField();
        JB_agregarPersona = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_arregloPersona = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JCB_metodoOrdenamiento = new javax.swing.JComboBox<>();
        JCB_parametroOrdenamiento = new javax.swing.JComboBox<>();
        JB_ordenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfaz PERSONA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Insercion Persona"));

        JTF_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        JTF_cedula.setBorder(javax.swing.BorderFactory.createTitledBorder("Cedula"));
        JTF_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_cedulaActionPerformed(evt);
            }
        });

        JTF_estatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Estatura"));
        JTF_estatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_estaturaActionPerformed(evt);
            }
        });

        JTF_edad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        JTF_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_edadActionPerformed(evt);
            }
        });

        JB_agregarPersona.setText("Agregar Persona");
        JB_agregarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_agregarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(JTF_estatura)
                            .addGap(18, 18, 18)
                            .addComponent(JTF_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(JTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTF_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JB_agregarPersona))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_agregarPersona)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JT_arregloPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Estatura", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JT_arregloPersona);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo Ordenamiento"));

        JCB_metodoOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MergeSort", "Burbuja" }));
        JCB_metodoOrdenamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo Ordenamiento"));

        JCB_parametroOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estatura", "Edad" }));
        JCB_parametroOrdenamiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametro a Ordenar"));

        JB_ordenar.setText("Ordenar Personas");
        JB_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCB_parametroOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_metodoOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_ordenar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JCB_metodoOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCB_parametroOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_ordenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_cedulaActionPerformed

    }//GEN-LAST:event_JTF_cedulaActionPerformed

    private void JTF_estaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_estaturaActionPerformed

    }//GEN-LAST:event_JTF_estaturaActionPerformed

    private void JTF_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_edadActionPerformed

    }//GEN-LAST:event_JTF_edadActionPerformed

    private void JB_agregarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_agregarPersonaActionPerformed
 
        codigo C = new codigo();
        if (C.validaNumeros(JTF_cedula.getText(), JTF_edad.getText(), JTF_estatura.getText())) {
            JT_arregloPersona.setModel(C.agregarPersona(JT_arregloPersona.getModel(), JTF_cedula.getText(), JTF_nombre.getText(), JTF_edad.getText(), JTF_estatura.getText()));
            JTF_cedula.setText("");
            JTF_edad.setText("");
            JTF_estatura.setText("");
            JTF_nombre.setText("");
            JTF_nombre.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Uno de los parametros esta mal ingresado\nIngrese nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JB_agregarPersonaActionPerformed

    private void JB_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ordenarActionPerformed
        codigo C = new codigo();
        JT_arregloPersona.setModel(C.ordenarPersona(JT_arregloPersona.getModel(), JCB_metodoOrdenamiento.getSelectedIndex(), JCB_parametroOrdenamiento.getSelectedIndex()));
    }//GEN-LAST:event_JB_ordenarActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio_persona().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_agregarPersona;
    private javax.swing.JButton JB_ordenar;
    private javax.swing.JComboBox<String> JCB_metodoOrdenamiento;
    private javax.swing.JComboBox<String> JCB_parametroOrdenamiento;
    private javax.swing.JTextField JTF_cedula;
    private javax.swing.JTextField JTF_edad;
    private javax.swing.JTextField JTF_estatura;
    private javax.swing.JTextField JTF_nombre;
    private javax.swing.JTable JT_arregloPersona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
