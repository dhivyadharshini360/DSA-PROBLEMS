import java.util.Scanner;
class countdigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
