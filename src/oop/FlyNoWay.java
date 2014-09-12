/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author -
 */
public class FlyNoWay implements FlyBehavior {    
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}