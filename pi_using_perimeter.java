import java.util.*;
class pi_using_perimeter
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long i,j;
        int a=1;
        double c=0,pi,dist;
        while(a>0)
        {
            c=0;
            System.out.println("\f");
            System.out.println("Enter precision limit");
            long p=in.nextLong();
            long d=(2*p)+1;
            double r=(double)(2*p);
            for(i=0;i<p;i++)
            {
                for(j=0;j<p;j++)
                {
                    dist=Math.sqrt(Math.pow((p-i),2)+Math.pow((p-j),2));
                    if((dist<(p+0.502))&&(dist>(p-0.502)))
                    {
                        c++;
                    }
                }
            }
            System.out.println("Number of squares on the circumference = "+c);
            pi=((4*c)+4)/r;
            System.out.println("Value of pi = "+pi);
            a=in.nextInt();
        }
    }
}
            
            
            
            
            
            
            
            