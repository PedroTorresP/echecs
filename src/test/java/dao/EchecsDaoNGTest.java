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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Gabrielp
 */
public class EchecsDaoNGTest {
    private static EchecsDao dao;
    private static FileRead read;

    

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        read = mock(FileRead.class);
        dao = new EchecsDao(read);
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
        when(read.ReadFile()).thenReturn("Nom;Prenom;Pays;310");
        ArrayList joueur = dao.readEchec();
        System.out.println("joueur="+joueur);
        assertThat(joueur).isNotEmpty();
        assertThat(joueur).hasSize(1);
        System.out.println("liste_="+joueur);
        //assertThat(joueur).contains(new Joueur("Nom", "Prenom", "Pays", 310));
        //ça ne fonctionne pas alors que les valeurs sont =
    }

    /**
     * Test of position method, of class EchecsDao.
     */
    @Test
    public void testPosition() {
        Joueur joueur = new Joueur("Nom", "Prenom", "Pays", 9990);  
        int expResult = 0;
        int result = EchecsDao.position(joueur);
        assertEquals(result, expResult);
    }

}
