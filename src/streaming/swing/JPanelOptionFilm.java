/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
@Component
public class JPanelOptionFilm extends javax.swing.JPanel {

    @Autowired
    private FilmService fs;
    @Autowired
    private GenreService gs;
    @Autowired
    private PaysService ps;
    private List<Pays> lp = null;
    private List<Genre> lg = null;
    JTable jtFilm2 = null;
    @Autowired
    JDialogFilmAjouter jDialogFilmAjouter;
    @Autowired
    TableModelListFilm tableModelListFilm;

    public void supprimerPanneau() {
        if (jtFilm2 == null) {
            return;
        }
        this.remove(jtFilm2);

    }

    public void rafraichir() {
        lp = ps.listerTous();
        lg = gs.listerTous();
                
        jComboBox2.removeAllItems();
        jComboBox1.removeAllItems();
        for (Genre g : lg) {
            jComboBox1.addItem(g.getNom());
        }
        for (Pays p : lp) {
            jComboBox2.addItem(p.getNom());
        }
    }

    public JPanelOptionFilm() {
        initComponents();
//        rafraichitJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFilm = new javax.swing.JTable();

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

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar2.setRollover(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jToolBar2.add(jComboBox1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jToolBar2.add(jComboBox2);

        jTextField1.setText("Titre Film");
        jToolBar2.add(jTextField1);

        jButton3.setText("Rechercher");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton3);

        jPanel1.add(jToolBar2, java.awt.BorderLayout.NORTH);

        jtFilm.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtFilm);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void rafraichitJTable() {
        tableModelListFilm.initialiser();
        jtFilm.setModel(tableModelListFilm);
//        initialiserComboBox();
        rafraichir();
        jtFilm.repaint();

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialogFilmAjouter.rafraichir();
        jDialogFilmAjouter.setJpListeFilm(this);
        jDialogFilmAjouter.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = jtFilm.getSelectedRow();
        if (i == -1) {
            return;
        }

        TableModelListFilm model = (TableModelListFilm) jtFilm.getModel();
        Film f = model.getFilm().get(i);
        fs.supprimer(f.getId());
        this.rafraichitJTable();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Film f = new Film();
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        int i = jComboBox1.getSelectedIndex();
        int j = jComboBox2.getSelectedIndex();
        String ge = lg.get(i).getNom();
        String pa = lp.get(j).getNom();
        String s = jTextField1.getText();
        List<Film> liste = em.createQuery("SELECT f FROM Film f JOIN f.genreFilm g JOIN f.paysFilm p WHERE g.nom='ge' OR p.nom='pa' OR f.titre='s'").getResultList();
        supprimerPanneau();
//        jtFilm.setModel(new Tabl eModelListFilmRechercher(liste));
//        add(jtFilm, BorderLayout.CENTER);
    }//GEN-LAST:event_jButton3ActionPerformed
//    private void initialiserComboBox() {
//        jComboBox2.removeAllItems();
//        jComboBox1.removeAllItems();
//        for (Genre g : lg) {
//            jComboBox1.addItem(g.getNom());
//        }
//        for (Pays p : lp) {
//            jComboBox2.addItem(p.getNom());
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable jtFilm;
    // End of variables declaration//GEN-END:variables
}
