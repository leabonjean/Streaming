/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.PaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
@Service
public class PaysService {

    @Autowired
    private PaysDAO dao;

    public void ajouter(Pays p) {
        dao.ajouter(p);
    }

    public List<Pays> listerTous() {
        return dao.listerTous();
    }

    public void supprimer(long id) {
        dao.supprimer(id);
    }

    public Pays rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

}
