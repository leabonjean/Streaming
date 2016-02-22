/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SaisonDAO;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public class SaisonService {
            private SaisonDAO dao = new SaisonDAO();
    
    public void ajouter(Saison s){
        dao.ajouter(s);
    }
        public List<Saison> listerTous(){
        return dao.listerTous();
    }
    
    public Saison rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    
}
