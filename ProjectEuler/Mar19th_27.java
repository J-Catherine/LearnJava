
public class Mar19th_27{ 
    private static boolean isPrime(int b){
        double tmp = Math.sqrt(b);
        for(int i = 2; i <= tmp; i++){
            if(b % i == 0){
                return false;
            }
        }
        return true;
    }
    private static void p27(){
        int max = 0;
        int A = 0, B = 0, N = 0;
        int count = 0;
        for(int a = -999; a < 1000; a += 2){
            for(int b = 0; b < 1000; b++){
                if(isPrime(b)){
                    int sum = 2;
                    count = 0;
                    for(int n = 0; ; n++){
                        sum = n * n + n * a + b;
                        if(sum > 0 && isPrime(sum)){
                            count++;
                        }
                        else{
                           // System.out.printf("")
                           if(count > max){
                                max = count;
                                A = a;
                                B = b;
                                N = n;
                            }
                            break;
                        }
                    }
                    
                }
            }
        }
        int x = A * B;
        System.out.printf("max:%d, A :%d, B:%d, n:%d, muti:%d\n",max, A, B,N, x);
        // for(int a = -63; a < 1000; a += 2){
        //     for(int b = 0; b < 1000; b++){
        //         if(isPrime(b)){
        //             long sum = 2;
        //             count = -1;
        //             for(int n = 0; isPrime(sum); n++,count++){
        //                 sum = n * n + n * a + b;
        //             }
        //             if(count > max){
        //                 max = count;
        //             }
        //         }
        //     }
        // }
    }
    public static void main(String[] args){
        p27();
    }
    
}