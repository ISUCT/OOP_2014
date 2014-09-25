/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

public class RubberDuck extends Duck{

    public RubberDuck() {

        quackBehavior = new Squeak();

        flyBehavior = new FlyNoWay();
}

    @Override
    public void display(){

        System.out.println("I'm a Rubber duck");
}
}