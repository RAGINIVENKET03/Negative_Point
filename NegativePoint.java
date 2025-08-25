import java.util.*;
class NegativePoint
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the prime number: ");
        int p=obj.nextInt();
        System.out.println("Enter the x point value: ");
        int x1=obj.nextInt();
        System.out.println("Enter the y point value: ");
        int y=obj.nextInt();
        int y1=0;
        if(y%p==0)
        {
            y1=0;
        }
        else if(y<0)
        {
            y1=p+(y%p);
        }
        else
        {
            y1=p-(y%p);
        }
        System.out.println("-P: ("+x1+","+y1+")");
        obj.close();
    }
}
