import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<=arr[n-1];i++){
            int f=0;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.print(i+" ");
            }
        }

    }
}
