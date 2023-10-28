import java.util.Scanner;

public class FindTransitionPoint {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i=0; i<20; i++){
            int a = sc.nextInt();
            arr[i]=a;
        }

        for(int i=0; i<20; i++){
            if(arr[i-1]!=arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
