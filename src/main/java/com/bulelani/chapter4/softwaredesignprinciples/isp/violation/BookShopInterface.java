/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.softwaredesignprinciples.isp.violation;

/**
 *
 * @author Training06
 */
public interface BookShopInterface {
    String addBook(String tit);
    String searchBook(String isbn);
}
