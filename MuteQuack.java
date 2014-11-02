/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_5
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
}

    @Override
    public void guack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}