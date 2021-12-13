import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleAddressBook {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> addressBook = new ArrayList<Person>();

        String firstNameTemp;
        String lastNameTemp;
        int postalCodeTemp;

        System.out.println("Enter Input in the form of (first_name)<tab>(last_name)<tab>(zip_code)}:");
        firstNameTemp = scan.next();
        lastNameTemp = scan.next();
        postalCodeTemp = scan.nextInt();

        while( !(firstNameTemp.equalsIgnoreCase("quit")) ){
            Person tempPerson = new Person(firstNameTemp, lastNameTemp, postalCodeTemp);
            addressBook.add(tempPerson); 
            System.out.println("Enter Input in the form of (first_name)<tab>(last_name)<tab>(zip_code)}:");
            firstNameTemp = scan.next();
            if(firstNameTemp.equalsIgnoreCase("quit")){
                break;
            }
            else{
            lastNameTemp = scan.next();
            postalCodeTemp = scan.nextInt();
            }
        }

        System.out.println("Output:");
        for(int i = 0; i < addressBook.size(); i++){
            System.out.println(addressBook.get(i).toString());
        }

        scan.close();
    }
    
}