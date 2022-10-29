package com.algorithm.java;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest extends TestCase {

    @Test
    public void test() {
        String[] str = {"2234597891 zmxvvxbcij 8800654113 jihgfedcba",
                "1234567891 abcdefghij 9876543219 jihgfedcba",
                "2234597891 zmxvvxbcij 8800654113 jihgfedcba"
        };

        Main main = new Main();
        System.out.println(main.driver(str));

        assertEquals("1234567891 abcdefghij 9876543219 jihgfedcba 12234597891 zmxvvxbcij 8800654113 jihgfedcba 2", main.driver(str));
    }

}