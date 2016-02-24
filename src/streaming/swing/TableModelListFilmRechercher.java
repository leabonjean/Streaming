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
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class TableModelListFilmRechercher extends DefaultTableModel {

    private int nbFilm = 0;
    private List<Film> film = null;

    public List<Film> getFilm() {
        return film;
    }

    public TableModelListFilmRechercher(List l) {

        String[] titres = new String[]{"ID", "Année", "Titre"};
        setColumnIdentifiers(titres);

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        film = l;
        nbFilm = l.size();

    }

    public int getRowCount() {
        return nbFilm;
    }

    public Object getValueAt(int row, int column) {

        Film f = film.get(row);

        if (column == 0) {
            return f.getId();
        }
        if (column == 1) {
            return f.getAnnee();
        }
        if (column == 2) {
            return f.getTitre();
        }
        return "*** ERREUR ***";
    }
}
