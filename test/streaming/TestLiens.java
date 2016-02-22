/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;
import streaming.entity.Serie;
import streaming.exception.SynopsisNulOuVideException;
import streaming.service.DataBaseService;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.PaysService;
import streaming.service.RealisateurService;

/**
 *
 * @author admin
 */
public class TestLiens {

    DataBaseService DataService = new DataBaseService();
    FilmService filmService = new FilmService();
    GenreService genreService = new GenreService();
    RealisateurService realisateurService = new RealisateurService();
    PaysService paysService = new PaysService();

    @Before
    public void init() throws SynopsisNulOuVideException {
        DataService.supprimerTout();
        Genre g = new Genre(1L, "Action");
        Genre g1 = new Genre(2L, "Fantastique");
        Genre g2 = new Genre(3L, "Policier");
        Genre g3 = new Genre(4L, "Romance");
        Genre g4 = new Genre(5L, "Animation");
        Genre g5 = new Genre(6L, "Comédie");
        genreService.ajouter(g);
        genreService.ajouter(g1);
        genreService.ajouter(g2);
        genreService.ajouter(g3);
        genreService.ajouter(g4);
        genreService.ajouter(g5);

        Pays p = new Pays(1L, "France");
        Pays p1 = new Pays(2L, "USA");
        Pays p3 = new Pays(3L, "UK");
        Pays p4 = new Pays(4L, "Espagne");
        Pays p5 = new Pays(5L, "Nouvelle-Zelande");
        paysService.ajouter(p);
        paysService.ajouter(p1);
        paysService.ajouter(p3);
        paysService.ajouter(p4);
        paysService.ajouter(p5);

        Realisateur r = new Realisateur(1L, "COHEN", "Joel");
        Realisateur r1 = new Realisateur(2L, "COHEN", "Ethan");
        Realisateur r2 = new Realisateur(3L, "JACKSON", "Peter");
        Realisateur r3 = new Realisateur(4L, "TARANTINO", "Quentin");
        Realisateur r4 = new Realisateur(5L, "Maiwenn", null);
        realisateurService.ajouter(r);
        realisateurService.ajouter(r1);
        realisateurService.ajouter(r2);
        realisateurService.ajouter(r3);
        realisateurService.ajouter(r4);

//        Film f = new Film(1L, "Django Unchained", 2012L);
//        f.setPaysFilm(p1);
//        f.setGenreFilm(g);
//        f.getRealisateurFilm().add(r3);
//        g.getFilmcrees().add(f);
//        r3.getFilmCrees().add(f);
//        p1.getFilmCrees().add(f);
//        filmService.ajouter(f);

//        Film f2 = new Film(2L, "Kill Bill", 2003L);
//        f2.setPaysFilm(p1);
//        f2.setGenreFilm(g);
//        f2.getRealisateurFilm().add(r3);
//        g.getFilmcrees().add(f2);
//        r3.getFilmCrees().add(f2);
//        p1.getFilmCrees().add(f2);
//        filmService.ajouter(f2);

//        Film f3 = new Film(3L, "Kill Bill2", 2004L);
//        f3.setPaysFilm(p1);
//        f3.setGenreFilm(g);
//        f3.getRealisateurFilm().add(r3);
//        g.getFilmcrees().add(f3);
//        r3.getFilmCrees().add(f3);
//        p1.getFilmCrees().add(f3);
//        filmService.ajouter(f3);

//        Film f4 = new Film(4L, "Jackie Brown", 1997L);
//        f4.setPaysFilm(p1);
//        f4.setGenreFilm(g);
//        f4.getRealisateurFilm().add(r3);
//        g.getFilmcrees().add(f4);
//        r3.getFilmCrees().add(f4);
//        p1.getFilmCrees().add(f4);
//        filmService.ajouter(f4);

//        Film f5 = new Film(5L, "Sin city", 2005L);
//        f5.setPaysFilm(p1);
//        f5.setGenreFilm(g1);
//        f5.getRealisateurFilm().add(r3);
//        g1.getFilmcrees().add(f5);
//        r3.getFilmCrees().add(f5);
//        p1.getFilmCrees().add(f5);
//        filmService.ajouter(f5);

//        Film f6 = new Film(6L, "Bad Taste", 1987L);
//        f6.setPaysFilm(p5);
//        f6.setGenreFilm(g1);
//        f6.getRealisateurFilm().add(r2);
//        g1.getFilmcrees().add(f6);
//        r2.getFilmCrees().add(f6);
//        p5.getFilmCrees().add(f6);
//        filmService.ajouter(f6);

//        Film f7 = new Film(7L, "Braindead", 1992L);
//        f7.setPaysFilm(p5);
//        f7.setGenreFilm(g1);
//        f7.getRealisateurFilm().add(r2);
//        g1.getFilmcrees().add(f7);
//        r2.getFilmCrees().add(f7);
//        p5.getFilmCrees().add(f7);
//        filmService.ajouter(f7);

//        Film f8 = new Film(8L, "Le Hobbit", 2015L);
//        f8.setPaysFilm(p5);
//        f8.setGenreFilm(g1);
//        f8.getRealisateurFilm().add(r2);
//        g1.getFilmcrees().add(f8);
//        r2.getFilmCrees().add(f8);
//        p5.getFilmCrees().add(f8);
//        filmService.ajouter(f8);

//        Film f9 = new Film(9L, "Polisse", 2011L);
//        f9.setPaysFilm(p);
//        f9.setGenreFilm(g2);
//        f9.getRealisateurFilm().add(r4);
//        g2.getFilmcrees().add(f9);
//        r4.getFilmCrees().add(f9);
//        p.getFilmCrees().add(f9);
//        filmService.ajouter(f9);

//        Film f10 = new Film(10L, "Big Lebowski", 1998L);
//        f10.setPaysFilm(p1);
//        f10.setGenreFilm(g5);
//        f10.getRealisateurFilm().add(r);
//        f10.getRealisateurFilm().add(r1);
//        g5.getFilmcrees().add(f10);
//        r.getFilmCrees().add(f10);
//        r1.getFilmCrees().add(f10);
//        p1.getFilmCrees().add(f10);
//        filmService.ajouter(f10);

        Film f11 = new Film(11L, "Avec Cesar", 2016L);
        f11.setPaysFilm(p1);
        f11.setGenreFilm(g5);
        f11.getRealisateurFilm().add(r);
        f11.getRealisateurFilm().add(r1);
        g5.getFilmcrees().add(f11);
        r.getFilmCrees().add(f11);
        r1.getFilmCrees().add(f11);
        p1.getFilmCrees().add(f11);
        f11.setSynopsis("zut j'ai raté l'avion");
        filmService.ajouter(f11);
        
        //System.out.println( f11.getGenreFilm().getNom());
        
        
    }

