import java.util.Random;
import java.util.Scanner;

public class TeachMulti {
    public static void main (String[] args){
        Random myRandomNumber = new Random();
        Scanner scan = new Scanner(System.in);
        Scanner exitScan = new Scanner(System.in);

        int myOneDigitNumber = Math.abs(myRandomNumber.nextInt() % 10);
        int mySecondOneDigitNumber = Math.abs(myRandomNumber.nextInt() % 10);
        int correctAnswer = (myOneDigitNumber * mySecondOneDigitNumber);
        int exit = 0; 

        System.out.println("How much is " + myOneDigitNumber + " times " + mySecondOneDigitNumber + "?");
        int inputAnswer = scan.nextInt();

        while( exit != -1){
            if(inputAnswer != correctAnswer){
            System.out.println("No. Please try again.");
            inputAnswer = scan.nextInt();
            }

            else{
                System.out.println("Very Good!");
                System.out.println("Please Enter -1 to exit");
                exit = exitScan.nextInt(); 
            }
        }
    scan.close();
    exitScan.close();
    }
}
