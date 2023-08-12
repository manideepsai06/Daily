import java.lang.reflect.Array;

public class Strrev {
    public static void main(String Args[]){
    String st="MANINAM";
    String reverse="";
    int strlen=st.length();
    for(int i=(strlen-1);i>=0;i--){
        reverse+=st.charAt(i);
    }
   System.out.println(reverse);
   if(st.equals(reverse)){
    System.out.println("palindrome");
   }
}
}