/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.test.softwaredesignprinciples.isp.correction;

import com.bulelani.chapter4.config.AppConfigCorrection;
import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.Impl.AddBook;
import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.Impl.SearchBook;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Training06
 */
public class CorrectionTest {
    private ApplicationContext ctx;
    private AddBook bk;
    private SearchBook se;
    public CorrectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
       bk = (AddBook)ctx.getBean("add");
       se = (SearchBook)ctx.getBean("search");
    }
   
     @Test
     public void correctionTest() {
         List<AddBook> book = new ArrayList<>();
         book.add(bk);
         for(AddBook addb : book){
             bk.addBook("title");
              Assert.assertNotNull(addb);
         }
     }
     @Test
         public void ispCorrectionTest(){
         List<SearchBook> search = new ArrayList<>();
         search.add(se);
         for(SearchBook sea : search){
             se.searchBook("123");
             Assert.assertNotNull(sea);
         }
     }
}
