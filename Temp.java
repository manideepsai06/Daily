import java.util.*;
public class Temp {
    public void FarToCel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature:");
        double a=sc.nextInt();
        double res=5*(a-32)/9;
        System.out.println("Temperature in celcius is :"+res);
        sc.close();
    }
    public void CelToFar(){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter temperature:");
         
        double a=sc.nextInt();
        double res=(9*a-160)/5;
        System.out.println("Temperature in farenhiet is :"+ res);
        sc.close();
    }
     public static void main(String[] args) {
        Temp fun=new Temp();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select any one of two:\n1.Farenhiet to celcius\n2.Celcius to Farenhiet");
        int b=sc.nextInt();
        switch(b){
            case 1:
            fun.FarToCel();
            break;
            case 2:
            fun.CelToFar();
            break;
        }
        sc.close();
    }
}
