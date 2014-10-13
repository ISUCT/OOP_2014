/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

/**
 *
 * @author l
 */
public class Varvor extends Hero{

    public Varvor(){
        weaponBehavior = new SwordWeapon();
        armorBehavior = new AverageArmor(); 
    }

    public void haracter() {
        System.out.println("Характер");
    }
    
    public static void main(String[] args){
     Hero Varvor = new Varvor();
        Varvor.performWeapon();
        Varvor.performArmor();
     }
}
