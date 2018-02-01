import java.util.Scanner;

public class Jan27th_3 {
    private static void p1(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3==0){
                sum+=i;
            }  
            else if(i%5==0){
                sum+=i;
            } 
        }
        System.out.println(sum);
    }

    private static void p2(){
        int sum = 0;
        for(int i=1, j=2; j <= 4000000;){
            if(j%2 == 0){
                sum += j;
            }
            int temp = i;
            i = j;
            j += temp;  
        }
        System.out.println(sum);
    }

    private static void p3(int n){
        int max = 1;
        for(int i=2; n != 1 && i <= n;){
            if(n%i == 0){
                n /= i;
                max = i;
            }
            else{
                i++;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // p1(n);
        p3(13195);
        
    }

}