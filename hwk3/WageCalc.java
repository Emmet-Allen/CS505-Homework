import java.util.Scanner;

public class WageCalc {
    public static void main(String[] args){
        Scanner menuScan = new Scanner(System.in);
        Scanner hourScan = new Scanner (System.in);
        int hours;
        int menuChoice; 
        float wage = 0; 
        float tenDollar = 10.00f;
        float tenCents = 0.10f;

         printStar();
         System.out.println(" \t \t \t Menu");
         printStar();
         System.out.println("1) \t Calculate earnings at $10.00/hr");
         System.out.println("2) \t Calculate earnings at $.10 doubled each hour");
         System.out.println("3) \t Exit Program");
         printStar();
         menuChoice = menuScan.nextInt(); 

        while(menuChoice != 3){
            if(menuChoice == 1){
                System.out.print("How many Hours? ");
                hours = hourScan.nextInt();
                wage = hours * tenDollar;
                System.out.println("You will earn $" + (int)wage);
                System.out.println("Please choose another option");
                wage = 0;
                menuChoice = menuScan.nextInt(); 
            }
            else if(menuChoice == 2){
                System.out.print("How many Hours? ");
                hours = hourScan.nextInt();
                for(int i = hours; i > 0; i--){
                    tenCents = tenCents * 2; // cents * 2 
                }
                wage = tenCents - 0.10f; // total cents - 1: geometric sequence (2n - 1)
                System.out.printf("You will earn $%.2f \n", wage);
                System.out.println("Please choose another option");
                tenCents = 0.10f;
                wage = 0;
                menuChoice = menuScan.nextInt();
            }
        }
        menuScan.close();
        hourScan.close();
    }

    public static void printStar(){
        for(int i = 0; i < 60; i++){
            System.out.print('*');
        }
        System.out.println();
    }
}
