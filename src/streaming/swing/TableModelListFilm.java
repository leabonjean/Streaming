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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListFilm extends DefaultTableModel {
    
    @Autowired
    private FilmService filmService;
    
    private List<Film> film = null;
    private int nbFilm = 0;

    public List<Film> getFilm() {
        return film;
    }
    
    
    
    public TableModelListFilm () {
        
        String [] titres = new String []{"ID","Année","Titre"}; 
        setColumnIdentifiers(titres);
        
        filmService.listerTous();
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
