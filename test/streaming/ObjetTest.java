/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import static org.junit.Assert.*;
import streaming.animal.Animal;
import streaming.animal.Oiseau;
import streaming.animal.Poisson;
import streaming.animal.Serpent;
import streaming.animal.Terminal;
import streaming.enumerations.TypeUtil;
import streaming.interfaces.Collection;
import streaming.interfaces.Ensemble;
import streaming.interfaces.Liste;

/**
 *
 * @author admin
 */
public class ObjetTest {

    //@Test
//        public void test1(){
//                Animal a = new Animal();
//                a.avance(3);
//                a.droit();
//                a.recule(6);
//                System.out.println(a);
//   
//        }
    //@Test
//        public void test2(){
//            Terminal t1= Terminal.creation();
//            Terminal t2= Terminal.creation();
//            System.out.println(t1+" "+t2);
//        }
//        
    //@Test
    public void testPoisson() {

        Poisson p = new Poisson();
        Serpent s = new Serpent();
        Oiseau o = new Oiseau();
        p.avance();
        s.avance();
        o.avance();
        //System.out.println(p);
        System.out.println(s);
        s.avance();
        o.avance();
        System.out.println(s);
        s.avance();
        o.avance();
        System.out.println(s);
        s.avance();
        o.avance();
        System.out.println(s);
    }

    //@Test
    public void Test() {

        Animal[] tabAni = new Animal[5];
        tabAni[0] = new Serpent();
        tabAni[1] = new Oiseau();
        tabAni[2] = new Poisson();
        tabAni[3] = new Serpent();
        tabAni[4] = new Oiseau();

        tabAni[0].avance();

        for (Animal animal : tabAni) {
            // for(int j =1; j<=i+1;j++){
            animal.avance(3);
            // }
            System.out.println(animal);
            //System.out.print(" ");
         }

    }
   // @Test
    public void testSubstitution(){
        
        Liste c = new Liste();
        Object o = 1;
        Object p=3;
        
        c.ajouter(o);
        c.ajouter(p);
        c.ajouter(p);
        c.afficher();
        
}
        @Test
        public void testSubstitution2(){

        TypeUtil tu= TypeUtil.MODERATEUR;
        
        if (tu== TypeUtil.MODERATEUR){
            System.err.println("Moderateur");
        }
}
}
