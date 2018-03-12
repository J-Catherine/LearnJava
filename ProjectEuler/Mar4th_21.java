
public class Mar4th_21{
    //find the sum of factor
    private static int FindSumFactor(int num){
        int sumF = 1;  
        int limit = (int)Math.sqrt(num);  
        for(int i = 2 ; i <= limit; i++){  
            if(num % i == 0)  
                sumF += i + num / i;  
        }  
        return sumF;   
    }
    private static void p21(){
        int sum = 0;
        int[] a = new int[10000];
        a[1] = 1;
        for(int i = 1; i < 10000; i++){
            a[i] = FindSumFactor(i);
            if(a[i] <= i){
                if(a[a[i]] == i && a[i] != i){
                    System.out.printf("%-5d and %-5d are an amicable pair.\n",a[i],i);
                    sum += i;
                    sum += a[i];
                }
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        p21();
    }
}
