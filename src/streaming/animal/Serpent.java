/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.animal;

/**
 *
 * @author admin
 */
public class Serpent extends Animal{
        public int r=0;
    
        public void avance(){
        z++;
        if (r==0){
            x++;
            r++;
        }
        else{
            x--;
            r--;
        }
        
        
    }
}
