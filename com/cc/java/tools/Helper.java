package com.cc.java.tools;

import com.cc.java.assoziation.Customer;
import com.cc.java.singleton.Singleton;

public class Helper {

    public static void output(String outputData) {
        System.out.println(outputData);  
    }

    public static void output(Customer customer) {
        
        throw new UnsupportedOperationException("Unimplemented method 'output'");
    }

    public static void output(Singleton singleton) {
        
        throw new UnsupportedOperationException("Unimplemented method 'output'");
    }

    // // Überladene Methode
    // public static void output(int outputData){
    //     System.out.println(outputData);
    // }

    // // Überladene Methode
    // public static void output(boolean outputData){
    //     System.out.println(outputData);
    // }
    
    // // Überladene Methode
    // public static void output(Object outputData){
    //     System.out.println(outputData);
    // }

}
