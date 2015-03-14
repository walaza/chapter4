package com.bulelani.chapter4.test.softwaredesignprinciples.lsk.correction;



import com.bulelani.chapter4.config.AppConfigCorrection;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Bird;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Dove;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Duck;
import com.bulelani.chapter4.softwaredesignprinciples.lsk.correction.Ostrich;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;


import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by hashcode on 2015/02/25.
 */
public class CorrectionTest {
    private Dove dove;
    private Duck duck;
    private Ostrich ostrich;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        duck = (Duck) ctx.getBean("duck");
        dove = (Dove) ctx.getBean("dove");
        ostrich = (Ostrich) ctx.getBean("ostritch");

    }

    @Test
    public void testCorrection() throws Exception {
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(duck);
        birdList.add(dove);
        birdList.add(ostrich);
        for (Bird bird : birdList) {
            bird.eat();
            Assert.assertNotNull(bird);
        }

    }
}
