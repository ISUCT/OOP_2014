/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juvautki;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
}

    @Override
    public void guack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
