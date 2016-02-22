
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import streaming.animal.Animal;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class PaysTest {

    @BeforeClass
    public static void avantClasse(){
        
           
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
          
        em.getTransaction().begin();
        
        //vide toutes les tables
        em.createQuery("DELETE FROM Genre g").executeUpdate();
        em.createQuery("DELETE FROM Pays p").executeUpdate();
        em.createQuery("DELETE FROM Realisateur r").executeUpdate();
        em.createQuery("DELETE FROM Film f").executeUpdate();
       
        //Ajouter un pays
        Genre g1 = new Genre();
        Genre g2 = new Genre();
        Genre g3 = new Genre();
        
        g1.setNom("Animé");
        g1.setId(1L);
        em.persist(g1); //Genere un insert
        
        g2.setNom("Action");
        g2.setId(2L);
        em.persist(g2);
        
        g3.setNom("SF");
        g3.setId(3L);
        em.persist(g3);
        
        
        Pays p1 = new Pays();
        Pays p2 = new Pays();
        Pays p3 = new Pays();
        
        p1.setNom("France");
        p1.setId(1L);
        em.persist(p1); //Genere un insert
        
        p2.setNom("USA");
        p2.setId(2L);
        em.persist(p2);
        
        p3.setNom("Espagne");
        p3.setId(3L);
        em.persist(p3);
        
                
        Realisateur r1 = new Realisateur();
        Realisateur r2 = new Realisateur();
        Realisateur r3 = new Realisateur();
        
        r1.setNom("Tarantino");
        r1.setPrenom("Quentin");
        r1.setId(1L);
        em.persist(r1); //Genere un insert
        
        r2.setNom("Lucas");
        r2.setPrenom("Georges");
        r2.setId(2L);
        em.persist(r2);
        
        r3.setNom("Almadovar");
        r3.setPrenom("Pedro");
        r3.setId(3L);
        em.persist(r3);
        
        
        
        em.getTransaction().commit();
        
    }
    
    //@Test
    public void testTab(){
        
        int[] monTab = new int[10];
        
        for(int i=0;i<monTab.length;i++){
            monTab[i]=(i+1)*2;
            System.out.print(monTab[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
//        monTab[0]=1;
//        monTab[1]=2;
//        monTab[2]=3;
    }
    //@Test
    public void testClient(){
      //  Long l1= null;
      //  Long l2= 123L; //ou = new Long(123)
      
//        byte b = 127;
//        short s = 32000;
//        int i = 400000000;
//        long l = 4000000000000L;
//    

//        System.out.println(c.clientToString());
        
            
        
    }
    
   //@Test
   public void verifNbTotalPaysEgale3(){ 
       
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        Query query = em.createQuery("SELECT p FROM Pays p");
//        List<Pays> l = query.getResultList();
//        if(l.size()==3){
//            System.out.println("ok");
//        }
//        else{
//            System.out.println("pas ok");
//        }
        //System.out.println(l.size());
        int n = em.createQuery("SELECT p FROM Pays p").getResultList().size();
   //     Assert.assertEquals(3,n);
        Assert.assertTrue("blabla",n==3);
   }
   
   //@Test
   public void testTarantinoId(){
          
       EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
       Realisateur r = (Realisateur) em.createQuery("SELECT r FROM Realisateur r WHERE r.nom='Tarantino'").getSingleResult();
       
       Assert.assertEquals(1L,(long) r.getId());
       
      
       
   }
   
//   @Test
//   public void test1(){
//       Animal a = new Animal();
//   }
}
