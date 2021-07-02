package test;

import Calculation.Arithmetics;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();
    @Rule
    public final Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT(){
        a = new Arithmetics();
    }

    @Test
    public void testAdd(){
        double res = a.add(3, 7);
        Assert.assertEquals(10, res, 0.0);
    }
    @Ignore
    @Test
    public void testDeduct(){
        double res = a.deduct(10, 3);
        Assert.assertEquals(7, res, 0.0);
    }

    @Test
    public void testDiv(){
        double res = a.div(15, 2);
        Assert.assertEquals(7.5, res, 0.0);
    }

   // @Test(expected = ArithmeticException.class)
    @Test
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test
    public void testMult(){
        double res = a.mult(10, 3);
        Assert.assertEquals(30, res, 0.0);
    }

    @Test
    public void someTest(){
        while (true){ }
    }
}