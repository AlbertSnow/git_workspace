package com.example.administrator.testmemory;

import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Map<Byte, Byte> map = new HashMap<Byte, Byte>(3);
        map.put((byte)2, (byte)3);
        map.put((byte)3, (byte)4);
        byte value = map.get((byte)1);
        File file = new File("C:\\Users\\Administrator\\AppData\\Roaming\\kingsoft\\wps\\addons\\pool\\win-i386\\kwpsandroidtools_1.0.0.9\\adbfile");
        assertEquals(value, 0);
    }


}