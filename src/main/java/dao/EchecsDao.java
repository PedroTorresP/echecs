/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.*;
import elo.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.opencsv.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;

//import outils.*;
/**
 *
 * @author Gabrielp
 */
public class EchecsDao {
    private static final String JOUEURS = "Joueurs.txt";
    private static ArrayList lst = new ArrayList();
    
    public static ArrayList readEchec() {
        String [] nextLine;
        try{
        CSVReader reader = new CSVReader(new FileReader("Joueurs.csv"), '\n','\r','"');
        
        while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0]);
            String str = nextLine[0];
            StringTokenizer strTok = new StringTokenizer(str,";");
            while (strTok.hasMoreTokens()) {
                String nom = strTok.nextToken();
                System.out.println(nom);
                String prenom = strTok.nextToken();
                System.out.println("prenom ok");
                String pays = strTok.nextToken();
                System.out.println("pays ok");
                int elo = Integer.parseInt(strTok.nextToken());
                System.out.println("elo ok");
                Joueur joueur = new Joueur(nom,prenom,pays,elo);
                int pos = position(joueur);
                lst.add(pos, joueur);
            }
        return lst;
        
     }
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
        
        
    }
    
    public static int position (Joueur joueur) {
        for(int i=0;i<lst.size();i++){
            Joueur joueur2 = (Joueur)lst.get(i);
            if (joueur.compareTo(joueur2)>0) {return i;}
        }
        return lst.size();
    }
    public static void writeEchec (String[] liste) {
        try{
        CSVWriter writer = new CSVWriter(new FileWriter("Joueurs.csv"), ';');
     writer.writeNext(liste);
     writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
