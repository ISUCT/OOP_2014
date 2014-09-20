/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_5
 */
public class ModelDuck extends Duck {
    public ModelDuck () {
    flyBehavior = new FlyNoWay ();
    quackBehavior = new Quack();
    
}
    public void display () {
    System.out.println("I'm a model duck");
}
}
