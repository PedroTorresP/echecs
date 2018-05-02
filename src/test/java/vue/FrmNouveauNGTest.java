/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Gabrielp
 */
public class FrmNouveauNGTest {
    
    public FrmNouveauNGTest() {
    }




    /**
     * Test of valide method, of class FrmNouveau.
     */
    @Test
    public void testValide() {
        System.out.println("valide");
        FrmNouveau instance = new FrmNouveau();
        boolean expResult = false;
        boolean result = instance.valide();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
