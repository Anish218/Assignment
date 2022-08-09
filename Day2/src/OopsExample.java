class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name,int day,String month)
    {
        this.day=day;
        this.month=month;
        this.name=name;
    }
    public boolean inSameMonth(String month1,String month2)
    {
        return (month1.equals(month2));
    }


}

public class OopsExample {
    public static void main(String[] args) {

    }
}
