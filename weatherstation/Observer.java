/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Stud_5
 */
public interface Observer {
    public void update (float temp, float himidity, float pressure);
}
