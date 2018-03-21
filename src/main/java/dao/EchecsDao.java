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
        try{
        
        CSVReader reader = new CSVReader(new FileReader("Joueurs.csv"), '\n', ';');
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0] + nextLine[1] + "etc...");
     }
        } catch (IOException e) {
            System.out.println(e);
        }
        
        
        
        
        //La lecture du fichier est à corriger
        /*String[] txt = new String[25];
        try {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("Joueurs.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(streamReader);
        String line; int i=0;
        while((line = in.readLine()) != null)
        {
            txt[i] = line;
        }
        in.close();
        } catch (IOException e) {
            System.out.println("Fichier introuvable !");
        }*/
        
        //variable str pour tester si ça fonctionne
        String str = "Grischuk;Alexander;RUS;2772\n" +
"Giri;Anish;NED;2752\n" +
"Li;Chao b;CHN;2732\n" +
"Navara;David;CZE;2740\n" +
"Jakovenko;Dmitry;RUS;2730\n" +
"Caruana;Fabiano;USA;2799\n" +
"Nakamura;Hikaru;USA;2781\n" +
"Aronian;Levon;ARM;2805\n" +
"Ding;Liren;CHN;2777\n" +
"Carlsen;Magnus;NOR;2837\n" +
"Matlakov;Maxim;RUS;2735\n" +
"Vachier-Lagrave;Maxime;FRA;2789\n" +
"Harikrishna;P.;IND;2744\n" +
"Svidler;Peter;RUS;2765\n" +
"Le;Quang Liem;VIE;2737\n" +
"Wojtaszek;Radoslaw;POL;2736\n" +
"Karjakin;Sergey;RUS;2760\n" +
"Mamedyarov;Shakhriyar;AZE;2799\n" +
"Radjabov;Teimour;AZE;2748\n" +
"Topalov;Veselin;FID;2749\n" +
"Anand;Viswanathan;IND;2782\n" +
"Kramnik;Vladimir;RUS;2787\n" +
"So;Wesley;USA;2788\n" +
"Yu;Yangyi;CHN;2751\n" +
"Wei;Yi;CHN;2743";
        
        //for (int i=0;i<txt.length;i++) {
            //String str = txt[i];
            StringTokenizer strTok = new StringTokenizer(str,";\r\n");
            while (strTok.hasMoreTokens()) {
                String nom = strTok.nextToken();
                String prenom = strTok.nextToken();
                String pays = strTok.nextToken();
                int elo = Integer.parseInt(strTok.nextToken());
                Joueur joueur = new Joueur(nom,prenom,pays,elo);
                int pos = position(joueur);
                lst.add(pos, joueur);
            }
        //}
        return lst;
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
