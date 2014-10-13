/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

/**
 *
 * @author l
 */
public class ModelKing extends Hero{
    
   public ModelKing(){
        weaponBehavior = new KnifeWeapon();
        armorBehavior = new HeavyArmor(); 
    }

    public void haracter() {
        System.out.println("Характер");
    }
}
