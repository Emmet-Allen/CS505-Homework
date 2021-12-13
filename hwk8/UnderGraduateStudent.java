public class UnderGraduateStudent extends Student {
    
    UnderGraduateStudent(){};

    UnderGraduateStudent(int _id){
        super(_id);
    }

    UnderGraduateStudent(int _id, int _midTermExam, int _finalExam){
        super(_id, _midTermExam, _finalExam);
    }

    public char getLetterGrade() {
        double avg = calcAvg();
        char letterGrade;
        
        if(avg <= 100 && calcAvg() >= 90){
           letterGrade = 'A';
        }
        else if(avg <= 89 && calcAvg() >= 80){
            letterGrade ='B';
        }
        else if(avg <= 79 && calcAvg() >= 70){
            letterGrade ='C';
        }
        else if(avg <= 69 && calcAvg() >= 60){
            letterGrade ='D';
        }
        else{
            letterGrade ='F';
        }
        return letterGrade;
    }
}
