/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.config;

import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.Impl.AddBook;
import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.Impl.SearchBook;
import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.SearchBookInterface;
import com.bulelani.chapter4.softwaredesignprinciples.isp.correction.addBookInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Training06
 */
@Configuration
public class AppConfigCorrection {
    @Bean(name="search")
    public SearchBookInterface getBook(){
        return new SearchBook();
    }
    @Bean(name="add")
    public addBookInterface getDuck(){
        return new AddBook();
    }
}
