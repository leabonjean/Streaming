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
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class TableModelListGenre extends DefaultTableModel {

    private List<Genre> genre = null;
    private int nbGenre = 0;

    public List<Genre> getGenre() {
        return genre;
    }

    public TableModelListGenre() {

        String[] titres = new String[]{"ID", "Nom du Genre"};
        setColumnIdentifiers(titres);

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        genre = em.createQuery("SELECT g FROM Genre g").getResultList();
        nbGenre = genre.size();

    }

    @Override
    public int getRowCount() {
        return nbGenre;
    }

    @Override
    public Object getValueAt(int row, int column) {

        Genre g = genre.get(row);

        if (column == 0) {
            return g.getId();
        }
        if (column == 1) {
            return g.getNom();
        }
        return "*** ERREUR ***";
    }

}
