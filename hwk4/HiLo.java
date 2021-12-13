import java.util.Random;
import java.util.Scanner;

class HiLo{
    public static void main(String[] args){
        int randNum = seedRand();
        Scanner scan = new Scanner(System.in);
        System.out.println("Guessing Game: Start with a Guess! Or quit with -1.");
        int guess = 0;
        int score = 0;
        int guesses = 0;

        while(guess != randNum && guess != -1){
            System.out.println("Please input a guess between 0 - 99");
            guess = scan.nextInt();
        if(guess < randNum && guess > 0){
            System.out.println("Too Low, try again.");
            guesses++;
            System.out.println("Number of guesses:  " + guesses);
        }
        else if(guess > randNum){
            System.out.println("Too High, try again.");
            guesses++;
            System.out.println("Number of guesses:  " + guesses);
        }
        else if(guess == randNum){
            System.out.println("Just Right! Good job!");
            System.out.println("Number of guesses:  " + guesses);
            System.out.println("If you want to play again enter 0, if not enter -1 to quit");
            score++;
            randNum = seedRand();
            guesses = 0; 
            guess = scan.nextInt();
            if(guess == -1){
                System.out.println("Thanks for Playing! Your score is " + score + ".");
                break;
                }
            }
        if(guess == -1){
            System.out.println("Thanks for Playing! Your score is " + score + ".");
            break;
        }
        }
        scan.close();
    }

    static int seedRand(){
        Random myRandomNumber = new Random();
        int myTwoDigitNumber = Math.abs(myRandomNumber.nextInt() % 100);
        return myTwoDigitNumber; 
    }
}

