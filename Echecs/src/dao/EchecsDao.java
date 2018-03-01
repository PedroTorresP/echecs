/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.*;
import elo.*;
import outils.*;
/**
 *
 * @author Gabrielp
 */
public class EchecsDao {
    
    private static final String JOUEURS = "Joueurs.txt";
    private static ArrayList lst = new ArrayList();
    
    public static ArrayList readEchec() {
        String[] txt = outils.FileStr.read(JOUEURS);
        for (int i=0;i<txt.length;i++) {
            String str = txt[i];
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
        }
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
        outils.FileStr.write("Joueurs.txt", liste);
    }
}
