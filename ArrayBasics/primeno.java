import java.util.Scanner;
class primeno {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=2;i<=n;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
    }
}
