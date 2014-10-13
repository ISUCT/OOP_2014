/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package characte;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author l
 */
public class ArcherTest {
    
    public ArcherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of haracter method, of class Archer.
     */
 
    
    @Test
    public void testKing() {
        System.out.println("King");
        ModelKing King = new ModelKing();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        King.performWeapon();
        King.performArmor();
        King.setWeaponBehavior(new KnifeWeapon());
        King.setArmorBehavior(new HeavyArmor());
        assertEquals("Оружие нож\r\n" + "Тяжёлая броня\r\n", baos.toString());
    }
    
        @Test
    public void testTrol() {
        System.out.println("Trol");
        ModelTrol Trol = new ModelTrol();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        Trol.performWeapon();
        Trol.performArmor();
        Trol.setWeaponBehavior(new AxeWeapon());
        Trol.setArmorBehavior(new AthleticsArmor());
        assertEquals("Оружие топор\r\n" + "Лёгкая броня\r\n", baos.toString());
    }

    @Test
    public void testVarvor() {
        System.out.println("Varvor");
        Varvor Varvor = new Varvor();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        Varvor.performWeapon();
        Varvor.performArmor();
        Varvor.setWeaponBehavior(new SwordWeapon());
        Varvor.setArmorBehavior(new AverageArmor());
        assertEquals("Оружие меч\r\n" + "Средная броня\r\n", baos.toString());
    }
    
    @Test
    public void testArcher() {
        System.out.println("Archer");
        Archer Archer = new Archer();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        Archer.performWeapon();
        Archer.performArmor();
        Archer.setWeaponBehavior(new BowAndArrowWaepon());
        Archer.setArmorBehavior(new AthleticsArmor());
        assertEquals("Оружие лук и стрелы\r\n" + "Лёгкая броня\r\n", baos.toString());
    }
}
