/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulelani.chapter4.config;

import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Bird;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Dove;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Duck;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Ostrich;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Training06
 */
@Configuration
public class AppConfigViolation {
    @Bean(name="dove")
    public Bird getDove(){
        return new Dove();
    }
    @Bean(name="duck")
    public Bird getDuck(){
        return new Duck();
    }
    @Bean(name="ostritch")
    public Bird getOstritch(){
        return new Ostrich();
    } 
}
