import java.util.*;
public class function{
    public static int getGreater(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        
        }
    }
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int sum=getGreater(a,b);
    System.out.println(sum);
}
}

    

