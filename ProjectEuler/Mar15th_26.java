public class Mar15th_26{
    private static void p26(){
        //first we need find prime factors of the number
        long[] n = new long[1001];
        int count = 1;
        for(int i = 1; i < 1000; i++){
            int temp = i;
            for(; temp % 2 == 0;){
                temp /= 2;
            }
            for(; temp % 5 == 0;){
                temp /= 5;
            }
            int x = 1;
            for(int j = 1; j <= temp; j++){
                x *= 10;
                x %= temp;
                if(x == 1){
                    n[i] = j;
                    break;
                }
            }
        }

        int max = 1; 
        for(int i = 1; i < 1000; i++){
            if(n[i] > n[max]){
                max = i;
            }
        }
        System.out.println(max);
    }

    //     int max = 0;
    //     int num = 0;
    //     for(int i = 1; i < 10; i++){
    //         long temp = 9;
    //         for(; ;){
    //             if(temp % n[i] == 0){
    //                 n[i] = temp / n[i];
    //                 for(int j = 0; ; j++){
    //                     if(n[i] > 0){
    //                         n[i] /= 10;
    //                     }
    //                     else if(n[i] == 0){
    //                         if(j > max){
    //                             max = j;
    //                             num = i;
    //                         }
    //                         break;
    //                     }
    //                 }
    //                 break;
    //             }
    //             else{
    //                 temp = temp * 10 + 9;
    //             }
    //         }
    //     }
    //     System.out.printf("max is %d, the number is %d", max, num);
    // }
    public static void main(String[] args){
        p26();
    }
}