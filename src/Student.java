public class Student {
     String name;
     int age, height,score;

     private int securteNo = 123444;

     Student(String name,int age,int height,int score){
          setter(name ,age ,height,score);
     }

     Student(){
          this.name = "undefined name";
     }

     static String SchoolName = "Cu Banmaw";
     void setter(String name,int age,int height,int score){
          this.age = age;
          this.name = name;
          this.height = height;
          this.score = score;
     }

     void getter(){
          System.out.print("Student name is : "+this.name);
          System.out.print(" Student age is : "+this.age);
          System.out.print(" Student score is : "+this.score);
          System.out.print(" Student securte Number is : "+this.securteNo);
          System.out.println(" Student height is : "+this.height);
     }

     void testExam(){
          if(this.score > 50 ){
               System.out.println("Student name "+this.name+ " is passed");
          }else {
               System.out.println("Student name "+this.name+ " is failed");

          }
     }

}
