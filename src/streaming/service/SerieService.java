/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;
import streaming.exception.SynopsisNulOuVideException;

/**
 *
 * @author admin
 */
@Service
public class SerieService {
    
    @Autowired
    private SerieDAO dao;

    public void ajouter(Serie s) throws SynopsisNulOuVideException {
        if (s.getSysnopsis() == null || s.getSysnopsis() == " ") {
            throw new SynopsisNulOuVideException();
        }
        s.setSysnopsis(s.getSysnopsis().replaceAll("zut", "flute"));
        dao.ajouter(s);
    }

    public List<Serie> listerTous() {
        return dao.listerTous();
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }
    
    public Serie rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

    public List<Serie> rechercheParGenre(Long id) {
        return dao.rechercheParGenre(id);
    }

    public List<Serie> rechercheParPays(Long id) {
        return dao.rechercheParPays(id);
    }

}
