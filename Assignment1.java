import java.util.*;
public class Assignment1 {
    public static void main(String []args)
    {
        Scanner myObj = new Scanner(System.in);
        int x=myObj.nextInt();
        int y=myObj.nextInt();
        int z=myObj.nextInt();
        int n=myObj.nextInt();
        int minimumOfAll=Math.min(Math.abs(x-n),Math.min(Math.abs(y-n),Math.abs(z-n)));
        if(x>=n && minimumOfAll==Math.abs(n-x))
            System.out.println("L1");
        else if(y>=n  && minimumOfAll==Math.abs(n-y))
            System.out.println("L2");
        else if(z>=n && minimumOfAll==Math.abs(n-z))
            System.out.println("L3");
        else
            System.out.println("no room will allocate");
    }
}