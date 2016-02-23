/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class JFramePrincipale extends javax.swing.JFrame {
    JPanel jpCentral = null;
    
    public void supprimerPanneau(){
        if (jpCentral == null){
            return;
        }
        this.remove(jpCentral);
 
    }
    /**
     * Creates new form JFramePrincipale
     */
    public JFramePrincipale() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jbFilm = new javax.swing.JButton();
        jbSerie = new javax.swing.JButton();
        jbSaison = new javax.swing.JButton();
        jbEpisode = new javax.swing.JButton();
        jbLien = new javax.swing.JButton();
        jbPays = new javax.swing.JButton();
        jbRealisateur = new javax.swing.JButton();
        jbGenre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jbFilm.setText("Film");
        jbFilm.setFocusable(false);
        jbFilm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbFilm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFilmActionPerformed(evt);
            }
        });
        jToolBar1.add(jbFilm);

        jbSerie.setText("Séries");
        jbSerie.setFocusable(false);
        jbSerie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSerie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSerieActionPerformed(evt);
            }
        });
        jToolBar1.add(jbSerie);

        jbSaison.setText("Saison");
        jbSaison.setFocusable(false);
        jbSaison.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSaison.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSaison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaisonActionPerformed(evt);
            }
        });
        jToolBar1.add(jbSaison);

        jbEpisode.setText("Episode");
        jbEpisode.setFocusable(false);
        jbEpisode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEpisode.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbEpisode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEpisodeActionPerformed(evt);
            }
        });
        jToolBar1.add(jbEpisode);

        jbLien.setText("Liens");
        jbLien.setFocusable(false);
        jbLien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbLien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLienActionPerformed(evt);
            }
        });
        jToolBar1.add(jbLien);

        jbPays.setText("Pays");
        jbPays.setFocusable(false);
        jbPays.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPays.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaysActionPerformed(evt);
            }
        });
        jToolBar1.add(jbPays);

        jbRealisateur.setText("Réalisateur");
        jbRealisateur.setFocusable(false);
        jbRealisateur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRealisateur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbRealisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealisateurActionPerformed(evt);
            }
        });
        jToolBar1.add(jbRealisateur);

        jbGenre.setText("Genre");
        jbGenre.setFocusable(false);
        jbGenre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbGenre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenreActionPerformed(evt);
            }
        });
        jToolBar1.add(jbGenre);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFilmActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelOptionFilm();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbFilmActionPerformed

    private void jbSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSerieActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelOptionSerie();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbSerieActionPerformed

    private void jbSaisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaisonActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelListSaison();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbSaisonActionPerformed

    private void jbEpisodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEpisodeActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelListeEpisode();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbEpisodeActionPerformed

    private void jbLienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLienActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelListeLien();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbLienActionPerformed

    private void jbPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaysActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelListePays();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbPaysActionPerformed

    private void jbRealisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealisateurActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelListeRealisateur();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbRealisateurActionPerformed

    private void jbGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenreActionPerformed
        supprimerPanneau();
        jpCentral = new JPanelListeGenre();
        add(jpCentral, BorderLayout.CENTER);
    }//GEN-LAST:event_jbGenreActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbEpisode;
    private javax.swing.JButton jbFilm;
    private javax.swing.JButton jbGenre;
    private javax.swing.JButton jbLien;
    private javax.swing.JButton jbPays;
    private javax.swing.JButton jbRealisateur;
    private javax.swing.JButton jbSaison;
    private javax.swing.JButton jbSerie;
    // End of variables declaration//GEN-END:variables
}
