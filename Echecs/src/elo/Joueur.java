package elo;

public class Joueur implements Comparable {
    
    private String nom, prenom, nationalite;

    private int pointsElo;

    
    public Joueur (String nom, String prenom, String nationalite, int pointsElo) { this.nom=nom; this.prenom=prenom; this.nationalite=nationalite; this.pointsElo=pointsElo; }
    
    
    public int getPoints() {return pointsElo;}
    
    public String getNom() {return nom;}
    
    /** Méthode de comparaison: ordre lexicographique sur (nombre de points Elo; nom et prénom du joueur).
     * - Ordre sur les points Elo: numérique décroissant.
     * - Ordre sur les nom et prénom: alphabétique croissant.
     * C'est-à-dire: (nb1; nom1) <= (nb2; nom2) ssi nb1 > nb2 ou ((nb1 = nb2) et (nom1 <= nom2))
     */
    public int compareTo (Object j) {
        int pointsJ = ((Joueur)j).getPoints();
        if (pointsElo>pointsJ) {return 1;}
        return 0;
    }
    
    public String toString() {return pointsElo+" : "+nom+" "+prenom+" - "+nationalite;}
    

    public String toText() {return nom+";"+prenom+";"+nationalite+";"+pointsElo;}

}
