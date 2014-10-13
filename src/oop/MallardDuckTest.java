/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author -
 */
public class MallardDuckTest {
     ByteArrayOutputStream baos;
    
    public MallardDuckTest() {
    }
    
  
    public static void setUpClass() {
    }
    
  
    public static void tearDownClass() {
    }
    
  
    public void setUp() {
         baos = new ByteArrayOutputStream(); 
        PrintStream ps = new PrintStream(baos); 
        System.setOut(ps); 

    }
    
  
    public void tearDown() { 
         baos.reset(); 
    } 


    /**
     * Test of display method, of class MallardDuck.
     */

    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
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
