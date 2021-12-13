// import java.util.Scanner;

// Let the program calculate at which hour option 2 is better than option 1
// it's 10 btw.

public class WageCompare {
    public static void main(String[] args){
        // Scanner hourScan = new Scanner(System.in);
        // System.out.println("Please input the number of hours: ");
        // int hours = hourScan.nextInt();
        int hours = 10; 
        float tenCents = 0.10f; 
        float tenDollars = 10.00f;
        float centsWage = 0.0f;
        float dollarsWage = 0.0f; 

        for(int i = hours; i > 0; i--){
            tenCents = tenCents * 2;
        }
        centsWage = tenCents - 0.10f;

        dollarsWage = tenDollars * hours;

        if(dollarsWage > centsWage){
            System.out.printf("Option 1 is more benefical with a difference of $%.2f \n", (dollarsWage - centsWage));
        }
        else if(centsWage > dollarsWage){
            System.out.printf("Option 2 in more benefical with a difference of $%.2f \n" , (centsWage - dollarsWage));
        }
        else{
            System.out.println("Both options are equal");
        }
    //hourScan.close();
    }
}
