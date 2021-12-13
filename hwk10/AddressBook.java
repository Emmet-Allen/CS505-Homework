import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 

public class AddressBook{

    public static void main(String[] args){

        // If there are no arguments that are passed with the command line prompt print out an error message
        if(args.length != 1){
            System.out.println("Please try again and enter a proper text file to read in.");
            System.exit(1);
        }
        
        //Object Definitions before try/catch
        File textFile = new File(args[0]);
        Scanner scan = null;

        // We can set up a try / catch block to make sure that the file is a valid file 
        // Try: its a valid file, we can then perform program logic
        try{
            scan = new Scanner(textFile);
            ArrayList<Person> addressBook = new ArrayList<Person>();
            String firstNameTemp;
            String lastNameTemp;
            // We take in a string postal code, and parse it into an int to satisfy "Person" Obj data members
            String postalCodeTemp;
            int parsedPostalCode;

            while(scan.hasNextLine()){
                Person tempPerson = new Person();
                String line = scan.nextLine();
                String[] words = line.split("\t");
                //wordCounter: Used to distinguish between First name, Last name, Zip Code by manipulating info placement in file
                int wordCounter = 0;

                    for(int i = 0; i < words.length; i++){
                        //Condition for First Name
                        if(wordCounter == 0 && !(words[i].toString().equalsIgnoreCase("quit") ) ){
                            firstNameTemp = words[i];
                            tempPerson.setFirstName(firstNameTemp);
                            wordCounter++;                   
                        }
                        //Condition for Last Name                        
                        else if(wordCounter == 1){
                            lastNameTemp = words[i];
                            tempPerson.setLastName(lastNameTemp);
                            wordCounter++;
                        }
                        //Condition for Zip Code
                        else{
                            postalCodeTemp = words[i];
                            parsedPostalCode = Integer.parseInt(postalCodeTemp);
                            tempPerson.setpostalCode(parsedPostalCode);
                            addressBook.add(tempPerson);
                            wordCounter = 0;
                            parsedPostalCode = 0;
                        }
                    }
                }
            //Output addressBook info in Console
            System.out.println("Input File:");
            for(int i = 0; i < addressBook.size(); i++){
            System.out.println(addressBook.get(i).toString());
            }
        }

        // Catch: its not a valid file or file not found in the local dir, display an error message
        catch(FileNotFoundException e) {
            System.out.println("Please try again. Enter a proper text file argument.");
            //Program will close
            System.exit(1);
        }
        // Finally: Close out scanner
        finally{
            scan.close();
        }
    }
}