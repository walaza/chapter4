package com.bulelani.chapter4.softwaredesignprinciples.lsk.correction;

/**
 * Created by hashcode on 2015/02/25.
 */
public class Dove implements Bird{
    @Override
    public void eat() {
        System.out.println(" Bird is Eating");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
