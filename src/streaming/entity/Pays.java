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
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    
    @OneToMany(mappedBy = "paysSerie")
    private List<Serie> serieCrees = new ArrayList<Serie>();
    
    @OneToMany(mappedBy = "paysFilm")
    private List<Film> filmCrees = new ArrayList<Film>();

    public Pays(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Pays(){
        
    }
    
    public List<Serie> getSerieCrees() {
        return serieCrees;
    }

    public void setSerieCrees(List<Serie> serieCrees) {
        this.serieCrees = serieCrees;
    }

    public List<Film> getFilmCrees() {
        return filmCrees;
    }

    public void setFilmCrees(List<Film> filmCrees) {
        this.filmCrees = filmCrees;
    }
   
    
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return nom;
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
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Pays[ id=" + id + " ]";
    }
    
}
