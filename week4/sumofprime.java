import java.util.ArrayList;
class sumofprime {
    public static void main(String[] args) {
        int m=10;
        int n=20;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> li=new ArrayList<>();
        for(int j=0;j<=n;j++){
            li.add(true);
        }
        for(int i=2;i*i<n;i++){
            if(li.get(i)){
                for(int k=2*i;k<=n;k=k+i){
                    li.set(k,false);
                }
            }
        }
        int sum=0;
        for(int i=m;i<=n;i++){
            if(li.get(i)){
               list.add(i);
               sum=sum+i;
            }
        }

        System.out.println(sum);
    }
}