/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Film;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class TableModelListFilm extends DefaultTableModel {
    
    private List<Film> film = null;
    private int nbFilm = 0;

    public List<Film> getFilm() {
        return film;
    }
    
    
    
    public TableModelListFilm () {
        
        String [] titres = new String []{"ID","Année","Titre"}; 
        setColumnIdentifiers(titres);
        
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        film = em.createQuery("SELECT f FROM Film f").getResultList();
        nbFilm = film.size();
        
    }


//    @Override
    public int getRowCount() {
        return nbFilm;
    }

    
//    @Override
    public Object getValueAt(int row, int column) {
        
        Film f = film.get(row);
        
        if(column==0)
            return f.getId();
        if(column==1)
            return f.getAnnee();
        if (column==2)
            return f.getTitre();
        return "*** ERREUR ***";
    }
    
}
