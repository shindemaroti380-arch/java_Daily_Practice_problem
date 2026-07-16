import java.util.Scanner;

public class name_print {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Hello " + name + ", have a good day!");

        sc.close();
    }
}
