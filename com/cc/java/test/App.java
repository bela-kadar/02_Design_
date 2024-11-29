package com.cc.java.test;

import com.cc.java.singleton.Singleton;
import com.cc.java.tools.Helper;

public class App 
{

    private static String outputData;
    
        public static void main(String[] args) {
           // System.out.println("Hello, World!");
            Singleton obj1 = Singleton.getInstance();
            Helper.output(obj1);
        
        
    }
    
}


