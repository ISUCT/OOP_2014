/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

public class MiniDuckSimulator {

    public static void main(String[] args){

        Duck mallard = new MallardDuck();

        mallard.performQuack();

        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());

        model.performFly();
}
}

    