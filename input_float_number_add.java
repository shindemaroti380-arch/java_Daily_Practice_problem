import java.util.Scanner;

public class Float_number {
    public static void main(String[] args){
        System.out.println("give an enter number: ");
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("enter an number 1:");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        System.out.println("enter an number 2");
        float sum = a + b;
        System.out.println("these add two numbers :");
        System.out.println("sum :" + sum);
    }
    
}
