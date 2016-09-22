package com.google.myanimation;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/19.
 */
@RunWith(AndroidJUnit4.class)
public class ThirdActivityTest {

    @Test
    public void testOnBackPressed() throws Exception {
        Intent intent = getYaHooAdComponent();
        ComponentName componentName = intent.getComponent();
        assertNotNull(componentName);
        assertTrue(isExplicitIntent(intent));

        Intent actionIntent = new Intent("hello");
        assertFalse(isExplicitIntent(actionIntent));

        Intent dataIntent = new Intent();
        dataIntent.setData(Uri.parse("http://www.baidu.com"));
        assertFalse(isExplicitIntent(dataIntent));
    }

    public boolean isExplicitIntent(Intent intent) {
        boolean isExplicity = false;
        if (intent != null){
            ComponentName componentnName = intent.getComponent();
            isExplicity = componentnName != null;
        }

        return isExplicity;
    }

    public Intent getYaHooAdComponent(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent.setData(Uri.parse("https://www.baidu.com"));
        return intent;
    }
}