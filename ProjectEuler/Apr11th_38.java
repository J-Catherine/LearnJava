public class Apr11th_38{
    private static void p38(){
        int max = 918273645;
        for(int i = 11; i < 50000; i++){ //start from 11
            int[] a = new int[30]; //store every bit of digital
            int[] b = new int[10];
            int l = 0; //length
            int temp = 0;
            for(int j = 1; l < 9; j++){
                temp = i * j;
                int k = 0;
                for(k = 0; temp != 0; k++){
                    temp /= 10;
                }
                temp = i * j;
                for(int m = k; m > 0; m--, temp /= 10){
                    a[l + m] = temp % 10;
                    b[a[l + m]] = 1;
                }
                l += k;
                //System.out.println(l);
            }
            if(l != 9){
                continue;
            }
            int flag = 1;
            for(int j = 1; j < 10 && flag == 1; j++){
                if(b[j] == 0){
                    flag = 0;
                }
            }
            if(flag == 0){
                continue;
            }
            //System.out.printf("------------");
            int num = 0;
            for(int j = 0; j < 10; j++){
                num *= 10;
                num += a[j];
            }
            //System.out.printf("num:%d \n",num);
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        p38();
    }
}