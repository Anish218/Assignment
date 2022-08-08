import java.util.Scanner;

public class Task2 {
    public static void main(String []args)
    {
        Scanner myObj = new Scanner(System.in);
        int firstNumber=myObj.nextInt();
        int currentNumber=firstNumber;
        while(currentNumber!=1)
        {
            System.out.print(currentNumber+" ");
            if((currentNumber | 1) ==currentNumber+1)
            {
                currentNumber/=2;
            }
            else
                currentNumber=3*currentNumber+1;

        }
        System.out.println(1);


    }
}
