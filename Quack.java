/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_5
 */
public class Quack implements QuackBehavior {
    @Override
    public void guack() {
        System.out.println("Quack");
    }

    @Override
    public void quack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
