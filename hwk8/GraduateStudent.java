public class GraduateStudent extends Student {

    GraduateStudent(){};

    GraduateStudent(int _id){
        super(_id);
    }

    GraduateStudent(int _id, int _midtermExam, int _finalExam){
        super(_id, _midtermExam, _finalExam);
    }

    public char getLetterGrade(){
        double avg = calcAvg();
        char letterGrade;

        if(avg <= 100 && avg >= 90){
            letterGrade = 'A';
        }
        else if(avg <= 89 && avg >= 80){
            letterGrade = 'B';
        }
        else if(avg <= 79 && avg >= 70){
            letterGrade = 'C';
        }
        else{
            letterGrade = 'F';
        }

        return letterGrade; 
    }
    
}
