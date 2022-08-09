
/*

Class Teacher of X-A wants to calculate the total of each of her 15 students and give rank for them.
 The teacher has less than an hour to compute and wants to know her class performance.
 The students had taken exams for 5 subjects - Maths, Computer Science, Science, Social Science, English.
 1. She wants to rank each of them.
 2. She wants to know the total of each of them.
 3. She wants to know the top 3 best performers in each subject.
 4. Finally the list of students who are the below average performers must be listed along with their totals, ranks and subjects which they did poor.
 5. Calculate the average of the class performance overall and for each subject.
 Criteria for below average: Marks less than 50.


 */

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Student
{
    private String name;
    private int subjects[]=new int[5];
    private int totalMarks;
    Student(String name,int subjects[])
    {
        this.name=name;
        this.subjects= Arrays.copyOf(subjects,subjects.length);
        int total=0;
        for(int i=0;i<subjects.length;i++)
        {
            total+=subjects[i];
        }
        this.totalMarks=total;

    }
    static void rankThemAll(Student  students[])
    {
        System.out.println("NAME"+"    "+"RANK");
        TreeMap<Integer,String> sortedStudentTotalMarks=new TreeMap<Integer,String>();
        for(int i=0;i<students.length;i++)
        {
            sortedStudentTotalMarks.put(students[i].totalMarks,students[i].name);
        }
        int rank=1;
        for(Map.Entry m:sortedStudentTotalMarks.entrySet()) {
            System.out.println(m.getValue()+"    "+(rank++));
        }
        }
    }



public class StudentsReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student arrayOfStudents[];
        arrayOfStudents=new Student[2];
        for(int i=0;i<2;i++)
        {
            String name=input.next();
            int  maths=input.nextInt();
            int computerScience=input.nextInt();
            int english=input.nextInt();
            int science=input.nextInt();
            int socialScience=input.nextInt();
            int subjects[]={maths,computerScience,english,science,socialScience};
            Student student=new Student(name,subjects);
            arrayOfStudents[i]=student;
        }
        Student.rankThemAll(arrayOfStudents);

    }
}
