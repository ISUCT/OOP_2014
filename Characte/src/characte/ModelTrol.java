/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

/**
 *
 * @author l
 */
public class ModelTrol extends Hero {
    
    public ModelTrol(){
        weaponBehavior = new AxeWeapon();
        armorBehavior = new AthleticsArmor(); 
    }

    public void haracter() {
        System.out.println("Характер");
    }
}
