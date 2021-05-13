import java.util.*;
class pi_using_zeta
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long i;
        int a=1;
        double sum,pi;
        while(a>0)
        {
            sum=0;
            System.out.println("\f");
            System.out.println("Enter precision limit");
            long p=in.nextLong();
            for(i=1;i<p+1;i++)
            {
                sum+=Math.pow(i,-2);
            }
            pi=Math.sqrt(6*sum);
            System.out.println("Value of pi = "+pi);
            a=in.nextInt();
        }
    }
}