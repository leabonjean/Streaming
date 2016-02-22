/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;
import streaming.exception.SynopsisNulOuVideException;

/**
 *
 * @author admin
 */
public class FilmService {

    private FilmDAO dao = new FilmDAO();

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

    public Film rechercherParId(long id) {
        return dao.rechercherParId(id);
    }

    public List<Film> rechercheParGenre(String s) {
        return dao.rechercheParGenre(s);
    }

    public List<Film> rechercheParPays(String s) {
        return dao.rechercheParPays(s);
    }

    public List<Film> rechercheParRealOuTitre(String s) {
        return dao.rechercheParRealOuTitre(s);
    }

}
