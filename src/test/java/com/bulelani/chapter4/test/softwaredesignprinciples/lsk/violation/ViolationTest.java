package com.bulelani.chapter4.test.softwaredesignprinciples.lsk.violation;



import com.bulelani.chapter4.config.AppConfigViolation;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Bird;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Dove;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Duck;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Ostrich;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by hashcode on 2015/02/25.
 */
public class ViolationTest {
    private Dove dove;
    private Duck duck;
    private Ostrich ostrich;
    private ApplicationContext ctx;



    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        duck = (Duck)ctx.getBean("duck");
        dove = (Dove)ctx.getBean("dove");
        ostrich = (Ostrich)ctx.getBean("ostritch");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testViolation() throws Exception {
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(duck);
        birdList.add(dove);
        birdList.add(ostrich);
        for (Bird bird : birdList) {
           bird.fly();
            bird.eat();
        }





    }
}
    
