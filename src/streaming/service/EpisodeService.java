/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.EpisodeDAO;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public class EpisodeService {
    private EpisodeDAO dao = new EpisodeDAO();
    
    public void ajouter(Episode e){
        dao.ajouter(e);
    }
        public List<Episode> listerTous(){
        return dao.listerTous();
    }
    
    public Episode rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
}
