import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sizeofarray=sc.nextInt();
        int elements[]=new int[sizeofarray];
        int mean=0;
        int count[]=new int[sizeofarray+1];
        for(int i=0;i<sizeofarray;i++)
        {
            elements[i]=sc.nextInt();
            count[elements[i]]+=1;
            mean+=elements[i];

        }
        double meanvalue=(double)mean/sizeofarray;
        System.out.println("Mean of the array is "+ meanvalue);
        Arrays.sort(elements);
        if((sizeofarray | 1)==sizeofarray+1)
        {
            int sumOfMiddleElements = elements[sizeofarray / 2] +
                    elements[sizeofarray / 2 - 1];
            System.out.println("medain of array is "+ sumOfMiddleElements/2);
        }
        else
            System.out.println("median of array is "+ (elements[sizeofarray/2]));
            int maximumcount=0;
            int indexmaximumelement=0;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>maximumcount){
                indexmaximumelement=i;
            maximumcount=count[i];}
        }
        System.out.println("element with maximum count " +indexmaximumelement);
    }
}
