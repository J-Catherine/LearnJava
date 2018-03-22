import java.util.Scanner;

public class Mar22th_30{
    private static void p30(){
        int[] a = new int[10];
        int nsum = 0;
        for(int i = 0; i < 10; i++){
            a[i] = i * i * i * i * i;
            //System.out.printf("%d: %d\n", i,a[i]);
        }
        for(int i = 32; i <= 354294; i++){
            String s = String.valueOf(i);
            char[] c = s.toCharArray();
            int sum = 0;
            for(int j = 0; j < c.length; j++){
                sum += a[c[j] - 48];
                //System.out.println(sum);
            }
            if(sum == i){
                //System.out.println(i);
                nsum += i;
            }
        }
        System.out.println(nsum);
    }
    public static void main (String[] args){
        p30();
    }
}