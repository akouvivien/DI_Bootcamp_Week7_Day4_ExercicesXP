package Exercice3;

import java.util.Random;

public class Exercice3 {
   
    public static void  random(int X, int N){
        Random random = new Random();

System.out.println("nombre aleatoire generé");
        for (int i = 0; i < N; i++) {
            int value = random.nextInt(X)+1;
            System.out.println(value);

        }
    }
}
