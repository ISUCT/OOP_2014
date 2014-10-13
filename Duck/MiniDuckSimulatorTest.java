package duck;
import Duck.Duck;
import Duck.FlyNoWay;
import Duck.FlyRocketPowered;
import Duck.FlyWithWings;
import Duck.MallardDuck;
import Duck.MiniDuckSimulator;
import Duck.ModelDuck;
import Duck.MuteQuack;
import Duck.Quack;
import Duck.Squeak;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MiniDuckSimulatorTest {
public MiniDuckSimulatorTest() {
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

@Test
public void testFlyWithWings() {
System.out.println("FlyWithWings");
MallardDuck duck = new MallardDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
duck.setFlyBehavior(new FlyWithWings());
duck.performFly();
assertEquals("I'm flying!!\r\n", baos.toString());
}
@Test
public void testFlyNoWay() {
System.out.println("FlyNoWay");
MallardDuck duck = new MallardDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
duck.setFlyBehavior(new FlyNoWay());
duck.performFly();
assertEquals("I can't fly\r\n", baos.toString());
}
@Test
public void testFlyRocketPowered() {
System.out.println("FlyRocketPowered");
MallardDuck duck = new MallardDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
duck.setFlyBehavior(new FlyRocketPowered());
duck.performFly();
assertEquals("I'm flying with a rocket!\r\n", baos.toString());
}
@Test
public void testSqueak() {
System.out.println("Squeak");
MallardDuck duck = new MallardDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
duck.setQuackBehavior(new Squeak());
duck.performQuack();
assertEquals("Squeak\r\n", baos.toString());
}
@Test
public void testQuack() {
System.out.println("Quack");
ModelDuck duck = new ModelDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
duck.setQuackBehavior(new Quack());
duck.performQuack();
assertEquals("Quack\r\n", baos.toString());
}
@Test
public void testMuteQuack() {
System.out.println("MuteQuack");
MallardDuck duck = new MallardDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
duck.setQuackBehavior(new MuteQuack());
duck.performQuack();
assertEquals("Silence\r\n", baos.toString());
}
@Test
public void testMiniDuckSimulator() {
System.out.println("MiniDuckSimulator");
Duck mallard = new MallardDuck();
Duck model = new ModelDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
mallard.performQuack();
mallard.performFly();
model.performFly();
model.setFlyBehavior(new FlyRocketPowered());
model.performFly();
assertEquals("Quack\r\n" + "I'm flying!!\r\n" + "I can't fly\r\n" + "I'm flying with a rocket!\r\n", baos.toString());
}
@Test
public void testDisplay() {
System.out.println("Display");
MallardDuck instance = new MallardDuck();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
PrintStream ps = new PrintStream(baos);
System.setOut(ps);
instance.display();
assertEquals("I'm a real Mallard duck\r\n", baos.toString());
}
} 
