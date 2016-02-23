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
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */


public class TableModelListeSerie extends DefaultTableModel{
    
    private List<Serie> serie = null;
    private int nbSerie = 0;
    private SerieService serieService = new SerieService();
    public TableModelListeSerie(){
        
        setColumnIdentifiers(new String[] {"ID", "TITRE", "SYNOPSIS"});
        
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
