package com.google.myanimation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String test = null;
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add(test);
        stringArray.add("hello");
        Iterator<String> iterator =  stringArray.iterator();
        for (String hello = test; hello != null;  hello = iterator.next()){
            System.out.println(hello.length());
        }
    }
}