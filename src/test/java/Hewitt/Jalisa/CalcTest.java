package Hewitt.Jalisa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jalisahewitt on 9/30/16.
 */
public class CalcTest {

    @Test
    public void addTest(){
        Calc addTest= new Calc();
        int expected = 12;
        int actual = addTest.add(5,7);
        assertEquals("Answer should be 12",actual,expected);

    }

    @Test
    public void subTest(){
        Calc subTest= new Calc();
        int expected = 5;
        int actual = subTest.sub(10,5);
        assertEquals("Answer should be 5",actual,expected);
    }

    @Test
    public void multTest(){
        Calc multTest= new Calc();
        int expected = 20;
        int actual = multTest.mult(2,10);
        assertEquals("Answer should be 20",actual,expected);
    }

    @Test(expected = ArithmeticException.class)
    public void divideTest(){
        Calc divTest= new Calc();
        divTest.divide(5,0);
        //assertEquals("Should have thrown an error ",actual,);
    }

    @Test
    public void divideTest2(){
        Calc divTest= new Calc();
        int expected = 2;
        int actual = divTest.divide(12,6);
        assertEquals("Answer should be 2",actual,expected);
    }




}
