import java.util.Scanner;
class multiplesofx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for X:");
        int x=scan.nextInt();
        for(int i=1;x*i<=1000;i++){
            System.out.println(x*i);
        }
    }
}
