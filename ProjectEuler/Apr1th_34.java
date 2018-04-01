public class Apr1th_34{
    private static void p33(){
        int[] a = {1,1,2,6,24,120,720,5040,40320,362880};
        int sum = 0;
        int res = 0;
        for(int i = 3; i < 362881; i++){
            sum = 0;
            for(int temp = i; temp > 0;){
                sum += a[(temp % 10)];
                temp /= 10;
            }
            if(sum == i){
                res += sum;
                System.out.println(i);
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        p33();
    }
}