import java.util.Scanner;
class calculator 
{
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }
}


public class Method1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        calculator c= new calculator();
      
        int a,b;
        System.out.println("Enter the value of firt no.");
         a = scan.nextInt();
         System.out.println("Enter the value of Second no.");
         b = scan.nextInt();

        c.add(a,b);

        
    }


    
}
