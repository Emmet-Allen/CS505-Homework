public class StudentTest {
    public static void main (String[] args){
        UnderGraduateStudent billy = new UnderGraduateStudent(912, 64, 73);

        UnderGraduateStudent maria = new UnderGraduateStudent(12, 93, 92);

        GraduateStudent sam = new GraduateStudent(456, 82, 93);

        GraduateStudent mimi = new GraduateStudent(1738, 63, 75);
        
        System.out.println("Billy's UnderGrad average grade is a " + billy.getLetterGrade());
        System.out.println("Maria's UnderGrad average grade is a " + maria.getLetterGrade());
        System.out.println("Sam's Grad average grade is a " + sam.getLetterGrade());
        System.out.println("Mimi's Grad average grade is a " + mimi.getLetterGrade());

    }
}
