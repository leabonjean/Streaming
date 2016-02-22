/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String sysnopsis;
    
    @OneToMany(mappedBy = "serieSaison",cascade = CascadeType.PERSIST)
    private List<Saison> saisonsCrees = new ArrayList<Saison>();
    
    @ManyToOne
    @JoinColumn(name = "Pays_Id")
    private Pays paysSerie;

    public Serie(Long id, String titre, Pays paysSerie) {
        this.id = id;
        this.titre = titre;
     
    }

    public Serie(){
        
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSysnopsis() {
        return sysnopsis;
    }

    public void setSysnopsis(String sysnopsis) {
        this.sysnopsis = sysnopsis;
    }


    

    public List<Saison> getSaisonsCrees() {
        return saisonsCrees;
    }

    public void setSaisonsCrees(List<Saison> saisonsCrees) {
        this.saisonsCrees = saisonsCrees;
    }

    public Pays getPaysSerie() {
        return paysSerie;
    }

    public void setPaysSerie(Pays paysSerie) {
        this.paysSerie = paysSerie;
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
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Serie[ id=" + id + " ]";
    }
    
}
