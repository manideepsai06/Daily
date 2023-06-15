import java.lang.Math;
import java.util.*;
public class Land {
    public void Quad(){
        Scanner sc=new Scanner(System.in);
    double a=sc.nextInt();
    double b=sc.nextInt();
    double c=sc.nextInt();
    sc.close();
    double res=b*b-4*a*c;
    if(res>0){
        double r1=(-b+Math.sqrt(res))/(2.0*a);
        double r2=(-b-Math.sqrt(res))/(2.0*a);
        System.out.println("roots are"+r1+","+r2); 
    }else if(res==0.0){
           double r1=-b/(2.0*a);
           System.out.println("root ="+r1);
    } else{
        System.out.println("no real roots");    }
                                                    }
                                                    public static void main(String[] args) {
                                                        Land con=new Land();
     con.Quad();
    }
}
