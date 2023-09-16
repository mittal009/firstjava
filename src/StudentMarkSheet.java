public class StudentMarkSheet
{

    static StudentMarkSheet studentmarksheet = new StudentMarkSheet();

    public static void main(String[] args)
    {
      studentmarksheet.totalMarks(90,85,95);
      studentmarksheet.totalMarks( 80,50,60);
      studentmarksheet.totalMarks(40,50,60);
    }
    void totalMarks(int Maths,int Sci ,int English)
    {
        System.out.println("total marks"+" = "+(Maths+Sci+English));
    }

}
