/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.swing;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Saison;
import streaming.entity.Serie;
import streaming.service.SaisonService;

/**
 *
 * @author admin
 */
public class TableModelListeSaison  extends DefaultTableModel{
    @Autowired
    private SaisonService saisonService;
    
    public List<Saison> saison = null;
    private int nbSaison = 0;
    
    public TableModelListeSaison(){
        setColumnIdentifiers(new String[]{"ID", "ANNEE", "NUMERO SAISON"});
        saison = saisonService.listerTous();
        nbSaison = saison.size();
                
    }

    @Override
    public int getRowCount() {
        return nbSaison;
    }
    
    public List<Saison> getSaison(){
        return saison;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Saison sa = saison.get(row);
        if (column == 0 ){
            return sa.getId();
        }
        if (column == 1){
            return sa.getAnnee();
        }
        if (column == 2){
            return sa.getNumSaison();
        }
        return "ERREUR";
    }
}
