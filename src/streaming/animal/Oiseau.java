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
public class Oiseau extends Animal {
        private int r=0;
        
        @Override
        public void avance(){
         z++;
        if (r==0){
            y++;
            r++;
        }
        else{
            y--;
            r--;
        }
    }
}
