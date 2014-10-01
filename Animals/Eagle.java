/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_5
 */
public class Eagle extends Animals{
    public Eagle(){
        jumpBehavior = new NoJump();
        flyBehavior = new Flying();
        eatBehavior = new Eating();
        
    }
    @Override
    public void display() {
        System.out.println("I'm an Eagle!");
    }
}
