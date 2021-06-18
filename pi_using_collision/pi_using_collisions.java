import java.util.*;
class pi_using_collisions
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long i,n;
        int a=1;
        double c,pi,my,vx,vy,vx1,vy1;
        while(a>0)
        {
            c=0;
            System.out.println("Enter mass exponent");
            n=in.nextLong();
            my=Math.pow(100,n);
            vx=0;
            System.out.println("Enter initial velocity");
            vy=in.nextDouble();
            vy=-1*vy;
            vx1=vx;
            vy1=vy;
            
            for(i=0;;i++)
            {
                if((vy<0)&&(vx<=0)&&((vx-vy)>0))
                {
                    vx=(((1-my)*vx1)+(2*my*vy1))/(1+my);
                    vy=((2*vx1)-((1-my)*vy1))/(1+my);
                    vx1=vx;
                    vy1=vy;
                    c++;
                    System.out.println("bump");
                }
                else if((vy>=0)&&(vx>0)&&((vy-vx)<0))
                {
                    vx=(((1-my)*vx1)+(2*my*vy1))/(1+my);
                    vy=((2*vx1)-((1-my)*vy1))/(1+my);
                    vx1=vx;
                    vy1=vy;
                    c++;
                    System.out.println("bump");
                }
                else if((vy<0)&&(vx>0))
                {
                    vx=(((1-my)*vx1)+(2*my*vy1))/(1+my);
                    vy=((2*vx1)-((1-my)*vy1))/(1+my);
                    vx1=vx;
                    vy1=vy;
                    c++;
                    System.out.println("bump");
                }
                else if((vy<=0)&&(vx<0)&&((vy-vx)>0))
                {
                    vx=-1*vx;
                    vx1=vx;
                    c++;
                    System.out.println("wall");
                }
                
                else if((vy>=0)&&(vx<0))
                {
                    vx=-1*vx;
                    vx1=vx;
                    c++;
                    System.out.println("wall");
                }
                else if((vy>=0)&&(vx>=0)&&((vy-vx)>=0))
                {
                    break;
                }
            }
            pi=c/(Math.pow(10,n));
            System.out.println("Value of pi = "+pi);
            a=in.nextInt();
        }
    }
}    