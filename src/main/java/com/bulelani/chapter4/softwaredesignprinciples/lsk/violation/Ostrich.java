package com.bulelani.chapter4.softwaredesignprinciples.lsk.violation;

/**
 * Created by hashcode on 2015/02/25.
 */
public class Ostrich implements Bird {
    public void fly(){
        throw new UnsupportedOperationException();
    }

    public void eat(){
        System.out.println("Bird is Eating");
    }
}
