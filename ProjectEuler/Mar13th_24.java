public class Mar13th_24{
    
    static int[] val1 = new int[1002];
    static int[] val2 = new int[1002];
    static int[] val3 = new int[1002];
    
    private static void plus(int num){
        for(int len = 1; ; num++){
            for(int i = 0; i < len; i++){
                val3[i] = val1[i];
            }
            for(int i = 0 ; i < len; i++){
                val1[i] += val2[i];
                val2[i] = val3[i];
                if(val1[i] > 9){
                    val1[i + 1]++;
                    val1[i] -= 10;
                }   
            }
            if(val1[len] > 0){
                len++;
            }
            // for(int i=len-1;i>=0;i--){
            //     System.out.print(val1[i]);
            // }
            // System.out.print(" ");
            // for(int i=len-1;i>=0;i--){
            //     System.out.print(val2[i]);
            // }
            // System.out.print(" ");
            // for(int i=len-1;i>=0;i--){
            //     System.out.print(val3[i]);
            // }
            // System.out.println();
            if(len == 1000){
                System.out.print(num);
                break;
            }
        }
    }
    private static void p24(){
        val1[0] = 1;
        val2[0] = 1;
        plus(2);
    }
    public static void main(String[] args){
        p24();
    }
}