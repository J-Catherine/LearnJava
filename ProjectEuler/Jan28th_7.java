public class Jan28th_7{

    private static boolean IsPalindrome(int n){
        int ren = 0;
        int temp = n;
        while (temp != 0){
            ren = ren * 10 + temp % 10;
            temp /= 10;
        }
        return ren == n;
    }
    
    private static void p4(){
        int p = 0;
        int max = 1;
        for(int i = 999; i > 0; i--){
            for(int j = i; j > 0; j--){
                p = i * j;
                if (IsPalindrome(p)){
                    max = Math.max(max, p);
                    break;
                }
            }
            if (i * i < max) {
                break;
            }
        }
        System.out.println(max);
    }
    
    // private static void p5z(){
    //     int i = 1;
    //     for (int n = 1; n <= 20; n++){
    //         int j = n;
    //         int m;
    //         for (int k = i; j != 0; j = m)
    //         {
    //             m = k % j;
    //             k = j;
    //         }
    //         i = i / k * n;
    //     }
    //     System.out.println(i);
    // }
    
    private static void p5()
    {
        int[] nums = new int[21];
        for(int i = 0; i < 21; i++){
            nums[i] = 0;
        }
        for(int i = 2; i <= 20; i++){
            int temp = i;
            for(int j = 2; j <= i; j++){
                int count = 0;
                while(temp % j == 0){
                    temp /= j;
                    count++;
                }
                if(count > nums[j]){
                    nums[j] = count;
                }
            }
        }
        long mutivalue = 1L;
        for(long m = 2; m <= 20; m++){
            for(int k = 0; k < nums[(int)m]; k++){
                mutivalue *= m;
            }
        }
        System.out.println(mutivalue);
    }
    
    public static void p6(){
        int sqrtsum = 0;
        int sumsqrt = 0;
        for(int i = 1; i <= 100; i++){
            sqrtsum += i * i;
            sumsqrt += i;
        }
        sumsqrt *= sumsqrt;
        System.out.println(sumsqrt - sqrtsum);
    }
    
    private static boolean Prime(long paramLong){
        if (paramLong < 2) {
            return false;
        }
        double d = Math.sqrt(paramLong);
        for(int i = 2; i <= d; i++){
            if (paramLong % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void p7(){
        int i = 1;
        long n = 2;
        while (i != 10001){
            n++;
            if (Prime(n)) {
                i++;
            }
        }
        System.out.println(n);
    }
    
    public static void main(String[] paramArrayOfString){
        // p4();
        // p5();
        // p6();
        // p7();
    }
}
