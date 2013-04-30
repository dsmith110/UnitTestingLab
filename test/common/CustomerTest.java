/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dsmith110
 */
public class CustomerTest {
    
    public CustomerTest() {
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
    public void testCustomersAddreesesShouldBeEqual() {
        Customer c1 = new Customer();
        c1.setAddress("1234");
        Customer c2 = new Customer();
        c2.setAddress("1234");
        
        assertEquals(c1, c2);
    }
    
    @Test
    public void testCustomersAddreesesShouldNotEqual() {
        Customer c1 = new Customer();
        c1.setAddress("1234");
        Customer c2 = new Customer();
        c2.setAddress("9999");
        
        assertFalse(c1.equals(c2));
    }
    
}
