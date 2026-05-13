import java.sql.SQLOutput;
import java.util.Scanner;


public class _4madLibsGame {
    public static void main(String[] args){
        // ACTIVITY


        /* MAD LIBS GAME:-
           A Mad Libs game is a popular word game
           where players fill in blanks in a story
           with different parts of speech.
        */
        /*
           Adjective:-
           An adjective is a word that describes,
           modifies, or provides more information
           about a noun or pronoun.

           Noun:- a word that is the name of a thing,
           an idea, a place or a person

           Verb:- a word or group of words that is used
           to indicate that something happens or exists,
           for example bring, happen, be, do
        */
        Scanner obj = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = obj.nextLine();

        System.out.print("Enter an noun (animal or person): ");
        noun1 = obj.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = obj.nextLine();

        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = obj.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = obj.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + " Zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        obj.close();
    }
}
