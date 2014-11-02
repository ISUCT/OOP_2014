/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_5
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck () {     
   }
  
    public abstract void display ();
    
    public void perfomFly () {
        flyBehavior.fly ();    
    }
    public void performQuack ()  {
        quackBehavior.quack ();
    }
    
    public void swim () {
        System.out.println ("All ducks float, even decoys!");
        
    }

    void setFlyBehavior(FlyRocketPowered flyRocketPowered) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
   public void setFlyBehavior(FlyBehavior fb) {
flyBehavior = fb;
}

public void setQuackBehavior (QuackBehavior gb) {
quackBehavior = gb;

} 

    void performFly() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
