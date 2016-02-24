/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.RealisateurDAO;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
@Service
public class RealisateurService {
    
    @Autowired
    private RealisateurDAO dao;

    public void ajouter(Realisateur r) {
        dao.ajouter(r);
    }

    public List<Realisateur> listerTous() {
        return dao.listerTous();
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }

    public Realisateur rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

}
