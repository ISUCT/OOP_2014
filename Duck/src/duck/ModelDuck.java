/*
 * Я модель утка
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck;

/**
 *
 * @author stud_5
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack(); 
    }

    public void display() {
        System.out.println("I'm a  model duck");
    }
}