/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class JPanelListeRealisateur extends javax.swing.JPanel {

    /**
     * Creates new form JPanelRealisateur
     */
    public void rafraichitJTable() {
        jtReal.setModel(new TableModelListRealisateur());
        jtReal.repaint();
    }

    public JPanelListeRealisateur() {
        initComponents();
        rafraichitJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReal = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jButton1.setText("Ajouter");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Supprimer");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        jtReal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtReal);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new JDialogRealisateur(null, true, this).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          int i = jtReal.getSelectedRow();
    if (i==-1)
        return;
    
    
    
    TableModelListRealisateur m = (TableModelListRealisateur) jtReal.getModel();
    Realisateur r = m.getRealisateur().get(i);
    
    EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
    
    em.getTransaction().begin();
    Realisateur r2 = em.find(Realisateur.class,r.getId());
    
    em.remove(r2);
    
    
    //ou em.createQuery("DELETE FROM Pays p WHERE p.id"+ p.getId()).executeUpdate();
    em.getTransaction().commit();

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtReal;
    // End of variables declaration//GEN-END:variables
}
