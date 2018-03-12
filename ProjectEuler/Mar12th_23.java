public class Mar12th_23{
    //find the sum of the number's proper divisors
    private static int FindSumFactor(int num){
        int sumF = 1;  
        int limit = (int)Math.sqrt(num);  
        for(int i = 2 ; i <= limit; i++){  
            if(num % i == 0)  
                sumF += i + num / i;  
        }  
        return sumF;   
    }

    private static void p23(){
        int[] a = new int[100000]; //abundant number
        int count = 0;
        int flag = 0;
        for(int i = 1; i <= 28123; i++){
            int temp = 0;
            temp = FindSumFactor(i);
            if(temp > i && temp != 5){
                //System.out.printf("%d : %d\n", count, i);
                if(flag == 0){
                    System.out.printf("%d  %d\n",temp ,i);
                    flag = 1;
                }
                a[count++] = i;
            }
        }
        //a[count] every value plus
        int[] res = new int[28124];
        for(int i = count - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                int temp = a[i] + a[j];
                if(temp <= 28123){
                    res[temp] = 1;
                }
            }
        }
        int sum = 0;
        for(int i = 1; i <= 28123; i++){
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