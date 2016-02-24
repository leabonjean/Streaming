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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */

@Component
public class TableModelListeSerie extends DefaultTableModel{
    
    @Autowired
    private SerieService serieService;
    
    private List<Serie> serie = null;
    private int nbSerie = 0;
    
    
    public TableModelListeSerie(){
        
        setColumnIdentifiers(new String[] {"ID", "TITRE", "SYNOPSYS"});
        serie = serieService.listerTous();
        nbSerie = serie.size();
    }

    @Override
    public int getRowCount() {
        return nbSerie;
    }
    
    public List<Serie> getSerie(){
        return serie;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Serie s = serie.get(row);
        if (column == 0 ){
            return s.getId();
        }
        if (column == 1){
            return s.getTitre();
        }
        if (column == 2){
            return s.getSysnopsis();
        }
        return "ERREUR";
    }
    
    
    
}
