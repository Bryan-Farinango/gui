
package archivos01;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GUIArchivos01 extends javax.swing.JFrame {
   //Variables gloables
    ArrayList<Object>  materias = new ArrayList();
    ClsControlador control = new ClsControlador();
    
    public GUIArchivos01() {
        initComponents();
        
        llenarGrid();
        materias = control.extraerObjetos("materias.dat");
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMateria = new javax.swing.JPanel();
        textMateria = new javax.swing.JTextField();
        labelMateria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaterias = new javax.swing.JTable();
        buttonMateria = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMateria.setText("Materia:");

        tableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMaterias);

        buttonMateria.setText("Registrar");
        buttonMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMateriaActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 0, 51));
        labelTitulo.setText("¡Bienvenido!");

        javax.swing.GroupLayout panelMateriaLayout = new javax.swing.GroupLayout(panelMateria);
        panelMateria.setLayout(panelMateriaLayout);
        panelMateriaLayout.setHorizontalGroup(
            panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMateriaLayout.createSequentialGroup()
                        .addComponent(labelMateria)
                        .addGap(24, 24, 24)
                        .addGroup(panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMateria))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(96, 96, 96))
        );
        panelMateriaLayout.setVerticalGroup(
            panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo)
                .addGap(26, 26, 26)
                .addGroup(panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMateria))
                .addGap(40, 40, 40)
                .addComponent(buttonMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMateriaActionPerformed
        // TODO add your handling code here:
        System.out.println("registrando...");
        String materiaInscrita = textMateria.getText();
        Materias asignaturas = new Materias(materiaInscrita);
        materias.add(asignaturas);
        control.escribirObjeto("materias.dat", materias);
        materias = control.extraerObjetos("materias.dat");
        
        Object materiasG [] = {asignaturas.getNombre()};
        DefaultTableModel model = (DefaultTableModel) tableMaterias.getModel();
        model.addRow(materiasG);
        
    }//GEN-LAST:event_buttonMateriaActionPerformed

       public void llenarGrid(){
        if(materias.size() > 0){
            Materias est = new Materias();
            DefaultTableModel model = (DefaultTableModel) tableMaterias.getModel();
            for(int i = 0; i < materias.size(); i ++){
                est = (Materias) materias.get(i);
                Object materiasG [] = {est.getNombre()};
                model.insertRow(i, materiasG);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(GUIArchivos01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIArchivos01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIArchivos01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIArchivos01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIArchivos01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelMateria;
    private javax.swing.JTable tableMaterias;
    private javax.swing.JTextField textMateria;
    // End of variables declaration//GEN-END:variables
}
