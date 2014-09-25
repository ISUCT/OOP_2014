/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author stud_5
 */
public class MallardDuckTest {

    ByteArrayOutputStream baos;

    public MallardDuckTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
    }

    @After
    public void tearDown() {
        baos.reset();
    }

    /**
     * Test of display method, of class MallardDuck.
     */
    @Test
    public void testDisplay() {
        MallardDuck instance = new MallardDuck();

        instance.display();
        assertEquals("I'm a real Mallard duck\r\n", baos.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFly() {
        MallardDuck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        assertEquals("I'm flying!\r\n", baos.toString());
        baos.reset();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
        assertEquals("I can't fly\r\n", baos.toString());
    }

    @Test
    public void testQuack() {
        MallardDuck duck = new MallardDuck();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
        assertEquals("Quack\r\n", baos.toString());
        baos.reset();
        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
        assertEquals("<< Silence >>\r\n", baos.toString());
    }
}
