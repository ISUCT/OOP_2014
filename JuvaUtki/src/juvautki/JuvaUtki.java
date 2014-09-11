
package juvautki;

public abstract class JuvaUtki {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public JuvaUtki () {     
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
