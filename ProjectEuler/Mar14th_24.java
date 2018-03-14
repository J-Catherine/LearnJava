
public class Mar14th_24{
    static int A = 1000000;
    private static void p24(){
        int[] num = {362880, 40320, 5040, 720, 120, 24, 6, 2, 1};
        int[] n = new int[10];
        int temp = A-1; 
        for(int i = 0; i < 10 && temp !=0; i++){
            n[i] = temp / num[i];
            temp %= num[i];
            System.out.printf("%d, %d\n", i, n[i]);
        }
       
        int[] flag = new int[10];
        for(int i = 0; i < 10; i++){
            int count = n[i];
            for(int j = 0; j < 10; j++){
                if(flag[j] == 0 && count >= 0){
                    count--;
                }
                if(count == -1){
                    n[i] = j;
                    flag[j] = 1;
                    break;
                } 
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.print(n[i]);
        }
        
    }
    public static void main(String[] args){
        p24();
    }
}