package Exercice1;

public class Exercice1 {

    public static double Surface( double rayon){
        double Surface =  Math.PI * Math.pow(rayon, 2) ;
        return Surface;
    }

    public static double Perimetre( double rayon){
        double perimetre = 2 * Math.PI * rayon;
        return perimetre;
    }
}
