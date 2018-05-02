/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elo;

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
public class JoueurNGTest {
    
    public JoueurNGTest() {
    }



    /**
     * Test of getPoints method, of class Joueur.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Joueur instance = new Joueur("nom", "prenom", "nationalite", 1000);
        int expResult = 1000;
        int result = instance.getPoints();
        assertEquals(result, expResult);
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = new Joueur("nom", "prenom", "nationalite", 1000);
        String expResult = "nom";
        String result = instance.getNom();
        assertEquals(result, expResult);
    }

    /**
     * Test of compareTo method, of class Joueur.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object j = new Joueur("nom", "prenom", "nationalite", 1000);
        Joueur instance = new Joueur("nom", "prenom", "nationalite", 1000);
        int expResult = 0;
        int result = instance.compareTo(j);
        assertEquals(result, expResult);
    }

    /**
     * Test of toString method, of class Joueur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Joueur instance = new Joueur("nom", "prenom", "nationalite", 1000);
        String expResult = "1000 : nom prenom - nationalite";
        String result = instance.toString();
        assertEquals(result, expResult);
    }

    /**
     * Test of toText method, of class Joueur.
     */
    @Test
    public void testToText() {
        System.out.println("toText");
        Joueur instance = new Joueur("nom", "prenom", "nationalite", 1000);
        String expResult = "nom;prenom;nationalite;1000";
        String result = instance.toText();
        assertEquals(result, expResult);
    }

    
}
