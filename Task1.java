import java.util.Scanner;
/* THIS WAS TO BE SUBMITTED BY 10PM */

public class Task1 {
    public static void main(String []args)
    {
        Scanner myObj = new Scanner(System.in);
        int noOfRows=myObj.nextInt();
        int noOfCol=myObj.nextInt();
        int indexToFind1=myObj.nextInt();
        int indexToFind2=myObj.nextInt();
        String isMango="no";
        for(int i=1;i<=noOfRows;i++) {
            if(indexToFind1==i && indexToFind2==1)
                isMango="yes";
            if(indexToFind1==i && indexToFind2==noOfCol)
                isMango="yes";
        }
        for(int i=1;i<=noOfCol;i++) {
            if(indexToFind1==1 && indexToFind2==i)
                isMango="yes";
        }
        System.out.println(isMango);


    }

}


