package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	hw.Method3(6,1,1);
    	hw.Method3(4,-1,1);
    	hw.Method3(4,-1,-3);
    	hw.Method3(4,-1,-2);
    	hw.Method3(5,-1,-2);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4(){
        HelloWorld hw=new HelloWorld();
        try {
            hw.Method4(0, 1, 1, 1, 1);

            hw.Method4(4, 4, 1, 2, 1);
            hw.Method4(5, 5, 1, 1, 1);
            hw.Method4(4, 4, 1, 1, 1);
            hw.Method4(5, 4, 1, 1, 1);
            hw.Method4(4,3,1,1,1);
            hw.Method4(5,4,1,2,1);
            hw.Method4(4,3,1,2,1);
        }catch (ArithmeticException e){
            System.out.println("divide 0 error");
        }
    }
    @Test
    public void testTriangle(){
        HelloWorld hw=new HelloWorld();
        hw.isTriangle(1,1,1);
        hw.isTriangle(2,2,1);
        hw.isTriangle(3,4,5);
        hw.isTriangle(1,1,2);
        hw.isTriangle(1,3,1);
        hw.isTriangle(3,1,1);
    }
    @Test
    public void testBirthday(){
        HelloWorld hw=new HelloWorld();
        hw.isBirthday(1989,2,5);
        hw.isBirthday(1990,0,5);
        hw.isBirthday(1990,1,0);
        hw.isBirthday(2020,1,5);
        hw.isBirthday(2019,13,5);
        hw.isBirthday(2019,10,5);
        hw.isBirthday(2019,10,1);
        hw.isBirthday(2019,9,5);
        hw.isBirthday(2019,9,0);
        hw.isBirthday(2016,2,30);
        hw.isBirthday(2016,2,29);
        hw.isBirthday(2017,2,29);
        hw.isBirthday(2017,2,28);
        hw.isBirthday(2019,1,5);
        hw.isBirthday(2018,3,5);
        hw.isBirthday(2018,5,5);
        hw.isBirthday(2018,7,32);
        hw.isBirthday(2018,8,31);
        hw.isBirthday(2018,10,35);
        hw.isBirthday(2018,12,45);
        hw.isBirthday(2019,4,5);
        hw.isBirthday(2018,6,30);
        hw.isBirthday(2018,9,31);
        hw.isBirthday(2018,11,32);
    }

    @Test
    public void testCalculator(){
        HelloWorld hw=new HelloWorld();
        double a=hw.miniCalculator(1.0,2.0,'+');
        //assertEquals(3.0, a);
        a=hw.miniCalculator(2.0,1.0,'-');
        //assertEquals(1.0, a);
        a=hw.miniCalculator(1.0,2.0,'*');
        //assertEquals(2.0, a);
        a=hw.miniCalculator(1.0,2.0,'/');
        //assertEquals(0.5, a);
        a=hw.miniCalculator(1.0,0.0,'/');
        //assertEquals(0, a);
        a=hw.miniCalculator(1.0,2.0,'!');
        //assertEquals(0, a);
    }
}
