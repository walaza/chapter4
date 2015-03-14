/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.isp.violation.Impl;

import com.bulelani.chapter4.softwaredesignprinciples.isp.violation.BookShopInterface;

/**
 *
 * @author Training06
 */
public class SearchBook implements BookShopInterface{

    @Override
    public String addBook(String tit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchBook(String isbn) {
         if(isbn.equals(isbn))
      {
          return isbn;
      }
      return "Book not found";
    }
    
}
