import java.util.Scanner;
class pattern4{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for(int i=1;i<=n;i++){
for(int k=1;k<=i-1;k++){
System.out.print(" ");
}
for(int j=1;j<=(2*n)-(2*i-1);j++){
System.out.print("*");
}
System.out.println();
}
}
}
