/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dns
 */

public class RegexTest {
    private static String REGEX1 = "(?<Code1>\\d{1})\\D(?<Code2>\\d{3})\\D(?<num1>\\d{3})(?<num2>\\d{2})(?<num3>\\d{2})";
    private static String number1 = "8(800)1234567";
    private Pattern myPattern1 = Pattern.compile(REGEX1);

    @Test
    public void testMain1() {
       System.out.println("1 test");
        Matcher myMatch = myPattern1.matcher(number1);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("8",myMatch.group("Code1"));
            assertEquals("800",myMatch.group("Code2"));
            assertEquals("123",myMatch.group("num1"));
            assertEquals("45",myMatch.group("num2"));
            assertEquals("67",myMatch.group("num3"));
        } else {
            fail();
        }
    }
    
    private static String REGEX2 = "(?<Code1>\\d{1})(?<Code2>\\d{3})(?<num1>\\d{3})(?<num2>\\d{2})(?<num3>\\d{2})";
    private static String number2 = "88001234567";
    private Pattern myPattern2 = Pattern.compile(REGEX2);

    @Test
    public void testMain2() {
       System.out.println("2 test");
        Matcher myMatch = myPattern2.matcher(number2);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("8",myMatch.group("Code1"));
            assertEquals("800",myMatch.group("Code2"));
            assertEquals("123",myMatch.group("num1"));
            assertEquals("45",myMatch.group("num2"));
            assertEquals("67",myMatch.group("num3"));
        } else {
            fail();
        }
    }
    
    private static String REGEX3 = "(?<Code1>\\+\\d{1})(?<Code2>\\d{3})(?<num1>\\d{3})(?<num2>\\d{2})(?<num3>\\d{2})";
    private static String number3 = "+78001234567";
    private Pattern myPattern3 = Pattern.compile(REGEX3);
    
    @Test
    public void testMain3() {
       System.out.println("3 test");
        Matcher myMatch = myPattern3.matcher(number3);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("+7",myMatch.group("Code1"));
            assertEquals("800",myMatch.group("Code2"));
            assertEquals("123",myMatch.group("num1"));
            assertEquals("45",myMatch.group("num2"));
            assertEquals("67",myMatch.group("num3"));
        } else {
            fail();
        }
    }
    
    private static String REGEX4 = "(?<Code1>\\d{1})\\D(?<Code2>\\d{3})\\D(?<num1>\\d{3})\\D(?<num2>\\d{2})\\D(?<num3>\\d{2})";
    private static String number4 = "8(800)123-45-67";
    private Pattern myPattern4 = Pattern.compile(REGEX4);
    
    @Test
    public void testMain4() {
       System.out.println("4 test");
        Matcher myMatch = myPattern4.matcher(number4);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("8",myMatch.group("Code1"));
            assertEquals("800",myMatch.group("Code2"));
            assertEquals("123",myMatch.group("num1"));
            assertEquals("45",myMatch.group("num2"));
            assertEquals("67",myMatch.group("num3"));
        } else {
            fail();
        }
    }
    
    private static String REGEX5 = "(?<Code1>\\d{1})\\D(?<Code2>\\d{3})\\D(?<num1>\\d{3})\\s(?<num2>\\d{2})\\s(?<num3>\\d{2})";
    private static String number5 = "8(800)123 45 67";
    private Pattern myPattern5 = Pattern.compile(REGEX5);
    
    @Test
    public void testMain5() {
       System.out.println("5 test");
        Matcher myMatch = myPattern5.matcher(number5);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("8",myMatch.group("Code1"));
            assertEquals("800",myMatch.group("Code2"));
            assertEquals("123",myMatch.group("num1"));
            assertEquals("45",myMatch.group("num2"));
            assertEquals("67",myMatch.group("num3"));
        } else {
            fail();
        }
    }
}