public class Feb2nd_12{
    private static int istang500(int n){
        int muti = 1;
        int[] a = new int[100000];
        a[0] = -1;
        //找质因子
        for(int i = 2; i <= n; i++){
            a[i] = 0;
            while(n % i == 0){
                n /= i;
                a[i]++;  
            }
            muti *= a[i]+1;
        }
        return muti;
    }    
    private static void p12(){
        for(int i = 1; i < 100000; i++){
            if(istang500(i*(i+1)/2) >= 500){
                System.out.println(i*(i+1)/2);
                break;
            }
        }
    }

    public static void main(String[] args){
        p12();
    }
}