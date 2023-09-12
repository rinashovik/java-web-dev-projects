package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }
//"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

@Test
    public void test1(){
    assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));

}


    @Test
    public void test2(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));


    }


    @Test
    public void test3(){
       // String expected = "Launch[Code]";//";]\", \"Launch[Code]\", \"[]LaunchCode\", \"\", \"[]\""

        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        //assertTrue(expected, actual);

    }
    @Test
    public void test4(){
        //String expected = "[LaunchCode]";//";]\", \"Launch[Code]\", \"[]LaunchCode\", \"\", \"[]\""
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));


    }
    @Test
    public void test5(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));


    }
    @Test
    public void test6(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));

    }
    @Test
    public void test7(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]"));

    }
    @Test
    public void test8(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }

    @Test
    public void test9(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }

    @Test
    public void test10(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }
}