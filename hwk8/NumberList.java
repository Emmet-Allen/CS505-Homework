import java.util.Scanner;

public class NumberList {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int maxLength = 51; //From 0 to 50 = 51 elements
        int[] arr = new int[maxLength];

        System.out.println("Enter a value between 0 and 50 [-1 to end]: ");
        int number = scan.nextInt();

        while( (number >= 0 && number <= maxLength) || number != -1){
            arr[number] = arr[number] + 1;
            System.out.println("Enter a value between 0 and 50 [-1 to end]: ");
            number = scan.nextInt();
        }

        System.out.println("The number of occurense of the numbers are: ");
        for(int i = 0; i < maxLength; i++){
            if(arr[i] > 0){
                System.out.println("The value of " + i + " has " + arr[i] + " occurrences.");
            }
        }
    }
}
