import java.util.Scanner;
public class chw_19question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter your marks in physics");
        m1 = sc.nextInt();
        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextInt();
        System.out.println("Enter your marks in mathmatics");
        m3 = sc.nextInt();
        int avg = (m1 + m2 + m3)/3;
        System.out.println("total no of perctange");
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congrulation you are passsed");
    
        }else{
            System.out.println("you are failed");
        }
    }


    
}
