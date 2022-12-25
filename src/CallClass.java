public class CallClass {
    public static void main(String[] args) {

        Student student1 = new Student("Mg Mg",12,70,100);
        Student student2 = new Student("Kyaw Kyaw",17,40,30);
        Student student3 = new Student();


        student1.getter();
        student2.getter();
        student3.getter();


        student1.testExam();
        student2.testExam();

        System.out.println("School name is : "+ Student.SchoolName);

    }
}
