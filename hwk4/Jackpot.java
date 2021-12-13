import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    int num1, num2, num3, winCounter = 0; 
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    printStars(15);
    System.out.println("*SLOT MACHINE!*");
    printStars(15);
    int spin = 0;

    while(spin != -1){
        System.out.println("Enter 1 to Spin or Enter -1 to exit.");
        spin = scan.nextInt();
        if(spin == -1){
            System.out.println("Thanks for playing! You won: " + winCounter + " coins!");
            break;
        }
        num1 = Math.abs(rand.nextInt() % 10);
        num2 = Math.abs(rand.nextInt() % 10);
        num3 = Math.abs(rand.nextInt() % 10);
        printStars(13);
        System.out.println("* " + num1 + " * " + num2 + " * " + num3 + " *");
        printStars(13);
        if( (num1 == num2) && (num2 == num3) && (num1 == num3) ){
            System.out.println("JACKPOT! Win 100 coins!");
            winCounter+=100;
            System.out.println("You currently have " + winCounter);
        }
        else if( (num1 == num2) || (num2 == num3) || (num1 == num3) ){
            System.out.println("MATCH! Win 50 coins!");
            winCounter+=50;
            System.out.println("You currently have " + winCounter);
        }
        else{
            System.out.println("Nothing.");
            System.out.println("You currently have " + winCounter);
        }
    }
    scan.close();
  }

  static void printStars(int stars){
      for(int i = 0; i < stars; i++){
          System.out.print('*');
      }
      System.out.println(" ");
  }
}