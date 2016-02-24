/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public class SaisonDAO {
        public void ajouter(Saison s) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
        
        public void supprimer(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Saison sa WHERE sa.id="+id).executeUpdate();
        em.getTransaction().commit();
    }

    public List<Saison> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT s FROM Saison s").getResultList();
    }

    public Saison rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Saison.class, id);

    }
    
}
