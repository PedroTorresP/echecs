/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import elo.Joueur;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Gabrielp
 */
public class FrmMainNGTest {
    
    public FrmMainNGTest() {
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
     * Test of fermer method, of class FrmMain.
     */
    @Test
    public void testFermer() {
        System.out.println("fermer");
        FrmMain instance = new FrmMain();
        instance.fermer();
    }

    /**
     * Test of retourne method, of class FrmMain.
     */
    @Test
    public void testRetourne() {
        System.out.println("retourne");
        Joueur joueur = new Joueur("Nom", "Prenom", "Pays", 310);
        FrmMain instance = new FrmMain();
        instance.retourne(joueur);
    }

    
}
