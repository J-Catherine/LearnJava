public class Apr12th_41{
    static int MAXN = 65;
    static long n;
    static long[] x = new long[MAXN];

    private static boolean IsPrime_silly(int p){
        if((p % 10) % 2 == 0 || (p % 10) % 5 == 0){
            return false;
        }
        double b = Math.sqrt(p);
        for(int i = 2; i <= b; i++){
            if(p % i == 0){
                return false;
            }
        }
        return true;
    }

    // private static long multi(long a, long b, long p) {
    //     long ans = 0;
    //     while(b != 0) {
    //         if((b&1) != 0) ans = (ans+a)%p;
    //         a = (a+a)%p;
    //         b >>= 1;
    //     }
    //     return ans;
    // }

    private static long qpow(long a, long b, long p) {
        long ans = 1;
        while(b!=0) {
            if((b&1) != 0) ans = (ans*a)%p;
            a = (a*a)%p;
            b >>= 1;
        }
        return ans;
    }

    private static boolean IsPrime(long n) {
        if(n == 2) return true;
        int s = 5, i, t = 0;
        long u = n-1;
        while((u & 1) == 0) {
            t++;
            u >>= 1;
        }
        while(s-- != 0) {
            long a = (long)(Math.random()*(n-2)+2);
            x[0] = qpow(a, u, n);
            for(i = 1; i <= t; i++) {
                x[i] = (x[i-1]*x[i-1])%n;
                if(x[i] == 1 && x[i-1] != 1 && x[i-1] != n-1) return false;
            }
            if(x[t] != 1) return false;
        }
        return true;
    }
    private static void p41(){
        int temp = 0;
        int max = 0;
        for(int i = 7654321; i >= 1234567; i--){
            int flag = 1;
            int[] b = new int[10];
            int j = 0;
            temp = i;
            for(j = 0; temp > 0; j++){ // j is the number of digits
                if(b[temp % 10] == 1){
                    flag = 0;
                    // continue;
                    break;
                }
                b[temp % 10] = 1;
                temp /= 10;
            }
            for(int k = 1; k <= j; k++){
                if(b[k] == 0){
                    flag = 0;
                }
            }
            if(flag == 0){
                continue;
            }
            if(IsPrime_silly(i)){
                max = i>max?i:max;
                break;
                // System.out.printf("max: %d\n", max);
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        p41();
    }
}