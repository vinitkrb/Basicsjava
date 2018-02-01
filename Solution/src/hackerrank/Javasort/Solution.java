package hackerrank.Javasort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student
{
	   int id;
	   String fname;
	   double cgpa;
	   public Student(int id, String fname, double cgpa)
	   {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() 
	   {
	      return id;
	   }
	   public String getFname() 
	   {
	      return fname;
	   }
	   public double getCgpa()
	   {
	      return cgpa;
	   }
	}
class Checker implements Comparator<Student>
{
@Override
public int compare(Student a,Student b)
    {
    int x = (int)(a.cgpa*1000);
    int y = (int)(b.cgpa*1000);
    return (x==y ? (a.fname==b.fname ? a.id-b.id : a.fname.compareTo(b.fname)):(x < y ? 1 : -1));

}
}


public class Solution
{
	 public static void main(String[] args)
	 {
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	         in.close();
}
}
