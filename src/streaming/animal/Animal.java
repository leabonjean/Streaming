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
public abstract class Animal {
//    private static int nbInstances = 0;
    
    protected int x=0, y=0, z=0;
//    
//    public Animal(){
//        nbInstances++;
//    }
    
//    public static int getNbInstances(){
//        return nbInstances;
//        
//    }
    
    abstract public void avance();
    
    public void avance(int pas){
        for(int i=0;i<pas;i++){
           avance(); 
        }
    }
    
//    
//    public void recule(){
//        y--;
//    }
//    
//    public void avance(int pas){
//        y=y+pas;
//    }
//    
//    public void recule(int pas){
//        y=y-pas;
//    }
//    
//    public void gauche(){
//        x--;
//    }
//    
//    public void gauche(int pas){
//        x=x-pas;
//    }
//    
//    public void droit(){
//        x++;
//    }
//    
//    public void droit(int pas){
//        x=x+pas;
//    }
    
    public String position(){
        return x+" "+y+" "+z; 
    }
    
    public String toString(){
        return this.getClass().getSimpleName() +" "+"x= "+ x+"; "+"y= "+y+"; "+" z="+z+";"; 
    }
} 
