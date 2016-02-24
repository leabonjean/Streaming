/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.exception.SynopsisNulOuVideException;

/**
 *
 * @author admin
 */
@Service
public class FilmService {
    
    @Autowired
    private FilmDAO dao;

    public void ajouter(Film f) throws SynopsisNulOuVideException {
        if (f.getSynopsis() == null) {// || f.getSynopsis() == " ") {
            throw new SynopsisNulOuVideException();
        }
        f.setSynopsis(f.getSynopsis().replaceAll("zut", "flute"));
        dao.ajouter(f);
    }

    public List<Film> listerTous() {
        return dao.listerTous();
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }

    public Film rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

    public List<Film> rechercheParGenre(Long id) {
        return dao.rechercheParGenre(id);
    }

    public List<Film> rechercheParPays(Long id) {
        return dao.rechercheParPays(id);
    }

    public List<Film> rechercheParRealOuTitre(String s) {
        return dao.rechercheParRealOuTitre(s);
    }

}
