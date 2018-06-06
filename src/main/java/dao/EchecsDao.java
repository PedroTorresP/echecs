/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.*;
import elo.*;

/**
 *
 * @author Gabrielp
 */
public class EchecsDao {
    private static ArrayList lst = new ArrayList();
    private static FileRead read = new FileRead();
    
    public EchecsDao(FileRead read) {this.read = read;}
    
    public static ArrayList readEchec() {
            StringTokenizer strTok = new StringTokenizer(read.ReadFile(),";");
            while (strTok.hasMoreTokens()) {
                String nom = strTok.nextToken();
                String prenom = strTok.nextToken();
                String pays = strTok.nextToken();
                int elo = Integer.parseInt(strTok.nextToken());
                Joueur joueur = new Joueur(nom,prenom,pays,elo);
                int pos = position(joueur);
                lst.add(pos, joueur);
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


}
