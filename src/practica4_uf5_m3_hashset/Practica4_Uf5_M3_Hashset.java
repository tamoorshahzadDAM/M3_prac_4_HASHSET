/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_uf5_m3_hashset;

import java.util.HashSet;

/**
 *
 * @author Tamoor
 */
public class Practica4_Uf5_M3_Hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //-----HASHSET----
        
        HashSet<Libros> hs =new HashSet<>();  
        
        //Crear libros
        Libros l1 = new Libros(01, "libro1", "autor1", "editor1", 5);
        Libros l2 = new Libros(02, "libro2", "autor2", "editor2", 20);
        Libros l3 = new Libros(03, "libro3", "autor3", "editor3", 10);
        Libros l4 = new Libros(04, "libro4", "autor4", "editor4", 50);
        
        //añadir
        hs.add(l1);
        hs.add(l2);
        hs.add(l3);
        hs.add(l4);
        
        //Imprimit
        System.out.println(hs);
    }
    
}
