/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {

    private FilmDAO dao = new FilmDAO();

    public void ajouter(Film f) {
        dao.ajouter(f);
    }

    public List<Film> listerTous() {
        return dao.listerTous();
    }

    public Film rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

}
