import java.util.Scanner;
/* THIS WAS TO BE SUBMITTED BY 10PM
*
Dora is interested so much in gardening and she plants more trees in her garden.
* She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees in row-wise order.
* She planted the mango tree only in a 1st row, 1st column and last column. So given the tree number, your task is to find whether the given tree is a mango tree or not?
* Write a program to check whether the given number is a mango tree or not.
* Input consists of 3 integers The first input denotes the number of rows The second input denotes the number of columns The third input denotes the tree number, which you have to find whether it's a mango tree or not.
* Case 1: Input 5 5 11
*  Output yes


*
*  */

public class Task1 {
    public static void main(String []args)
    {
        Scanner myObj = new Scanner(System.in);
        int noOfRows=myObj.nextInt();
        int noOfCol=myObj.nextInt();
        int rowindex=myObj.nextInt();
        int colindex=myObj.nextInt();
        String isMango="no";
        for(int i=1;i<=noOfRows;i++) {
            if(rowindex==i && colindex==1)
                isMango="yes";
            if(rowindex==i && colindex==noOfCol)
                isMango="yes";
        }
        for(int i=1;i<=noOfCol;i++) {
            if(rowindex==1 && colindex==i)
                isMango="yes";
        }
        System.out.println(isMango);


    }

}


