/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_5
 */
public class MiniDuckSimulator {
        public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.perfomFly();
        
        
        Duck model = new ModelDuck();
        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
        
    
}
    

