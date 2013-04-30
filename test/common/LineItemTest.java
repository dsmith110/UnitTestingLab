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
public class LineItemTest {
    private LineItem i1, i2;
    
    public LineItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        i1 = new LineItem();
        i2 = new LineItem();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testLineItemsEqual() {
        i1.setId(45);
        i2.setId(45);
        
        assertEquals(i1, i2);
    }
    
    @Test
    public void testLineItemsDoNotEqual() {
        i1.setId(45);
        i2.setId(4);
        
        assertFalse(i1.equals(i2));
    }
}
