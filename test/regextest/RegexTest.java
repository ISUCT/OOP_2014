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
    private static String REGEX = "(?<Code1>\\d{1})\\D?(?<Code2>\\d{3})\\D?(?<num1>\\d{3})\\W?(?<num2>\\d{2})\\W?(?<num3>\\d{2})";
    private static String number1 = "8(800)1234567";
    private static String number2 = "88001234567";
    private static String number3 = "8(800)123-45-67";
    private static String number4 = "8(800)123 45 67";
    private Pattern myPattern = Pattern.compile(REGEX);

    @Test
    public void testMain1() {
       System.out.println("1 test");
        Matcher myMatch = myPattern.matcher(number1);
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
    
    @Test
    public void testMain2() {
       System.out.println("2 test");
        Matcher myMatch = myPattern.matcher(number2);
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
  
    @Test
    public void testMain4() {
       System.out.println("3 test");
        Matcher myMatch = myPattern.matcher(number3);
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
      
    @Test
    public void testMain5() {
       System.out.println("4 test");
        Matcher myMatch = myPattern.matcher(number4);
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