
public class Mar20th_29{

    private static void p29(){

        //sqrt(100) = 10 && is not the power of prime are 2,3,5,6,7,10
        int exnum = 0;
        for(int i = 2; i <= 10; i++){
            if(i == 2 || i == 3 || i == 5 || i == 6 || i == 7 || i == 10){
                int[] a = new int[700];
                int temp = i;
                for(int j = 1; temp <= 100; temp *= i, j++){
                    for(int k = 2; k <= 100; k++){
                        if(a[k * j] == 1){
                            exnum++;
                            //System.out.printf("%d: %d   ",j,k*j);
                        }
                        else{
                            a[k * j] = 1;
                        }
                    }
                }
            }
        }
        int num = 99 * 99 - exnum; 
        System.out.println(num);
    }
    public static void main(String[] args){
        p29();
    }
}