package com.infer.utils;

import org.junit.Assert;
import org.junit.Test;

import static com.infer.utils.Strings.toLowerCase;
import static com.infer.utils.Strings.toUpperCase;


/**
 * Created by Anoop on 6/1/2015.
 */
public class StringsTest {

    @Test
    public void testLowerCase() {
        Assert.assertEquals(toLowerCase("THIS IS ANOOP", 4, 4),("THIS is ANOOP"));
    }

    @Test
    public void testUpperCase() {
        Assert.assertEquals(toUpperCase("this is anoop", 4, 4),("this IS anoop"));
    }

    @Test
    public void testVoidLowercase() {
        Assert.assertEquals(toLowerCase("THIS IS ANOOP", 4, 4),("THIS is ANOOP"));
    }

    @Test
    public void testVoidUpperCase() {Assert.assertEquals(toUpperCase("this is anoop", 4, 4),("this IS anoop"));}

    @Test
    public void testTestLowerCase() throws Exception {

    }

    @Test
    public void testTestUpperCase() throws Exception {

    }

    @Test
    public void testTestVoidLowercase() throws Exception {

    }

    @Test
    public void testTestVoidUpperCase() throws Exception {

    }
}
