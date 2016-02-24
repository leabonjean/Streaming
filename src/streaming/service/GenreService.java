/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
@Service
public class GenreService {

    @Autowired
    private GenreDAO dao;

    public void ajouter(Genre g) {
        dao.ajouter(g);
    }

    public List<Genre> listerTous() {
        return dao.listerTous();
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }

    public Genre rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

}
