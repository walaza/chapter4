/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.srp.correction;

import java.util.HashSet;
import java.util.Set;

/**
 *        HashSet <String> names = new HashSet<String>();
        names.add("Bulelani");
 * @author Training06
 */
public class AddBook {
    private Set title;
  public String addBook( String tit)
  {
      title = new HashSet<>();
      title.add(tit);
      return "book added";
  } 
}
