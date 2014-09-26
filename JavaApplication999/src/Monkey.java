/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_5
 */
public class Monkey extends Animals{
    public Monkey(){
        jumpBehavior = new Jumping();
        flyBehavior = new NoFly();
        eatBehavior = new Eating();
        
    }
    @Override
   public void display() {
        System.out.println("I'm a monkey!");
    } 
}
