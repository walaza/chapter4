/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.isp.correction.Impl;

import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.SearchBookInterface;

/**
 *
 * @author Training06
 */
public class SearchBook implements SearchBookInterface {

    @Override
    public String searchBook(String isbn) {
      if(isbn.equals(isbn))
      {
          return isbn;
      }
      return "Book not found";
    }
 }
    

