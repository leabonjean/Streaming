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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Episode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numEpisode;
    private String titre;

    @OneToMany ( mappedBy = "episodeLien")
    private List<Lien> lienCrees = new ArrayList<Lien>();
    
    @ManyToOne
    @JoinColumn(name= "Saison_Id")
    private Saison episodeSaison;

    public Episode(Long id, int numEpisode, String titre) {
        this.id = id;
        this.numEpisode = numEpisode;
        this.titre = titre;
    }

    public Episode(){
        
    }
    
    public int getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(int numEpisode) {
        this.numEpisode = numEpisode;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Lien> getLienCrees() {
        return lienCrees;
    }

    public void setLienCrees(List<Lien> lienCrees) {
        this.lienCrees = lienCrees;
    }

    public Saison getEpisodeSaison() {
        return episodeSaison;
    }

    public void setEpisodeSaison(Saison episodeSaison) {
        this.episodeSaison = episodeSaison;
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
        if (!(object instanceof Episode)) {
            return false;
        }
        Episode other = (Episode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Episode[ id=" + id + " ]";
    }
    
}
