/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.isp.correction.Impl;

import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.addBookInterface;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Training06
 */
public class AddBook implements addBookInterface{
 private Set title;
    @Override
    public String addBook(String tit) {
      title = new HashSet<>();
      title.add(tit);
      return "book added";
    }
    
}
