/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

/**
 *
 * @author l
 */
public abstract class Hero {

    WeaponBehavior weaponBehavior;
    ArmorBehavior armorBehavior;
    
    public Hero() {
    }
    
    public abstract void  haracter();
    
    public void performWeapon() {
        weaponBehavior.useWeapon();
    }
    
    public void performArmor(){
        armorBehavior.useArmor();
    }
    
    public void setWeaponBehavior(WeaponBehavior wb){
        weaponBehavior = wb;
    }
    
    public void setArmorBehavior(ArmorBehavior ab){
        armorBehavior = ab;
    }
}
