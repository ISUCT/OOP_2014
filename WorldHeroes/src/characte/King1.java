/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

/**
 *
 * @author l
 */
public class King1 extends Hero{

    public King1(){
        weaponBehavior = new KnifeWeapon();
        armorBehavior = new HeavyArmor(); 
    }

    public void haracter() {
        System.out.println("Характер");
    }
    
    public static void main(String[] args){
     Hero King = new King1();
        King.performWeapon();
        King.performArmor();
     }
}
