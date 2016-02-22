/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *Entité gérant les films FILM
 * Degueulasse
 * @author admin
 */
@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;
    private Long annee;
    private String synopsis;
    
    
    
    @ManyToOne
    @JoinColumn(name = "Pays_Id")
    private Pays paysFilm;
    
    @ManyToOne
    @JoinColumn(name = "Genre_Id")
    private Genre genreFilm;
    
    @ManyToMany
    @JoinTable(name = "Film_Realisateur")
    private List<Realisateur> realisateurFilm = new ArrayList<Realisateur>();
    
    @OneToMany(mappedBy = "filmLien")
    private List<Lien> lienCrees = new ArrayList<Lien>();

    public Film(Long id, String titre, Long annee ) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;

    }
    
    public Film(){
        
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Pays getPaysFilm() {
        return paysFilm;
    }

    public void setPaysFilm(Pays paysFilm) {
        this.paysFilm = paysFilm;
    }

    public Genre getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(Genre genreFilm) {
        this.genreFilm = genreFilm;
    }

    public List<Realisateur> getRealisateurFilm() {
        return realisateurFilm;
    }

    public void setRealisateurFilm(List<Realisateur> realisateurFilm) {
        this.realisateurFilm = realisateurFilm;
    }

    public List<Lien> getLienCrees() {
        return lienCrees;
    }

    public void setLienCrees(List<Lien> lienCrees) {
        this.lienCrees = lienCrees;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Film[ id=" + id + " ]";
    }
    
}
