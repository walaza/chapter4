/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.isp.violation;

import com.bulelani.chapter4.softwaredesignprinciples.isp.violation.BookShopInterface;
import java.util.HashSet;
import java.util.Set;

/**      title = new HashSet<>();
      title.add(tit);
      return "book added";
 *
 * @author Training06
 */
public class AddBook implements BookShopInterface{
    private Set title;
    @Override
    public String addBook(String tit) {
      title = new HashSet<>();
      title.add(tit);
      return "book added";
    }

    @Override
    public String searchBook(String isbn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
