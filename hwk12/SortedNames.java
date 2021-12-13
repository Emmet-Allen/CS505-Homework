import java.io.File;
import java.util.Scanner;
import java.util.Map;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class SortedNames{
    public static void main (String[] args) throws IOException{

        if(args.length != 1){
            System.out.println("Please enter a file argument in the prompt");
            System.exit(1);
        }

        String company;
        String name;
        File textFile = new File(args[0]);
        Scanner scan = null;
        BufferedWriter output = null;


        try{
            scan = new Scanner(textFile);
            File file = new File("GuestList.txt");
            output = new BufferedWriter(new FileWriter(file));
            HashMap<String, ArrayList<String>> companyName = new HashMap<String, ArrayList<String>>();
            while(scan.hasNext()){
                String nameComp = scan.nextLine();
                Email emailAddress = new Email(nameComp);
                company = emailAddress.parseCompanyName();
                name = emailAddress.parseEmailName();
                if(!companyName.containsKey(company)){
                    ArrayList<String> nameArr = new ArrayList<String>();
                    nameArr.add(name);
                    companyName.put(company, nameArr);
                }
                else{
                    companyName.get(company).add(name);
                }
            }

            System.out.println("\n" + "Company" + "\t" + "Employee Name" );
            Iterator it = companyName.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String, ArrayList<String>> entry = (Map.Entry)it.next();
                String key = entry.getKey();
                ArrayList<String> value = entry.getValue();
                for(String str: value){
                    String printName = str;
                    System.out.println(key + "\t" + printName);
                }
            }

            System.out.println("\n" + "==========Histogram=============");
            Iterator itr = companyName.entrySet().iterator();
            while(itr.hasNext()){
                Map.Entry<String, ArrayList<String>> entry = (Map.Entry)itr.next();
                String key = entry.getKey();
                ArrayList<String> value = entry.getValue();
                System.out.print("Company: " + key + " || " );
                System.out.print("Atendees: ");
                for(String str: value){
                    System.out.print('*');
                }
                System.out.println("\n================================");
            }

            System.out.println("\n" + "Did Bill Gates Attend the Confrence?");

            Iterator iter = companyName.entrySet().iterator();
            while(iter.hasNext()){
                Map.Entry<String, ArrayList<String>> entry = (Map.Entry)iter.next();
                ArrayList<String> value = entry.getValue();
                if(value.contains("bill.gates")){
                    System.out.println("Yes Bill Gates Attedned the Confrence.");
                }
            }

            System.out.println("\nPrinting Guest List into file 'GuestList.txt' ");
            Iterator outIt = companyName.entrySet().iterator();
            while(outIt.hasNext()){
                Map.Entry<String, ArrayList<String>> entry = (Map.Entry)outIt.next();
                String key = entry.getKey();
                ArrayList<String> value = entry.getValue();
                for(String str: value){
                    output.write(key + "\t" + str + "\n");
                }
            }
        } 

    catch(FileNotFoundException e){
        System.out.println("Please enter a valid file in the prompt");
        System.exit(1);
    }
    finally{
        scan.close();
        output.close();
        }
    }
}