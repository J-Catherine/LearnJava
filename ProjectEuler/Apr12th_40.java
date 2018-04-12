public class Apr12th_40{
    private static void p39(){
        int max = 0;
        int val = 12;
        int c = 0;
        for(int p = 12; p < 1000; p++){
            int num = 0;
            for(int a = 1; a < p - 1; a++){
                for(int b = 1; b <= a; b++){
                    c = p - a - b;
                    if(c * c == a * a + b * b){
                        num++;
                    }
                }
            }
            if(num > max){
                val = p;
                max = num;
            }
        }
        System.out.println(val);
        //System.out.println(max);
    }
    private static void p40(){
        int d = 1;
        int x = 10;
        int muti = 1;
        int temp = 0;
        for(int i = 1, j = 1; x < 1000001; i++){ //1000000
            //j:count the number of digits
            if(j <= x && j + d >= x){
                int[] a = new int[100];
                int k = 0;
                temp = i;
                for(k = 0; temp > 0; k++){
                    a[k] = temp % 10;
                    temp /= 10;
                    //System.out.printf("%d : %d\n",k,a[k]);
                }
                for(int m = 0; m < k; m++){
                    if(j + m == x){
                        muti *= a[k- m -1];
                    }
                }
            }
            if(i == x){
                x *= 10;
                d++;
                //System.out.printf("d:%d\n",d);
            }
            j += d;
        }
        System.out.printf("muti:%d\n",muti);
    }
    public static void main(String[] args){
        //p39();
        p40();
    }
}