/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.dao.FilmDAO;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/C:\\Users\\admin\\Documents\\Streaming\\application-context.xml")
public class SpringTest {
    
    @Autowired
    private FilmService fs;
    
    @Autowired
    private FilmDAO fd;
    
    
    @Test
    public void testFilm(){
        System.out.println(fs.listerTous());
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
