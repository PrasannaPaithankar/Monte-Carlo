/*This program generates several(n) random arrays of 1 and 0 
and then displays number of arrays having some number of 1s naturally showing gaussian distribution*/  
import java.util.*;
class statistical2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,c,a,f=0;
        int ar1[]=new int[100];
        int ar2[]=new int[100];
        long k,n;
        while((f<10)&&(f>(-1)))
        {
            System.out.println("\f");
        for(i=0;i<100;i++)
        {
            ar1[i]=0;
        }
        System.out.println("Enter number of iterations");
        n=in.nextLong();
        for(k=0;k<n;k++){
        for(i=0;i<100;i++)
        {
            a=(int)Math.floor((Math.random())*2);
            if(a==2){a=1;}
            ar2[i]=a;
        }
        c=0;
        for(i=0;i<100;i++)
        {
            if(ar2[i]==1)
            {
                c++;
            }
        }
        ar1[c]++;
    }
        for(i=0;i<100;i++)
        {
            System.out.println(i+"   "+ar1[i]);
        }
        f=in.nextInt();
    }
    }
}