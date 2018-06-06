/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.*;
import java.io.FileWriter;

/**
 *
 * @author Gabrielp
 */
public class FileRead {
    
    private static String TEXTE = "";
    private static boolean suite = false;
    
    public String ReadFile () {
        String [] nextLine;
        try{
        CSVReader reader = new CSVReader(new FileReader("Joueurs.csv"), '\n','\r','"');
        
        while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        if (suite==false){
            TEXTE = TEXTE + nextLine[0];
            suite=true;
        } else {TEXTE = TEXTE + ";" + nextLine[0];}

     }
        } catch (IOException e) {
            System.out.println(e);
        }
        return TEXTE;}
    
    public void WriteFile(String[] liste){
       try{
        CSVWriter writer = new CSVWriter(new FileWriter("Joueurs.csv"), ';');
     writer.writeNext(liste);
     writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
}
    
}
