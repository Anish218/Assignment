import java.util.Scanner;

public class Assignment3 {
    public static void main(String []args)
    {
        Scanner myObj = new Scanner(System.in);
        int firstNo=myObj.nextInt();
        int secondNo=myObj.nextInt();
        int lines=myObj.nextInt();
        for(int i=0;i<lines;i++)
        {
            int j=0;
            for( j=0;j<=i;j++) System.out.print(firstNo);
            for( int k=j;k<lines+1;k++) System.out.print(secondNo);
            System.out.println();
        }


    }
}
