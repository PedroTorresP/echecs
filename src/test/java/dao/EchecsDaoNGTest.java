/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import elo.Joueur;
import java.util.ArrayList;
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
public class EchecsDaoNGTest {
    
    public EchecsDaoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of readEchec method, of class EchecsDao.
     */
    @Test
    public void testReadEchec() {
        System.out.println("readEchec");
        ArrayList expResult = null;
        ArrayList result = EchecsDao.readEchec();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of position method, of class EchecsDao.
     */
    @Test
    public void testPosition() {
        System.out.println("position");
        Joueur joueur = null;
        int expResult = 0;
        int result = EchecsDao.position(joueur);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeEchec method, of class EchecsDao.
     */
    @Test
    public void testWriteEchec() {
        System.out.println("writeEchec");
        String[] liste = null;
        EchecsDao.writeEchec(liste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
