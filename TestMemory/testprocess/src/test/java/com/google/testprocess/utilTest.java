package com.google.testprocess;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/2.
 */
@RunWith(MockitoJUnitRunner.class)
public class utilTest {

    @Mock
    Context context;

    @Test
    public void testSaySomething() throws Exception {
        when(context.getString(R.string.app_name)).thenReturn("TestProcess");
        assertEquals("TestProcess", util.saySomething(context));
    }
}