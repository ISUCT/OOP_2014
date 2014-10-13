/*
 * Тишина
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Duck;

/**
 *
 * @author stud_5
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence");
    }   
}
