/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class TableModelListRealisateur extends DefaultTableModel {
    
    private List<Realisateur> realisateur = null;
    private int nbRealisateur = 0;

    public List<Realisateur> getRealisateur() {
        return realisateur;
    }

    public TableModelListRealisateur() {

        String[] titres = new String[]{"ID", "Nom du Réalisateur","Prénom du Réalisateur"};
        setColumnIdentifiers(titres);

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        realisateur = em.createQuery("SELECT r FROM Realisateur r").getResultList();
        nbRealisateur = realisateur.size();

    }

    @Override
    public int getRowCount() {
        return nbRealisateur;
    }

    @Override
    public Object getValueAt(int row, int column) {

        Realisateur r = realisateur.get(row);

        if (column == 0) {
            return r.getId();
        }
        if (column == 1) {
            return r.getPrenom();
        }
        if (column == 2) {
            return r.getNom();
        }
        return "*** ERREUR ***";
    }

}
