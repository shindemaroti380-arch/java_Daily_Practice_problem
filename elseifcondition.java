mport java.util.Scanner;

public class ElseIfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi-experienced!");
        } else if (age > 36) {
            System.out.println("You are very experienced!");
        } else {
            System.out.println("You are not experienced.");
        }

        
    }
}
