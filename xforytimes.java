import java.util.Scanner;
public class xforytimes{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for X :");
        int x=scan.nextInt();
        System.out.println("Enter a value for Y:");
        int y=scan.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
    }
}
