/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author stud_17
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
    
}
public void setFlyBehavior(FlyBehavior fb) {
flyBehavior = fb;
}

public void setQuackBehavior (QuackBehavior gb) {
quackBehavior = qb;

}
    



        
    
    






   


