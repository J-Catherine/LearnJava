public class Mar12th_23{
    //find the sum of the number's proper divisors
    static int x = 28123;
    private static int FindSumFactor(int num){
        int sumF = 1; 
        int i = 0; 
        for(i = 2 ; i * i < num; i++){  
            if(num % i == 0){
                sumF += i + num / i;
            }  
        }
        if(i * i == num){
            sumF += i;
        }
        return sumF;
    }

    private static void p23(){
        int[] a = new int[100000]; //abundant number
        int count = 0;//count the number of yingshu
        for(int i = 1; i <= x; i++){
            int temp = FindSumFactor(i);
            if(temp > i){
                a[count++] = i;
            }
        }
        //a[count] every value plus
        int[] res = new int[x+1];
        for(int i = count - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                int temp = a[i] + a[j];
                if(temp <= x){
                    res[temp] = 1;
                }
            }
        }
        int sum = 0;
        for(int i = 1; i <= x; i++){
            if(res[i] == 0){
                sum += i;
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        p23();
    }
}