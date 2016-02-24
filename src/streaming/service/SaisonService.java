/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SaisonDAO;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
@Service
public class SaisonService {
    @Autowired
    private SaisonDAO dao;

    public void ajouter(Saison sa) {
        dao.ajouter(sa);
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }

    public List<Saison> listerTous() {
        return dao.listerTous();
    }

    public Saison rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

}
