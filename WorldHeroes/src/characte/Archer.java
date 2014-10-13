/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

/**
 *
 * @author l
 */
public class Archer extends Hero{

    public Archer(){
        weaponBehavior = new BowAndArrowWaepon();
        armorBehavior = new AthleticsArmor(); 
    }

    public void haracter() {
        System.out.println("Характер");
    }
    
    public static void main(String[] args){
     Hero Archer = new Archer();
        Archer.performWeapon();
        Archer.performArmor();
     }
}
