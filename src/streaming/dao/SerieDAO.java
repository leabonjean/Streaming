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
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
@Repository
public class SerieDAO {

    public void ajouter(Serie s) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    public List<Serie> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT s FROM Serie s").getResultList();
    }

    public Serie rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Serie.class, id);

    }
    
    public void supprimer(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Serie s WHERE s.id="+id).executeUpdate();
        em.getTransaction().commit();
    }

    public List<Serie> rechercheParGenre(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f.titre FROM Film f WHERE f.genreFilm.id=" + id).getResultList();
    }

    public List<Serie> rechercheParPays(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT f.titre FROM Film f WHERE f.paysFilm.id=" + id).getResultList();
    }

    public List<Serie> rechercheParTitre(String s) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT s.titre FROM Serie s WHERE s.titre LIKE '%" + s + "%'").getResultList();

    }
}
