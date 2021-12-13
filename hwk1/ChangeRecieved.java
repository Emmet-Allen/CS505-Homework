import java.util.Scanner;

// Outputs the exact change recieved
public class ChangeRecieved {
    public static void main(String[] args){
    int number = 0;
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the purchase amount: ");
    number = scan.nextInt();
    
    final int dollar = 100;
    int change = dollar - number;  
    final int changeStore = change;
    int numQuarters = 0;
    int numDimes = 0;
    int numNickles = 0;
    int numPennies = 0;
    
    final byte valQuarters = 25;
    final byte valDimes = 10;
    final byte valNickles = 5;

    while(change != 0){
        if(change >= valQuarters){
             numQuarters = change / valQuarters;
             change = change % valQuarters;
        }
        else if(change < valQuarters && change > valDimes){
            numDimes = change / valDimes;
            change = change % valDimes;
        }
        else if(change < valDimes && change > valNickles){
            numNickles = change / valNickles;
            change = change % valNickles; 
        }
        else if(change < valNickles){
            numPennies = change;
            change = numPennies % change;
        }
    }

    System.out.println("Your change of " + changeStore + " cents is given as: ");
    System.out.println(numQuarters + " Quarters");
    System.out.println(numDimes + " Dimes");
    System.out.println(numNickles + " Nickles");
    System.out.println(numPennies + " Pennies");
   
    scan.close();
    }

}
