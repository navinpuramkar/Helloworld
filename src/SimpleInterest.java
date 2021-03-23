import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args)
{
    double principalAmount,time,rate;
    Scanner scan=new Scanner(System.in);
    SimpleInterest in=new SimpleInterest();
    principalAmount=scan.nextDouble();
    time=scan.nextDouble();
    rate=scan.nextDouble();
    scan.close();
    System.out.println(in.simpleInterest(principalAmount,time,rate));

}
    public Double simpleInterest(double p,double t,double r)
    {
        return (p*t*r)/100;
    }
}

