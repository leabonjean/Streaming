/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
@Repository
public class FilmDAO {

    public void ajouter(Film f) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    public List<Film> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f FROM Film f").getResultList();
    }

    public Film rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Film.class, id);

    }
    
    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Film f WHERE f.id=" + id).executeUpdate();
        em.getTransaction().commit();
    }

    public List<Film> rechercheParGenre(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f.titre FROM Film f WHERE f.genreFilm.id="+id).getResultList();
    }

    public List<Film> rechercheParPays(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f.titre FROM Film f WHERE f.paysFilm.id="+id).getResultList();
    }

    public List<Film> rechercheParRealOuTitre(String s) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f.titre FROM Film f JOIN f.realisateurFilm r WHERE f.titre LIKE '%"+s+"%' OR r.nom LIKE '%"+s+"%'").getResultList();

    }

}
