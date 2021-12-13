import java.util.Scanner;

class EvenNumbers{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int number;
    int storeNumber; 
    System.out.println("Please enter a integer greater than or equal to 2: ");
    number = scan.nextInt();
    storeNumber = number; 
  
    if(number < 2){
      while(number < 2){
      System.out.println("Please enter a integer greater than or equal to 2: ");
      number = scan.nextInt();
      storeNumber = number; 
      }
    }
    else if( (number > 2) && (number % 2 == 1) ){
      number = number - 1;
    }

    if(number >= 2){
      System.out.println("Here are the even numbers between " + storeNumber + " and 2:");
      System.out.println(storeNumber);

      if(storeNumber % 2 == 1){
        while(number >= 2){
          System.out.println(number);
          number = number - 2; 
          }
        }
    
      else{
        while(number >= 2){
          number = number - 2; 
            if(number != 0){
            System.out.println(number);
            }
        }
      }
    }
    scan.close();
  }
}
