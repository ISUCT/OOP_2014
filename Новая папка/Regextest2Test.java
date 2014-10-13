/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regextest2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Stud_17
 */
public class Regextest2Test {

    private static String REGEX = "(?<Letter>[А-Яа-я]{1})\\W*(?<Figures>\\d{3})\\W*(?<Letters>[А-Ба-б]{2})\\D*(?<Region>\\d{2})";
    private static String number1 = "а000аб37";
    private static String number2 = "а 000 аа 37";
    private static String number3 = "а000аа регион 37";
    private static String number4 = "а-000-аа-37";
    private static String number5 = "а-000-аа 37";
    private Pattern myPattern = Pattern.compile(REGEX);

    @Test
    public void testMain() {
        System.out.println("1 test");
        Matcher myMatch = myPattern.matcher(number1);
        if (myMatch.find()) {
            for (int i = 1; i <= myMatch.groupCount(); i++) {
                System.out.println(myMatch.group(i));
            }
            assertEquals("а", myMatch.group(1));
            assertEquals("000", myMatch.group(2));
            assertEquals("аб", myMatch.group(3));
            assertEquals("37", myMatch.group(4));
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
            assertEquals("а", myMatch.group(1));
            assertEquals("000", myMatch.group(2));
            assertEquals("аа", myMatch.group(3));
            assertEquals("37", myMatch.group(4));
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
            assertEquals("а", myMatch.group(1));
            assertEquals("000", myMatch.group(2));
            assertEquals("аа", myMatch.group(3));
            assertEquals("37", myMatch.group(4));
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
            assertEquals("а", myMatch.group(1));
            assertEquals("000", myMatch.group(2));
            assertEquals("аа", myMatch.group(3));
            assertEquals("37", myMatch.group(4));
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
            assertEquals("а", myMatch.group(1));
            assertEquals("000", myMatch.group(2));
            assertEquals("аа", myMatch.group(3));
            assertEquals("37", myMatch.group(4));
        } else {
            fail();
        }
        
        
    }
}
