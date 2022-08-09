import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sizeofarray=sc.nextInt();
        int elements[]=new int[sizeofarray];
        int mean=0;
        for(int i=0;i<sizeofarray;i++)
        {
            elements[i]=sc.nextInt();
            mean+=elements[i];

        }
        mean/=sizeofarray;
        System.out.println("Mean of the array is "+ mean);
        Arrays.sort(elements);
        if((sizeofarray | 1)==sizeofarray+1)
        {
            int sumOfMiddleElements = elements[sizeofarray / 2] +
                    elements[sizeofarray / 2 - 1];
            System.out.println("medain of array is "+ (double)sumOfMiddleElements/2);
        }
        else
            System.out.println("median of array is "+ (double)(elements[sizeofarray/2]));

    }
}
