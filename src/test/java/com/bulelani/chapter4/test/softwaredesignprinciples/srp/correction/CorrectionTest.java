/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.test.softwaredesignprinciples.srp.correction;

import com.bulelani.chapter4.softwaredesignprinciples.srp.correction.AddBook;
import com.bulelani.chapter4.softwaredesignprinciples.srp.correction.SearchBook;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Training06
 */
public class CorrectionTest {
    
    private AddBook add;
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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.name + title + isbn + author + copies;
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void srpCorrection() {
         add = new AddBook();
         Assert.assertEquals("book added", add.addBook("how to program"));
     }
     @Test
     public void searchTest(){
       SearchBook search = new SearchBook();
       Assert.assertSame(search.searchBook("123"), search.searchBook("123"));
     }
}
