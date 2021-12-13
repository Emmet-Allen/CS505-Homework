import java.util.Scanner; 

public class GradesTest {
    public static void main(String[] args){
        int temp[];
        int numGrades;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of grades to input: ");
        numGrades = scan.nextInt();
        temp = new int[numGrades];

        for(int i = 0; i < numGrades; i++){
            System.out.println("Enter grade " + (i + 1) + ": ");
            temp[i] = scan.nextInt();
        }

        Grades classroom = new Grades(temp);
        classroom.getValues();
        int highest = classroom.highest();
        System.out.println("The classroom highest is: " + highest);
        int lowest = classroom.lowest();
        System.out.println("The classroom lowest is: " + lowest);
        int numOfScores = classroom.numOfGrades();
        System.out.println("The classroom number of grades is: " + numOfScores);
        int numOfFailing = classroom.numOfFailingGrades(80);
        System.out.println("The classroom number of failures is: " + numOfFailing);
        classroom.histogram();

        System.out.println();
        System.out.println("This is the Start of a new Classroom: ");

        Grades newClassroom = new Grades();
        int exam2[] = {100, 23, 78, 95, 76};
        newClassroom.setValues(exam2);
        newClassroom.getValues();
        int newHighest = newClassroom.highest();
        int newLowest = newClassroom.lowest();
        int newNumOfScores = newClassroom.numOfGrades();
        int newNumOfFailing = newClassroom.numOfFailingGrades(80);
        newClassroom.histogram();

        scan.close();
    }
    
}
