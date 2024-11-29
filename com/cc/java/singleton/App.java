package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {

    public static void main(String[] args) {
        
            Singleton singleton1 = new Singleton();
            Helper.output(singleton1);
            Singleton singleton2 = new Singleton();
            Helper.output(singleton2);
            Singleton singleton3 = new Singleton();
            Helper.output(singleton3);

    }


}
