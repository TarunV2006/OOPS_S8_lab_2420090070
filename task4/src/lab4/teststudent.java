package lab4;
import java.util.Scanner;
public class teststudent {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
        student_details s1=new student_details();
        
        s1.setDetails(478, 9.43f, "Vissu");
        s1.showDetails();
           
        s1.rollno=420;
        s1.grade=0.23f;
        s1.name="Hello";
        s1.showDetails();
  }

}