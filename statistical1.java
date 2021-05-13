/*This program creates a m*m dimensional array having one quanta in each cell.
 It then randomly shifts quanta from one cell to another in n iterations.
 Finally it outputs the how many cells are having specific number of quantums displaying boltzmann distribution*/
import java.util.*;
class statistical1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,e,a,b,c,d,m,f=0;
        int ar2[]=new int[50];
        long k,n;
        while((f<10)&&(f>(-1)))
        {
            System.out.println("\f");
        System.out.println("Enter square array dimension");
        m=in.nextInt();
        int ar1[][]=new int[m][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                ar1[i][j]=1;
            }
        }
        System.out.println("Enter number of iterations");
        n=in.nextLong();
        for(k=0;k<n;k++)
        {
            a=(int)Math.floor((Math.random())*m);
            b=(int)Math.floor((Math.random())*m);
            c=(int)Math.floor((Math.random())*m);
            d=(int)Math.floor((Math.random())*m);
            if((ar1[a][b])!=0)
            {
                ar1[a][b]=ar1[a][b]-1;
                ar1[c][d]=ar1[c][d]+1;
            }
            else 
            {
                ar1[a][b]=ar1[a][b];
                ar1[c][d]=ar1[c][d];
            }
        }
        for(i=0;i<50;i++)
        {
            ar2[i]=0;
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                e=ar1[i][j];
                ar2[e]=ar2[e]+1;
            }
        }
        for(i=0;i<50;i++)
        {
            System.out.println(i+"   "+ar2[i]);
        }
        f=in.nextInt();
    }
    }
}
            