import java.util.Scanner;
class triangleornot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first angle:");
        int angle1=scan.nextInt();
        System.out.println("Enter a second angle:");
        int angle2=scan.nextInt();
        System.out.println("Enter a third angle:");
        int angle3=scan.nextInt();
        if(angle1+angle2+angle3 == 180){
            System.out.println("Triangle can be formed");
        }
        else{
            System.out.println("Triangle cannot be formed");
        }

    }
}
