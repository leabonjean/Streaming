/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.xml.ws.ServiceMode;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class DataBaseService {

    
    
    
 

    public void supprimerTout() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Lien l").executeUpdate();
        em.createQuery("DELETE FROM Episode e").executeUpdate();
        em.createQuery("DELETE FROM Saison s").executeUpdate();
        em.createQuery("DELETE FROM Serie se").executeUpdate();
        em.createQuery("DELETE FROM Film f").executeUpdate();
        em.createQuery("DELETE FROM Realisateur r").executeUpdate();
        em.createQuery("DELETE FROM Pays p").executeUpdate();
        em.createQuery("DELETE FROM Genre g").executeUpdate();
        em.getTransaction().commit();
    }
}
