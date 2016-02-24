/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.stereotype.Service;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
@Service
public class LienService {
            private LienDAO dao = new LienDAO();
    
    public void ajouter(Lien l){
        dao.ajouter(l);
    }
    
    public void supprimer(long id){
        dao.supprimer(id);
    }
        public List<Lien> listerTous(){
        return dao.listerTous();
    }
    
    public Lien rechercherParId(long id){
        return dao.rechercherParId(id);
    }
    
    
}
