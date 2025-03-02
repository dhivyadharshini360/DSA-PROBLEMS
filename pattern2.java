import java.util.Scanner;
class pattern2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = n;
        for(int i = 1; i <= n; i++) {
            for(int j = k; j >= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            k--;
        }
    }
}
