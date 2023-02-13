import java.util.Scanner;
import Exercice1.Exercice1;
import Exercice2.Exercice2;
import Exercice3.Exercice3;
import Exercice4.Person;

public class App {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Exercice 1--------------------
        System.out.println("Exercice 1");
        System.out.println("entrez le rayon d'un cercle \n");
        double rayon = scanner.nextDouble();
        System.out.println("le perimetre du cercle de rayon"+rayon+ " est "+ Exercice1.Perimetre(rayon));
        System.out.println("la surface du cercle de rayon"+rayon+ " est "+ Exercice1.Surface(rayon));

        //Exercice 2----------------------
        System.out.println("Exercice 2\n");
        Exercice2.Operation(1, 2, 3);

         //Exercice 3----------------------
        System.out.println("entrez un chiffre N");
        int N = scanner.nextInt();

        System.out.println("entrez un chiffre X");
        int X = scanner.nextInt();

        Exercice3.random(X,N);
        //Exercice 4 ----------------------
         Person person = new Person("Akou", "jean",20);
        System.out.println(person.introduce()); 




    }
}
