import java.util.Scanner;
public class inputfromuser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        System.out.println("Enter a name:");
        String name=scan.nextLine();
        System.out.println("Enter a Character:");
        char ch=scan.next().charAt(0);
        Systtem.out.println(num);
        System.out.println(name);
        System.out.println(ch);
    }
}
