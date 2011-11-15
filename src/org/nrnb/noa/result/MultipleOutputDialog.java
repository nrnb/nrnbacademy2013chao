/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SingleOutputDialog.java
 *
 * Created on Sep 19, 2011, 10:00:30 AM
 */

package org.nrnb.noa.result;

/**
 *
 * @author Chao
 */
public class MultipleOutputDialog extends javax.swing.JDialog {

    /** Creates new form SingleOutputDialog */
    public MultipleOutputDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Save results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("GO to Mosaic");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Network1", "GO:0022402 ", "BP", "1.2E-9", "cell cycle process ", "S000001592; S000006308; S000001595; S000000444; S000006010; S000006269; S000000735"},
                {"Network1", "GO:0000785 ", "CC", "8.9E-45 ", "chromatin ", "S000006308; S000001595; S000000444; S000006010; S000000735"},
                {"Network1", "GO:0044427", "MF", "8.9E-45 ", "CCAAT-binding factor complex", "S000001742; S000000842; S000001545; S000006169; S000004640; S000006151"},
                {"Network2", "GO:0006357 ", "BP", "2.7E-9", "regulation of transcription from RNA polymerase II promoter ", "S000001595; S000000444; S000006010; S000006269; S000000735"},
                {"Network2", "GO:0000790", "CC", "4.8E-43", "nuclear chromatin ", "S000001592; S000006308; S000001595; S000000444; S000006010"},
                {"Network2", "GO:0044428", "MF", "3.6E-41", "transcription factor complex ", "S000005449; S000006098; S000005428; S000000199; S000005258; S000003134"},
                {"Network3", "GO:0045944 ", "BP", "4.3E-9", "positive regulation of transcription from RNA polymerase II promoter ", "S000001592; S000006308; S000001595; S000000444; S000006010; S000006269"},
                {"Network3", "GO:0044454 ", "CC", "3.4E-38", "nuclear chromosome part", "S000006308; S000001595; S000006269; S000000735; S000004674; S000005160"},
                {"Network3", "GO:0044422", "MF", "2.4E-4", "nucleoplasm part ", "S000000571; S000000636"}
            },
            new String [] {
                "Network ID", "Top GO ID", "Type", "P-value", "Desciption", "Associated genes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(1).setMinWidth(70);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(70);
        jTable1.getColumnModel().getColumn(2).setMinWidth(40);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(40);
        jTable1.getColumnModel().getColumn(3).setMinWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MultipleOutputDialog dialog = new MultipleOutputDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}