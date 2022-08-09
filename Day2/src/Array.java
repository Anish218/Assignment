import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int studentsize=sc.nextInt();
        int students[]=new int[studentsize];
        int maximumMarks=0;
        int rollnumber=-1;
        for(int i=0;i<studentsize;i++)
        {
            students[i]=sc.nextInt();
            if(students[i]>=maximumMarks)
                rollnumber=i+1;
        }
        System.out.println(rollnumber);

    }
}
