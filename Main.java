public class Main 
{

    public static void main(String[] args) 
    {
    daysInMonth(9,2021);
    daysInMonth(2,2020);
    daysInMonth(2,2021);
    }

    static boolean isLeapYear(int year)
    {
        if(year>=1 && year<=9999)
        {
            if((year%4==0) && (year%100!=0) || (year%400==0))
            {
            return true;
            }
        }
        else
        {
            return false;
        }
        return false;
    }

    static void daysInMonth(int month, int year)
    {
        if(month<1 || month>12 || year<1 || year>9999)
        {
            System.out.println(-1);
        }
        switch(month)
        {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println(31);
            break;
        case 2:
            if(isLeapYear(year))
            {
                System.out.println(29);
                break;
            }
            System.out.println(28);
            break;
        case 4: case 6: case 9: case 11:
            System.out.println(30);
            break;
        }
    }
}
