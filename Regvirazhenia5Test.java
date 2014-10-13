package Regvirazhenia5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Regvirazhenia5Test {
private static String REGVIR = "(?<Letter>[А-Яа-я]{1})\\W*(?<Figures>\\d{3})\\W*(?<Letters>[А-Ба-б]{2})\\D*(?<Date>\\d{2})";
private static String number1 = "25-10-2014";
private static String number2 = "25 10 2014";
private static String number3 = "25 10 14";
private static String number4 = "25 октября 2014";
private static String number5 = "25/10/2014";
private Pattern myPattern = Pattern.compile(REGvir);

@Test
public void testMain() {
System.out.println("1 test");
Matcher myMatch = myPattern.matcher(number1);
if (myMatch.find()) {
for (int i = 1; i <= myMatch.groupCount(); i++) {
System.out.println(myMatch.group(i));
}
assertEquals("25", myMatch.group(1));
assertEquals("10", myMatch.group(2));
assertEquals("2014", myMatch.group(3));
} else {
fail();
}
}
@Test
public void testMain1() {
System.out.println("2 test");
Matcher myMatch = myPattern.matcher(number2);
if (myMatch.find()) {
for (int i = 1; i <= myMatch.groupCount(); i++) {
System.out.println(myMatch.group(i));
}
assertEquals("25", myMatch.group(1));
assertEquals("10", myMatch.group(2));
assertEquals("2014", myMatch.group(3));
} else {
fail();
}
}
@Test
public void testMain2() {
System.out.println("3 test");
Matcher myMatch = myPattern.matcher(number3);
if (myMatch.find()) {
for (int i = 1; i <= myMatch.groupCount(); i++) {
System.out.println(myMatch.group(i));
}
assertEquals("25", myMatch.group(1));
assertEquals("10", myMatch.group(2));
assertEquals("2014", myMatch.group(3));
} else {
fail();
}
}
@Test
public void testMain3() {
System.out.println("4 test");
Matcher myMatch = myPattern.matcher(number4);
if (myMatch.find()) {
for (int i = 1; i <= myMatch.groupCount(); i++) {
System.out.println(myMatch.group(i));
}
assertEquals("25", myMatch.group(1));
assertEquals("10", myMatch.group(2));
assertEquals("2014", myMatch.group(3));
} else {
fail();
}
}
@Test
public void testMain4() {
System.out.println("5 test");
Matcher myMatch = myPattern.matcher(number5);
if (myMatch.find()) {
for (int i = 1; i <= myMatch.groupCount(); i++) {
System.out.println(myMatch.group(i));
}
assertEquals("25", myMatch.group(1));
assertEquals("10", myMatch.group(2));
assertEquals("2014", myMatch.group(3));
} else {
fail();
}
}
}
