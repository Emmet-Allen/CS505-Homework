class Student{
    private int id;
    private int midtermExam;
    private int finalExam;

    Student(){};

    Student(int _id){
        id = _id;
    }

    Student(int _id, int _midtermExam, int _finalExam){
        id = _id;
        midtermExam = _midtermExam;
        finalExam = _finalExam;
    }

    public double calcAvg(){
        double avg;
        avg = (midtermExam + finalExam) / 2.0;
        return avg;
    }

    public char getLetterGrade(){
        char letterGrade = 'Z';
        return letterGrade;
    }
}