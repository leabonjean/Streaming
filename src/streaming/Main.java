/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
               
//        Query query = em.createQuery("SELECT r FROM Realisateur r where r.prenom='Quentin'");
//        List<Realisateur> l = query.getResultList();
//// 
//        for(int i=0; i<l.size() ; i++){
//            Realisateur r = l.get(i);     
//            System.out.println(r.getPrenom()+" "+r.getNom());
//        }
        Query query = em.createQuery("SELECT g FROM Genre g where g.nom<>'SF'");
        List<Genre> l = query.getResultList();
// 
        for(int i=0; i<l.size() ; i++){
            Genre g = l.get(i);     
            System.out.println(g.getNom());
        }
        
//        int i=0;
//        do{
//            Pays p = l.get(i);
//            System.out.println(p.getNom());
//            i++;
//        } while(i<l.size());

//        for(Pays p : l){
//            
//            System.err.println(p.getNom());
//        }
        
        
//        em.getTransaction().begin();
//        
////        //Ajouter un pays
//        Genre g1 = new Genre();
//        Genre g2 = new Genre();
//        Genre g3 = new Genre();
//        
//        g1.setNom("Animé");
//        g1.setId(1L);
//        em.persist(g1); //Genere un insert
//        
//        g2.setNom("Action");
//        g2.setId(2L);
//        em.persist(g2);
//        
//        g3.setNom("SF");
//        g3.setId(3L);
//        em.persist(g3);
//        
//        
//        Pays p1 = new Pays();
//        Pays p2 = new Pays();
//        Pays p3 = new Pays();
//        
//        p1.setNom("France");
//        p1.setId(1L);
//        em.persist(p1); //Genere un insert
//        
//        p2.setNom("USA");
//        p2.setId(2L);
//        em.persist(p2);
//        
//        p3.setNom("Espagne");
//        p3.setId(3L);
//        em.persist(p3);
//        
//        
//        Realisateur r1 = new Realisateur();
//        Realisateur r2 = new Realisateur();
//        Realisateur r3 = new Realisateur();
//        
//        r1.setNom("Tarantino");
//        r1.setPrenom("Quentin");
//        r1.setId(1L);
//        em.persist(r1); //Genere un insert
//        
//        r2.setNom("Lucas");
//        r2.setPrenom("Georges");
//        r2.setId(2L);
//        em.persist(r2);
//        
//        r3.setNom("Almadovar");
//        r3.setPrenom("Pedro");
//        r3.setId(3L);
//        em.persist(r3);
//        
//        
//        
//        em.getTransaction().commit();
        
        
    }
    
}
