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
import streaming.entity.Pays;
import streaming.service.PaysService;

/**
 *
 * @author admin
 */
@Component
public class TableModelListePays extends DefaultTableModel {
    @Autowired
    PaysService paysService;
    private List<Pays> pays = null;
    private int nbPays = 0;

    public TableModelListePays() {
        setColumnIdentifiers(new String[]{"ID", "PAYS"});
        pays = paysService.listerTous();
        nbPays = pays.size();
    }

    @Override
    public int getRowCount() {
        return nbPays; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Pays> getPays() {
        return pays;
    }
    


    @Override
    public Object getValueAt(int row, int column) {
        Pays p = pays.get(row);
        if (column == 0) {
            return p.getId();
        }
        if (column == 1) {
            return p.getNom();
        }
        return "ERREUR";
    }

}
