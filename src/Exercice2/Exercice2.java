package Exercice2;

public class Exercice2 {


    public static void Operation( long a, long b, long c){
       
            double produit =Math.multiplyExact(a, Math.multiplyExact(b, c));
            System.out.println("le produit des nombres est "+produit);

            double somme = Math.addExact(a, Math.addExact(b, c));
            System.out.println("La somme est "+somme);

            double moyenne = somme / 3;
            System.out.println("La moyenne est "+moyenne);
            
            double maximum = Math.max(a, Math.max(b, c));
            System.out.println("Le maximum est "+maximum);

            double minimun = Math.min(a, Math.min(b, c));
            System.out.println("Le maximum est "+minimun);
            

    }
}
