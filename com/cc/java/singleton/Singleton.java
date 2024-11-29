package com.cc.java.singleton;

public class Singleton {

    private static Singleton instance;
    private int counter;

    // public Singleton(){


    // }
    
}


   // ... in der Klasse
   /**
 * @return
 */
public static Singleton getInstance() {
        
    if (instance == null) {
        return instance = new Singleton();
    }
    return instance;   
    
    // return instance == null ? instance = new Singleton() : instance;
   }


