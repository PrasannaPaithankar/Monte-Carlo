/*This program creates a chess board an which on coin is placed on initial position and target position is set.
 * The coin randomly makes moves(up, down, left, right) on the board till it reaches the target positions and
 * the number of steps to reach target is recorded. This is iterated number of times and the number of steps of 
 * each iteration is averaged.*/
import java.util.*;
class statistical3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,p1,p2,r,a=1;
        long k,n;
        double sum=0,c;
        while(a>0)
        {
        
        System.out.println("Enter dimensions of box");
        int d=in.nextInt();
        int ar1[][]=new int[d][d];
        System.out.println("Enter number of iterations");
        n=in.nextLong();
        System.out.println("Enter initial position");
        int a1=in.nextInt();
        int a2=in.nextInt();
        System.out.println("Enter target position");
        int b1=in.nextInt();
        int b2=in.nextInt();
        System.out.println("Shortest path= "+(Math.abs(b1-a1)+Math.abs(b2-a2)));
        for(i=0;i<d;i++)
        {
            for(j=0;j<d;j++)
            {
                ar1[i][j]=0;
            }
        }
        for(k=0;k<n;k++)
        {
            c=0;
        
        p1=a1;
        p2=a2;
        for(i=0;;i++)
        {
            r=(int)Math.floor(Math.random()*4);
        if(r==4)
        {
            r=3;
        }
            if((p1==0)&&(r==0))
            {
                p1++;
            }
            else if((p1==(d-1))&&(r==2))
            {
                p1--;
            }
            else if((p2==0)&&(r==3))
            {
                p2++;
            }
            else if((p2==(d-1))&&(r==4))
            {
                p2--;
            }
            else
            {
                if(r==0)
                {
                    p1--;
                }
                if(r==1)
                {
                    p2++;
                }
                if(r==2)
                {
                    p1++;
                }
                if(r==3)
                {
                    p2--;
                }
            }
            c++;
            if((p1==b1)&&(p2==b2))
            {
                System.out.println(k+1+"  "+c);
                break;
            }
        }
            sum+=c;
        }
        double avg=sum/n;
        System.out.println("Average steps = "+avg);
         a=in.nextInt();
        }
        
       
        }
    }

            
            
   