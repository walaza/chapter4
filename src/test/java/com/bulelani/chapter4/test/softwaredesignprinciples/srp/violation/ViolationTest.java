/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.test.softwaredesignprinciples.srp.violation;

import com.bulelani.chapter4.softwaredesignprinciples.srp.correction.AddBook;
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
public class ViolationTest {
    
    public ViolationTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void srpViolationTest() {
         AddBook book = new AddBook();
         
         Assert.assertNotNull(book.addBook("Fundamentals"));
         Assert.assertNotNull(book.addBook("432"));
     }
}
