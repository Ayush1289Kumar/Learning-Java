        /*
        Creat a class Game, which allows a user to play "Guess the number".
        game once, Game should have the following methods:
        1. Constructor to generate the random number.
        2. takeUserInput() to take the user input.
        3. isCorrectNumber() to detect whether the number entered by the user is true.
        4. getter and setter for noOfGuesses

        user properties such as noOfGuesses(int), etc to get this task done!
        */

import java.util.Random;
import java.util.Scanner;


class Game{
    int cpu,num;
    int noOfGuesses=0;
    Scanner sc = new Scanner(System.in);
    public Game() {
        Random rand = new Random();
        cpu = rand.nextInt(100)+1;
    }

    void  takeUserInput(){

        System.out.print("\nEnter a number (1-100): ");
        num = sc.nextInt();
    }

    boolean isCorrectNumber(){
        return num==cpu;
    }
    int get_noOfGuesses(){
        return noOfGuesses;
    }

    void set_noOfGuesses(int n){
        noOfGuesses = n;
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        
        Game game = new Game();
        int guess = game.get_noOfGuesses();
        while (true) { 
            game.takeUserInput();
            guess++;
            game.set_noOfGuesses(guess);

            if (game.isCorrectNumber()){
                System.out.println("\nCongratulation you won the game!");
                System.out.println("Your Score: "+(100-guess)+"/100");
                break;
            }
            
            if (game.num > game.cpu){
                System.out.println("Guessed number is greater than the cpu number.\n");
            }

            else if(game.num < game.cpu){
                System.out.println("Guessed number is smaller than the cpu number.\n");
            }


        }

    }
}
