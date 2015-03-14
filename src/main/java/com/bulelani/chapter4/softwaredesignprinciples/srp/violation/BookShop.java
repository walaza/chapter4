/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.srp.violation;

/**
 *
 * @author Training06
 */
public class BookShop {
  private String name;
  private String title;
  private String isbn;
  private String author;
  private int copies;
  
  public String addBook(String nme, String tit, String aut, String isbn, int copies)
  {
      return name + title + isbn + author + copies;
  }
  public String searchBook(String isbn)
  {
      if(isbn.equals(isbn))
      {
          return isbn;
      }
      return "Book not found";
  }
}
