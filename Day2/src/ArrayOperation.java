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
    }
}
