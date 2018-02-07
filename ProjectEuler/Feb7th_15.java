import java.util.*;

public class Feb7th_15{
    private static void p14(){
        long max = 0, num = 0;
        Map<Long, Long> m = new HashMap<Long, Long>();
        for(long i = 1; i <= 1000000; i++){
            long n = 0;
            for(long j = i; j != 1;){
                if(m.get(j) != null){
                    n += m.get(j);
                    break;
                }
                if(j % 2 == 0){
                    j /=2;
                }
                else{
                    j = 3 * j + 1;
                }
                // System.out.println(j);
                n++;
            }
            m.put(i,n);
            // System.out.println(i);
            if(n > max){
                max = n;
                num = i;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
    public static void main(String[] args) {
        p14();
    }
}