     @Test
    public void testLiens() {

        Persistence.createEntityManagerFactory("StreamingPU");

    }

//    @Test

    public void tousLesFilms() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();

        for (Film f : em.find(Genre.class, 1L).getFilmcrees()) {

            System.out.println(f);
        }

    }
//    @Test

    public void filmOrdreChronologique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f ORDER BY f.annee asc").getResultList());

    }

//    @Test
    public void genreNombre() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
//        Assert.assertEquals(6, em.createQuery("SELECT g FROM Genre g").getResultList().size());
        Long nbGenre = (Long) em.createQuery("SELECT COUNT(g) FROM Genre g").getSingleResult();
        Assert.assertTrue(nbGenre == 6L);
    }
//    @Test

    public void listeFilmFrancais1() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Assert.assertEquals(1, em.createQuery("SELECT f FROM Film f JOIN f.paysFilm p WHERE p.nom= 'France'").getResultList().size());

    }

    // @Test
    public void filmFantastiqueAlphabetique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f JOIN f.genreFilm g WHERE g.nom ='Fantastique' ORDER BY f.titre asc").getResultList());
    }

    // @Test
    public void filmFantastiqueSansJoin() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f WHERE f.genreFilm.nom ='Fantastique' ORDER BY f.titre asc").getResultList());

    }

    //@Test
    public void filmActionFreresCohen() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f JOIN f.genreFilm g JOIN f.realisateurFilm r WHERE g.nom ='Action' AND r.prenom = 'Joel' ORDER BY f.annee asc").getResultList());
    }

    //@Test
    public void filmAutresQueActions() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f JOIN f.genreFilm g WHERE g.nom <>'Action'").getResultList());
    }

    //@Test
    public void filmNeoZelandaisAutreFantastique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f JOIN f.genreFilm g JOIN f.paysFilm p WHERE g.nom <>'Fantastique' AND p.nom='Nouvelle-Zelande' ").getResultList());
    }

//    @Test
    public void filmFantastiqueNeoPeter() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT COUNT(f) FROM Film f JOIN f.genreFilm g JOIN f.paysFilm p JOIN f.realisateurFilm r WHERE g.nom ='Fantastique' AND p.nom='Nouvelle-Zelande' AND r.prenom='Peter' ").getResultList());
    }

//    @Test
    public void PaysTest() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f WHERE f.id IN(SELECT f.id FROM Film f JOIN f.realisateurFilm r WHERE r.prenom='Ethan') AND f.id IN(SELECT f.id FROM Film f JOIN f.realisateurFilm r WHERE r.prenom='Joel')").getResultList());;
    }

//    @Test
    public void filmAncienPeter() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f WHERE f.annee IN (SELECT MIN(f.annee) FROM Film f JOIN f.realisateurFilm r WHERE r.prenom='Peter' )").getResultList());

    }

//    @Test
    public void moyenneAnnee() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT AVG(f.annee) FROM Film f").getSingleResult());

    }

   
//    @Test
    public void realisateurNombreFilm() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Object[]> o = em.createQuery("SELECT DISTINCT COUNT(f), r.nom, r.prenom FROM Film f JOIN f.realisateurFilm r GROUP BY r  ORDER BY COUNT(f)").getResultList();
        for ( Object var[] : o){

            System.out.println(var[0]+" "+var[1]+" "+var[2]);
    }

    }

// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}
}
