import java.util.Scanner;
/* THIS WAS TO BE SUBMITTED BY 10PM
The rules for generating Collatz Sequence are:
 If n is even: n = n / 2 If n is odd: n = 3n + 1
 For example, if the starting number is 5 the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1
 It has been proved for almost all integers, the repeated application of the above rule will result in a sequence that ends at 1.
 The input containing an integer 'n' which denotes the given number.
 Print the numbers in the sequence as output
 Case 1: Input 5
 Output 5 16 8 4 2 1 



* */
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
