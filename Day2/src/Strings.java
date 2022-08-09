import java.util.*;

public class Strings {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        String stringOne=sc.next();
        StringBuffer stringcopy = new StringBuffer(stringOne);
        System.out.println("string reversed " +stringcopy.reverse());
        System.out.println("string length " +stringcopy.length());
        String copystring=stringOne;
        System.out.println("string copied " +copystring);
        String substring=stringOne.substring(3);
        stringOne=stringOne.concat(substring);
        System.out.println("string concatenated " +stringOne);







    }
}
