/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_5
 */
public abstract class Animals {
JumpBehavior jumpBehavior;
FlyBehavior flyBehavior;
EatBehavior eatBehavior;

public void performJump(){
    jumpBehavior.jump();
    
}
public void performFly(){
    flyBehavior.fly();
    
}
public void performEat(){
    eatBehavior.eat();
}
public abstract void display();
public static void main (String[] args){
    Eagle petr = new Eagle();
    petr.display();
    petr.performJump();
    petr.performFly();
    petr.performEat();
    
    Fox foxy = new Fox();
    foxy.display();
    foxy.performJump();
    foxy.performFly();
    foxy.performEat();
    
    Monkey monk = new Monkey();
    monk.display();
    monk.performJump();
    monk.performFly();
    monk.performEat();
    
    
}
}

    
