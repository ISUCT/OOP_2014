/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author user
 */
public class RegexTestTest {

    private static String REGEX = "(?<Code>\\d{3})\\D(?<num1>\\d{3})\\D(?<num2>\\d{4})";
    private static String number1 = "800-555-1212";
    private Pattern myPattern = Pattern.compile(REGEX);

    @Test
    public void testMain() {
       System.out.println("1 test");
        Matcher myMatch = myPattern.matcher(number1);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("800",myMatch.group(1));
            assertEquals("555",myMatch.group(2));
            assertEquals("1212",myMatch.group(3));
        } else {
            fail();
        }
    }
    
    @Test
    public void testMainNamed() {
       System.out.println("2 test");
        Matcher myMatch = myPattern.matcher(number1);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("800",myMatch.group("Code"));
            assertEquals("555",myMatch.group("num1"));
            assertEquals("1212",myMatch.group("num2"));
        } else {
            fail();
        }
    }

}
