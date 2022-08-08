public class Assignment1 {
    public static void main(String []args)
    {
        int x=30;
        int y=40;
        int z=20;
        int n=25;
        int min=Math.min(Math.abs(x-n),Math.min(Math.abs(y-n),Math.abs(z-n)));
        if(x>=n && min==Math.abs(n-x))
            System.out.println("L1");
        else if(y>=n && min==Math.abs(n-x))
            System.out.println("L2");
        else if(z>=n && min==Math.abs(n-x))
            System.out.println("L3");
        else
            System.out.println("anyone");
    }
}