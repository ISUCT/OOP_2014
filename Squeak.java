/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
    public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void guack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
    
