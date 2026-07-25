import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are an adult.");
                break;

            case 24:
                System.out.println("You can join a job.");
                break;

            default:
                System.out.println("Enjoy your life.");
        }

        System.out.println("Thank you.");

        
    }
}
